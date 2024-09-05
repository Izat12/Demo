package rest.controller;

import lombok.Getter;

import static rest.endpoints.UserEndpoints.URL;

public class BaseController {
    @Getter
public UserController userController;

public BaseController(){
    this.userController= new UserController(URL);
}
}
