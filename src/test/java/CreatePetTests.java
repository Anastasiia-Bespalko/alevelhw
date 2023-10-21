import dto.CategoryDTO;
import dto.PetDTO;
import dto.TagDTO;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CreatePetTests extends BaseTest{
    @Test
    public void verifyPetCanCreated() {
        int categoryId = 11;
        String categoryName = "dog";
        int petId = 12;
        String petName = "Bobik";
        String petStatus = "available";

        List<String> photoUrls = Arrays.asList("https://ichef.bbci.co.uk/news/640/cpsprodpb/475B/production/_98776281_gettyimages-521697453.jpg", "url2");
        List<TagDTO> tags = Arrays.asList(new TagDTO(1, "tag1"), new TagDTO(2, "tag2"));

        PetDTO petToCreate = createPet(categoryId, categoryName, petId, petName, petStatus, photoUrls, tags);

        Response response = getRestClient().postEntity(petToCreate);
        PetDTO createdPet = response.as(PetDTO.class);

        Assert.assertEquals(createdPet.getId(), petId);
        Assert.assertEquals(createdPet.getName(), petName);
        Assert.assertEquals(createdPet.getCategory().getId(), categoryId);
        Assert.assertEquals(createdPet.getCategory().getName(), categoryName);
        Assert.assertEquals(createdPet.getStatus(), petStatus);

        Assert.assertTrue(createdPet.getPhotoUrls().contains("https://ichef.bbci.co.uk/news/640/cpsprodpb/475B/production/_98776281_gettyimages-521697453.jpg"));
        Assert.assertEquals(createdPet.getTags(), tags);
    }


    private PetDTO createPet(int categoryId, String categoryName, int petId, String petName, String petStatus, List<String> photoUrls, List<TagDTO> tags) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(categoryId);
        categoryDTO.setName(categoryName);

        PetDTO petToCreate = new PetDTO();
        petToCreate.setId(petId);
        petToCreate.setCategory(categoryDTO);
        petToCreate.setName(petName);
        petToCreate.setStatus(petStatus);
        petToCreate.setPhotoUrls(photoUrls);
        petToCreate.setTags(tags);
        return petToCreate;
    }

}
