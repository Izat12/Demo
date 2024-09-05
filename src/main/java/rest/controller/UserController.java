package rest.controller;

import io.restassured.response.Response;
import rest.ApiMethods;
import rest.pojo.rerponse.Users;

import java.util.HashMap;
import java.util.Map;

import static rest.endpoints.UserEndpoints.*;

public class UserController extends ApiMethods {
    public static final String API = "api";

    public UserController(String url) {
        super(url,BASE_HEADERS );
    }

    public Response getUsers() {
        return this.response = super.get(getEndpoint(API, V1, USERS));
    }

    public Users createUser(Users user) {
        return super.post(getEndpoint(API, V1, USER_SIGNUP), user.toJson()).as(Users.class);
    }
    public void deleteUser(String userId) {
        Map<String, String> params = new HashMap<>() {{
            put("user_id", userId);
            put("deleted_by_user_id", "1");
        }};
        super.post(getEndpoint(API, V1, DELETE_USER), params);
    }
}
