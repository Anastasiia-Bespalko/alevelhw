import dto.PetDTO;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetPetTests extends BaseTest{
    @Test
    public void getPetTest() {
        int petId = 7;

        Response response = getRestClient().getEntity(petId);
        PetDTO pet = response.as(PetDTO.class);
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(pet.getId(), petId);

    }
}
