package com.leefj.foxnic.sql.demo.config;

import com.github.foxnic.commons.cache.Cache;
import com.github.foxnic.commons.cache.DoubleCache;
import com.github.foxnic.commons.cache.ExpireType;
import com.github.foxnic.commons.cache.LocalCache;
import com.github.foxnic.commons.log.Logger;
import com.github.foxnic.dao.cache.CacheProperties;
import com.github.foxnic.dao.cache.DataCacheManager;

import java.util.HashMap;
import java.util.Map;

public class FoxnicDataCacheManager extends DataCacheManager {

    private static FoxnicDataCacheManager instance;

    public static FoxnicDataCacheManager getInstance() {
        return instance;
    }

    private Map<Class,com.github.foxnic.commons.cache.DoubleCache> caches=new HashMap<>();

    public FoxnicDataCacheManager() {
        instance = this;
    }



    private   com.github.foxnic.commons.cache.DoubleCache<String, Object> metaCache;

    @Override
    public void clearAllCachedData() {
        for (com.github.foxnic.commons.cache.DoubleCache cache : caches.values()) {
            cache.clear();
        }
    }

    @Override
    public com.github.foxnic.commons.cache.DoubleCache<String, Object> getMetaCache() {
        //
        if(metaCache!=null) return metaCache;
        //
        String cacheName="foxnic:meta";
        LocalCache<String,Object> local = new LocalCache<>(-1, ExpireType.LIVE);
        metaCache=new DoubleCache<String,Object>(cacheName, local, null);
        return metaCache;
    }

    @Override
    public com.github.foxnic.commons.cache.DoubleCache<String, Object> getEntityCache( Class type) {
        if(this.getCacheProperties()==null) return null;
        CacheProperties.PoCacheProperty property=this.getCacheProperties().getPoCacheProperty(type);

        if(property==null || property.getMode()==null ||property.getMode()==JoinCacheMode.none) return null;
        com.github.foxnic.commons.cache.DoubleCache<String, Object> dc=caches.get(type);
        if(dc==null) {
            String[] ns=type.getName().split("\\.");
            String cacheName="foxnic:data:"+ns[ns.length-2]+":"+ns[ns.length-1];
            LocalCache<String,Object> local =new LocalCache<>(property.getLocalExpire(), ExpireType.LIVE,property.getLocalLimit());
            dc=new DoubleCache<String,Object>(cacheName, local, null);
            caches.put(type,dc);
            return dc;
        }
        return dc;
    }

}
