package rest.controller;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.apiguardian.api.API;
import rest.ApiMethods;
import rest.endpoints.UserEndpoints;
import rest.pojo.rerponse.JsonUtils;
import rest.pojo.rerponse.Users;

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

    @Step("Create a new user {}")
    public Response userSignUp(Users users) {
        Users users1 = new Users(users);
        return super.post(getEndpoint(API, V1, USER_SIGNUP), JsonUtils.convertObjectToJson(users1));
    }

}
