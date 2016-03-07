package com.learn.framework.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SystemProperty {
    private Logger log = LoggerFactory.getLogger(SystemProperty.class);

    private static final SystemProperty instance = new SystemProperty();
    public static SystemProperty getInstance()
    {
        return instance;
    }

    private SystemProperty() {
        try {
            property = new Properties();
            property.load(new FileInputStream("config/config.properties"));
        } catch (IOException e) {
            log.error("Load system properties fail.", e);
            System.exit(0);
        }
    }

    private Properties property;

    public String getString(String key) {
        return property.getProperty(key, "");
    }

    public String[] getStringL(String key) {
        return property.getProperty(key, "").split(";");
    }
}
