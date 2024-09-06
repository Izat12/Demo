package rest.asserts;

import rest.pojo.rerponse.Courses;
import rest.pojo.rerponse.Users;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;

@Slf4j
@Getter
public class ApiAssert {
    private Response response;

    public ApiAssert(Response response) {
        this.response = response;
    }

    public static ApiAssert assertThat(Response response) {
        return new ApiAssert(response);
    }

    @Step("Comparing the status code {}")
    public ApiAssert isCorrectStatusCode(Integer expectedStatusCode) {
        Assertions.assertThat(this.response.getStatusCode())
                .withFailMessage("Status code is not correct, Actual %s, Expected %s"
                        , this.response.getStatusCode()
                        , expectedStatusCode)
                .isEqualTo(expectedStatusCode);
//        log.info("Status code is correct {}", expectedStatusCode);
        return this;
    }

//    public UserAssert assertUser(User user) {
//        return UserAssert.assertThat(user);
//    }
//    public CoursesAssert coursesAssert(Courses courses){
//        return CoursesAssert.assertThat(courses);
//    }
}