package com.leefj.foxnic.sql.demo.generator;

import com.github.foxnic.commons.project.maven.MavenProject;
import com.github.foxnic.generator.config.GlobalSettings;

public class GeneratorUtil {

    public static GlobalSettings initGlobalSettings() {
        GlobalSettings settings = new GlobalSettings();
        settings.setAuthor("LeeFJ");
        settings.setEnableMicroService(false);
        settings.setEnableSwagger(false);
        settings.setRebuildEntity(true);
        return settings;
    }

    public static MavenProject getProject() {
        return new MavenProject(GeneratorUtil.class);
    }
}
