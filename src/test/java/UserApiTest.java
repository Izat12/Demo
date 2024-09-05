import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import rest.controller.UserController;
import rest.pojo.rerponse.Users;
import rest.pojo.rerponse.UsersResponse;

import java.util.List;

@Tag("regress")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserApiTest extends BaseTest {

    protected UsersResponse usersResponse;
    protected Users[] users;
    public static UserController userController;

    @BeforeAll
    public static void Met() {
        userController = baseController.userController;
    }

   @Test
    @Order(1)
    public void receiveTest() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

// Преобразование результата getUsers() в список объектов UsersResponse
        List<UsersResponse> usersResponse = mapper.readValue(
                userController.getUsers().asPrettyString(), // asString() предполагается возвращает JSON в виде строки
                new TypeReference<List<UsersResponse>>() {}
        );    }
}
