package rest.utils;

import rest.pojo.rerponse.Courses;
import rest.pojo.rerponse.Users;
import com.github.javafaker.Faker;
import rest.pojo.rerponse.Courses;
import rest.pojo.rerponse.Users;

public class EntityManager {
    private static final Faker faker = new Faker();

    public static Users generateUser() {
        faker.number().digits(3);
        return Users.builder()
                .firstName("Goha")
                .lastName(faker.name().lastName())
                .email("gauhar@gmail.com")
                .login(faker.name().username())
                .password(faker.internet().password(10, 15, true, true, true))
                .build();
    }


    //TODO create a method to create random courses
    // TODO create a method to create a random group


}