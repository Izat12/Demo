package rest.endpoints;

import java.util.HashMap;
import java.util.Map;

public class UserEndpoints {
    public static final String URL ="https://dnwinter2024.talentlms.com";

    public static final String V1 ="v1";
    public static final String USERS ="users";
    public static final String USER_SIGNUP ="usersignup";
    public static final String DELETE_USER ="deleteuser";
    public static final String EDIT_USER = "edituser";

    public static final String COURSES = "courses";
    public static final String CREATE_COURSE = "createcourse";
    public static final String DELETE_COURSE = "deletecourse";
    public static final String ADD_USER_TO_COURSE = "addusertocourse";
    public static final String REMOVE_USER_FROM_COURSE = "removeuserfromcourse";
    public static final String BUY_COURSE = "buycourse";
    public static final String GET_TEST_ANSWERS = "gettestanswers";
    public static final String GET_ILT_SESSIONS = "getiltsessions";

    public static final String GROUPS = "groups";
    public static final String CREATE_GROUP = "creategroup";
    public static final String DELETE_GROUP = "deletegroup";
    public static final String ADD_USER_TO_GROUP = "addusertogroup";
    public static final String REMOVE_USER_FROM_GROUP = "removeuserfromgroup";
    public static final String ADD_COURSE_TO_GROUP = "addcoursetogroup";


    public static Map<String, String> BASE_HEADERS = new HashMap<>() {{
        put("Cookie", "AWSALB=PnAUo8CPxucd+huT+LZW2nd3WsKDEYYLI8RgYWMf3ft8L6reuGzk1fMAIgWB1Yka6wthRd6JvjIwWSvKWvPj1gxEBhpEuq2cVEZhrxuq3IDbeFXax+iKMvW1e/oS; AWSALBCORS=PnAUo8CPxucd+huT+LZW2nd3WsKDEYYLI8RgYWMf3ft8L6reuGzk1fMAIgWB1Yka6wthRd6JvjIwWSvKWvPj1gxEBhpEuq2cVEZhrxuq3IDbeFXax+iKMvW1e/oS; PHPSESSID=elb~uml9l55p2saj9c00k4ugpvnck2");
        put("Cache-Control", "no-cache");
    }};
}
