import io.restassured.response.Response;
import rest.controller.BaseController;

public class BaseTest {
    public static BaseController baseController = new BaseController();

    protected Response response;
}
