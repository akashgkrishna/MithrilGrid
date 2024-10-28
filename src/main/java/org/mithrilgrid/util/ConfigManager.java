package org.mithrilgrid.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream input = new FileInputStream(
                "src/main/resources/config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            LoggerUtil.error("Failed to load configuration properties.", e);
            throw new RuntimeException("Failed to load configuration properties.", e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
