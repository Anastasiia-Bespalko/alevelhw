import rest_client.RestClient;

public class BaseTest {
    private RestClient restClient = new RestClient();

    public RestClient getRestClient() {
        return restClient;
    }
}
