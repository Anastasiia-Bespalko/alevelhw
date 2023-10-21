import dto.CategoryDTO;
import dto.PetDTO;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePetTests extends BaseTest{
    @Test
    public void verifyPetCanBeUpdated() {
        int categoryId = 11;
        String categoryName = "dog";
        int petId = 12;
        String petName = "Bobik";
        String petStatus = "available";

        PetDTO petToCreate = createPet(categoryId, categoryName, petId, petName, petStatus);
        getRestClient().postEntity(petToCreate);

        Response previouslyCreatedPetResponse = getRestClient().getEntity(petId);
        PetDTO previouslyCreatedPet = previouslyCreatedPetResponse.as(PetDTO.class);

        Assert.assertEquals(previouslyCreatedPet.getId(),petId);
        Assert.assertEquals(previouslyCreatedPet.getName(), petName);
        Assert.assertEquals(previouslyCreatedPet.getCategory().getId(), categoryId);
        Assert.assertEquals(previouslyCreatedPet.getCategory().getName(), categoryName);
        Assert.assertEquals(previouslyCreatedPet.getStatus(), petStatus);

        int updatedCategoryId = 99;
        String updatedCategoryName = "cat";
        String updatedPetName = "Barsik";
        String updatedPetStatus = "sold";

        PetDTO updatedPetEntity = createPet(updatedCategoryId, updatedCategoryName, petId, updatedPetName, updatedPetStatus);
        getRestClient().updateEntity(updatedPetEntity);

        Response updatedPetResponse = getRestClient().getEntity(petId);
        PetDTO updatedPet = updatedPetResponse.as(PetDTO.class);

        Assert.assertEquals(updatedPet.getId(),petId);
        Assert.assertEquals(updatedPet.getName(), updatedPetName);
        Assert.assertEquals(updatedPet.getCategory().getId(), updatedCategoryId);
        Assert.assertEquals(updatedPet.getCategory().getName(), updatedCategoryName);
        Assert.assertEquals(updatedPet.getStatus(), updatedPetStatus);
    }
    @Test
    public void verifyGetNonExistentPet() {
        int nonExistentPetId = 999;
        Response response = getRestClient().getEntity(nonExistentPetId);

        Assert.assertEquals(response.getStatusCode(), 404);
    }

    @Test
    public void verifyPetCanBeDeleted() {
        int petId = 13;
        PetDTO petToDelete = createPet(11, "dog", petId, "ToDelete", "available");
        getRestClient().postEntity(petToDelete);

        Response beforeDeleteResponse = getRestClient().getEntity(petId);
        Assert.assertEquals(beforeDeleteResponse.getStatusCode(), 200);

        getRestClient().deleteEntity(petId);

        Response afterDeleteResponse = getRestClient().getEntity(petId);
        Assert.assertEquals(afterDeleteResponse.getStatusCode(), 200);
    }

    private PetDTO createPet(int categoryId, String categoryName, int petId, String petName, String petStatus) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(categoryId);
        categoryDTO.setName(categoryName);

        PetDTO petToCreate = new PetDTO();
        petToCreate.setId(petId);
        petToCreate.setCategory(categoryDTO);
        petToCreate.setName(petName);
        petToCreate.setStatus(petStatus);
        return petToCreate;
    }
}
