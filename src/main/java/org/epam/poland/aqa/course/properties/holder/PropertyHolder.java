package org.epam.poland.aqa.course.properties.holder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHolder {
    private final Properties properties = new Properties();
    Logger logger = LoggerFactory.getLogger(PropertyHolder.class);
    public static final String BROWSER_PROPERTIES = "src/test/resources/browser.properties";

    {
        try (FileInputStream fis = new FileInputStream(BROWSER_PROPERTIES)) {
            properties.load(fis);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }

    public String readProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
