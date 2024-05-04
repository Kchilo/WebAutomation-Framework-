package reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperations {

    static Properties prop = new Properties();

    public static String getPropertyValueByKey(String key) throws IOException {
        // Get the current working directory
        String workingDir = System.getProperty("user.dir");
        
        // Build the complete path to the property file
        String propFilePath = workingDir + "\\src\\test\\resources\\config.properties";

        // Load the properties file
        FileInputStream fis = new FileInputStream(propFilePath);
        prop.load(fis);

        // Get the value by key
        String value = prop.getProperty(key);
        
        // Return the value
        return value;
    }
}


