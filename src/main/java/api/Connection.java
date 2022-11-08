package api;
import UI.Environment;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Connection {
    public Environment env = Environment.getInstance();
    public RequestSpecification requestSpecification;
    private static Connection connection;

    public Connection(){
        RestAssured.baseURI =env.authenticationBaseUri();
        requestSpecification = new RequestSpecBuilder()
                .addHeader(env.getTrackerToken(), env.getToken())
                .setRelaxedHTTPSValidation().build();

    }
    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }

}
