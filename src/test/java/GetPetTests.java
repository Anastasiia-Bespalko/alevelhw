import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPetTests {
    private final String BASE_SERVER_URL = "https://petstore.swagger.io/v2/pet/";
    @Test
    public void getPetTest() {
        int petId = 3;

        Response response = given().when().get(BASE_SERVER_URL + petId);
        System.out.println(response.asPrettyString());

    }
}
