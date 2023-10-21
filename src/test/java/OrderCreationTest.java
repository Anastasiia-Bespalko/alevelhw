import dto.OrderDTO;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderCreationTest extends BaseTest{
    @Test
    public void testPlaceOrder() {
        OrderDTO order = createOrder();
        Response response = getRestClient().postOrder("/store/order", order);
        Assert.assertEquals(response.getStatusCode(), 200);
        OrderDTO createdOrder = response.as(OrderDTO.class);
        Assert.assertNotNull(createdOrder);
        Assert.assertEquals(createdOrder.getId(), order.getId());
    }


    private OrderDTO createOrder() {
        OrderDTO order = new OrderDTO();
        return order;
    }
}