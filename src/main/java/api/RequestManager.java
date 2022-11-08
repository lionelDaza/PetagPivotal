package api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RequestManager {
    private static final RequestSpecification requestSpecification =
            Connection.getInstance().getRequestSpecification();

    public RequestManager() {
    }

    /**
     */
    public static Response get(final String endPoint) {
        return given()
                .spec(requestSpecification)
                .when()
                .get(endPoint);
    }


}
