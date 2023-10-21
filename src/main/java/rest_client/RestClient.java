package rest_client;

import dto.OrderDTO;
import dto.PetDTO;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestClient {
    private final String BASE_SERVER_URL = "https://petstore.swagger.io/v2/pet/";

    public Response getEntity(int petId) {
        return given().when()
            .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
            .get(BASE_SERVER_URL + petId);
    }

    public Response postEntity(PetDTO petToCreate) {
        return given()
                .header("Content-Type", "application/json")
                .body(petToCreate)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .post(BASE_SERVER_URL);
    }

    public Response updateEntity(PetDTO petToUpdate) {
        return given()
                .header("Content-Type", "application/json")
                .body(petToUpdate)
                .when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .put(BASE_SERVER_URL);
    }

    public Response deleteEntity(int petId) {
        Response response = given()
                .when()
                .delete("/v2/pet/" + petId);
        return response;
    }

    public Response postEntity(String resourceUrl, PetDTO petDTO) {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(petDTO);

        Response response = request.post(resourceUrl);

        return response;
    }

    public Response postOrder(String resourceUrl, OrderDTO orderDTO) {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(orderDTO);

        Response response = request.post(resourceUrl);

        return response;
    }

    public Response getOrderById(int orderId) {
        return given().when()
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get(BASE_SERVER_URL + "/store/order/" + orderId);
    }

    public Response deleteOrder(int orderId) {
        Response response = given()
                .when()
                .delete("/store/order/" + orderId);
        return response;
    }
}
