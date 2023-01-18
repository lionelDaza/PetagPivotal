package api;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

/***
 * Clase encargada de gestionar los request hacia la Api de acuerdo al endpoint.
 */
public class RequestManager {
    private static final RequestSpecification requestSpecification =
            Connection.getInstance().getRequestSpecification();

    /****
     * Constructor de la clase.
     */
    public RequestManager() {
    }

    /****
     * Método que configura el request GET.
     * @param endPoint  String el endpoint del request GET.
     * @return  Response de la Api.
     */
    public static Response get(final String endPoint) {
        return given()
                .spec(requestSpecification)
                .when()
                .get(endPoint);
    }

    /***
     * Método que configura el request DELETE.
     * @param endPoint String el endpoint del request DELETE.
     * @return  Response de la Api.
     */
    public static Response delete(final String endPoint){
        return given()
                .spec(requestSpecification)
                .when()
                .delete(endPoint);
    }

}
