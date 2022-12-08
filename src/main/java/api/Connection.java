package api;
import UI.Environment;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

/****
 * Clase que configura los request base para el manejo de la API.
 */
public class Connection {
    public Environment env = Environment.getInstance();
    public RequestSpecification requestSpecification;
    private static Connection connection;

    /****
     * Constructor de la clase Connection.
     */
    public Connection(){
        RestAssured.baseURI =env.authenticationBaseUri();
        requestSpecification = new RequestSpecBuilder()
                .addHeader(env.getTrackerToken(), env.getToken())
                .setRelaxedHTTPSValidation().build();
    }

    /****
     * Metodo que devuelve la el request configurado.
     * @return RequestSpecification instancia y configurado de la misma.
     */
    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    /****
     * Metodo que obtiene la instancia de la clase y sino la instancia.
     * @return  la instancia de la clase Connection
     */
    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
