package UI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Clase que se encarga de leer los datos del archivo de configuración requeridos para
 * la ejecución.
 */
public class Environment {

    private static final String CONFIG = "gradle.properties";
    private static Environment environment;
    private Properties properties;

    /**
     * Método que lee el archivo de configuración gradle properties.
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
     * Método que instancia la clase si es que esta no no fue instanciada.
     *
     * @return la instancia de la clase Environment.
     */
    public static Environment getInstance() {
        if (environment == null) {
            environment = new Environment();
        }
        return environment;
    }

    /**
     * Método que obtiene el contenido del file de configuración.
     *
     * @param env string name del archivo de configuracion.
     * @return String valores del archivo de configuracion.
     */
    public String getEnv(final String env) {
        String property = System.getProperty(env);
        if (property == null) {
            return properties.getProperty(env);
        }
        return property;
    }

    /**
     * Método que devuelve el url.
     *
     * @return String url de la aplicación.
     */
    public String getBaseUrl() {
        return getEnv("BaseUrl");
    }

    /**
     *
     * @return
     */
    public String getToken() {
        return getEnv("ApiToken");
    }

    /**
     *
     * @return
     */
    public String authenticationBaseUri() {
        return getEnv("authentication.baseURI");
    }

    /**
     *
     * @return
     */
    public String getTrackerToken(){
        return getEnv("TrackerToken");

    }

    public String getUser(){
        return getEnv("user");
    }
    public String getPassWord(){
        return getEnv("password");
    }
}
