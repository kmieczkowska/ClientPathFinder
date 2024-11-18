package org.example.Configuration;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationLoader {

    private Properties properties;

    public ConfigurationLoader(String configFilePath) {
        properties = new Properties();
        try (InputStream input = new FileInputStream(configFilePath)) {
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Getter methods to retrieve configuration values
    public String getSerialMode() {
        return properties.getProperty("SERIAL_LOCAL_MODE");
    }


    // Main method for testing
    public static void main(String[] args) {
        ConfigurationLoader config = new ConfigurationLoader("configuration.properties");
        System.out.println("Database URL: " + config.getSerialMode());

    }
}