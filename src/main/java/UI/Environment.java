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
     * Método que devuelve el valor de ApiToken de las variables de configuración.
     * @return  String api token del usuario.
     */
    public String getToken() {
        return getEnv("ApiToken");
    }

    /**
     * Método que devuelve el valor de Base uri de las variables de configuración.
     * @return  String base uri de la aplicación.
     */
    public String authenticationBaseUri() {
        return getEnv("authentication.baseURI");
    }

    /**
     * Método que devuelve el valor de tracker token de las variables de configuración.
     * @return  String tracker token de la aplicación.
     */
    public String getTrackerToken(){
        return getEnv("TrackerToken");

    }

    /***
     *  Método que devuelve el nombre de usuario  de las variables de configuración.
     * @return  String nombre de usuario.
     */
    public String getUser(){
        return getEnv("user");
    }

    /***
     * Método que devuelve el password de usuario  de las variables de configuración.
     * @return  String password de usuario.
     */
    public String getPassWord(){
        return getEnv("password");
    }
}
