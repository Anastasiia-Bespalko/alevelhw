import dto.OrderDTO;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ObtainingInformationTest extends BaseTest{
    @Test
    public void testGetOrderById() {
        int orderId = 123;

        Response response = getRestClient().getOrderById(orderId);

        if (response.getStatusCode() == 200) {
            OrderDTO order = response.as(OrderDTO.class);

            Assert.assertNotNull(order);
            Assert.assertEquals(order.getId(), orderId);
        } else if (response.getStatusCode() == 404) {
            System.out.println("Order not found with ID: " + orderId);
        } else {
            Assert.fail("Unexpected response status: " + response.getStatusCode());
        }
    }


}

