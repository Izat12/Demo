package rest.controller;

import io.restassured.response.Response;
import org.apiguardian.api.API;
import rest.ApiMethods;

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

}
