import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import rest.asserts.ApiAssert;
import rest.controller.CoursesController;
import rest.pojo.rerponse.Courses;
import rest.utils.EntityManager;
import io.qameta.allure.*;


@Tag("regress")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CoursesTest extends  BaseTest{
    public static CoursesController coursesController;
//    @BeforeAll
//    public static void Met() {
//        coursesController = baseController.;
//    }

//
//    @Test()
//    @Description("Testing courses delete")
//    @Owner("Dzhama")
//    @TmsLink("https://google.com")
//    @Issue("jira link")
//    @Epic("Some Epic")
//    @Story("Jira story")
//    @Tag("Smoke")
//    public void GetCourses() {
//        Courses[] courses = coursesController.getCourses();
//        ApiAssert.assertThat(coursesController.getResponse())
//                    .isCorrectStatusCode(200);
//
//// Проверка, что курсы были получены
//            if (courses.length == 0) {
//                throw new RuntimeException("No courses available to delete");
//            }
//        // Проверка каждого курса и вывод информации в лог
//        for (Courses course : courses) {
////            log.info("Course ID: {}, Name: {}", course.getId(), course.getName());
//        }
//
//// Получение ID последнего курса
//        String courseId = courses[courses.length - 1].getCreator_id();
//        if (courseId == null) {
//            throw new RuntimeException("Course ID is null for the last course");
//        }
//        log.info("Deleting course with ID {}", courseId);}
    @Test()
    @Description("Testing courses delete")
    @Owner("Dzhama")
    @TmsLink("https://google.com")
    @Issue("jira link")
    @Epic("Some Epic")
    @Story("Jira story")
    @Tag("Smoke")
    public void coursesDelete() {
        Courses[] courses = coursesController.getCourses();
//        coursesController.deleteCourse(courses[courses.length - 1].getId());
        ApiAssert.assertThat(coursesController.getResponse())
                .isCorrectStatusCode(200);
    }
//
//    @Test
//    public void createCoursesTest() {
//        Courses[] courses = coursesController.getCourses();
//        ApiAssert.assertThat(coursesController.getResponse())
//                .isCorrectStatusCode(200);
//        if (courses.length == 100) {
//            coursesController.deleteCourse(courses[courses.length - 1].getId());
//            ApiAssert.assertThat(coursesController.getResponse())
//                    .isCorrectStatusCode(200);
//        }
//        Courses expectedCourses = EntityManager.generateCourses();
//        Courses actualCourses = coursesController.createCourses(expectedCourses);
//        ApiAssert.assertThat(coursesController.getResponse())
//                .isCorrectStatusCode(200)
//                .coursesAssert(actualCourses)
//                .isEqualTo(expectedCourses);
//    }




}

