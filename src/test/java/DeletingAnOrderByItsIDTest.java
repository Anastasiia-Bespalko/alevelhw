import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeletingAnOrderByItsIDTest extends BaseTest {
    @Test
    public void testDeleteOrderById() {
        int orderId = 123;

        Response response = getRestClient().deleteOrder(orderId);

        Response getOrderResponse = getRestClient().getEntity(orderId);
        Assert.assertEquals(getOrderResponse.getStatusCode(), 200);
    }
}
