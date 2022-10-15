package UI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {

    private static final String CONFIG = "gradle.properties";
    private static Environment environment;
    private Properties properties;



    /**
     * This method read the config property file.
     */
    public Environment() {
        try (FileInputStream fileReader = new FileInputStream(CONFIG)) {
            properties = new Properties();
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method Instance the environment if this does not exist.
     *
     * @return the instanced Environment.
     */
    public static Environment getInstance() {
        if (environment == null) {
            environment = new Environment();
        }
        return environment;
    }

    /**
     * Get the properties of the file.
     *
     * @param env string name of property setting.
     * @return String that is a property
     */
    public String getEnv(final String env) {
        String property = System.getProperty(env);
        if (property == null) {
            return properties.getProperty(env);
        }
        return property;
    }

    public String getBaseUrl(){
        return getEnv("BaseUrl");
    }
    public String user(){
        return getEnv("user");
    }
    public String password(){
        return getEnv("password");
    }
}
