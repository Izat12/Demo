package rest.controller;

import rest.ApiMethods;
import rest.pojo.rerponse.Courses;
import io.qameta.allure.Step;
import rest.ApiMethods;

import java.util.HashMap;
import java.util.Map;


import static rest.controller.UserController.API;
import static rest.endpoints.CoursesEndpoints.COURSES;
import static rest.endpoints.CoursesEndpoints.DELETE_COURSES;
import static rest.endpoints.UserEndpoints.BASE_HEADERS;
import static rest.endpoints.UserEndpoints.V1;

public class CoursesController extends ApiMethods {
    public CoursesController(String url) {
        super(url, BASE_HEADERS);
    }

    @Step("Get all couses")
    public Courses[] getCourses(){
        return super.get(getEndpoint(API, V1, COURSES)).as(Courses[].class);
    }



//    @Step("Create a new courses {}")
//    public Courses createCourses(Courses courses) {
//        return super.post(getEndpoint(API, V1, CREATE_COURSES), courses.toJson()).as(Courses.class);
//    }

    @Step("Delete a course by id {}")
    public void deleteCourse(String courseId) {
        Map<String, String> params = new HashMap<>() {{
            put("course_id", courseId);
            put("deleted_by_course_id", "1");
        }};
        super.post(getEndpoint(API, V1, DELETE_COURSES), params.toString());
    }

//    @Step("Add user to course")
//    public void addUserToCourse(String courseId, String userId) {
//        Map<String, String> params = new HashMap<>() {{
//            put("course_id", courseId);
//            put("user_id", userId);
//        }};
//        super.post(getEndpoint(API, V1, ADDUSERTOCOURSE), params);
//    }

}
