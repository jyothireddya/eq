package com.eq.framework.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class Config {
    private static final Properties PROPERTIES = loadProperties();

    private Config() {
    }

    public static String get(String key) {
        String systemValue = System.getProperty(key);
        if (systemValue != null && !systemValue.isBlank()) {
            return systemValue;
        }
        String value = PROPERTIES.getProperty(key);
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Missing configuration: " + key);
        }
        return value;
    }

    public static boolean getBoolean(String key) {
        return Boolean.parseBoolean(get(key));
    }

    public static long getLong(String key) {
        return Long.parseLong(get(key));
    }

    private static Properties loadProperties() {
        Properties properties = new Properties();
        try (InputStream stream = Config.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (stream == null) {
                throw new IllegalStateException("config.properties was not found");
            }
            properties.load(stream);
            return properties;
        } catch (IOException exception) {
            throw new IllegalStateException("Unable to load config.properties", exception);
        }
    }
}