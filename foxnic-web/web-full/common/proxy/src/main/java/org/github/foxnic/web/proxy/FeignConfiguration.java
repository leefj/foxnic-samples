package org.github.foxnic.web.proxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.*;

@Configuration
public class FeignConfiguration {

	/**
     * 日志级别1
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
