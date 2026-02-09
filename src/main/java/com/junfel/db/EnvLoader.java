package com.junfel.db;

import java.io.InputStream;
import java.util.Properties;

public class EnvLoader {

    private static final Properties props = new Properties();

    static {
        try {
            InputStream input = Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream("application.properties");

            if (input == null) {
                throw new RuntimeException("Application properties file not found!");
            }

            props.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Cannot load application.properties", e);
        }
    }

    public static String getProperty(String key) {
        return props.getProperty(key);
    }
}
