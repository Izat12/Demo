package rest.endpoints;

import java.util.HashMap;
import java.util.Map;

public class UserEndpoints {
    public static final String URL ="https://24winter.talentlms.com";

    public static final String V1 ="v1";
    public static final String USERS ="users";
    public static final String USER_SIGNUP ="usersignup";
    public static final String DELETE_USER ="deleteuser";


    public static Map<String, String> BASE_HEADERS = new HashMap<>() {{
        put("Cookie", "AWSALB=PnAUo8CPxucd+huT+LZW2nd3WsKDEYYLI8RgYWMf3ft8L6reuGzk1fMAIgWB1Yka6wthRd6JvjIwWSvKWvPj1gxEBhpEuq2cVEZhrxuq3IDbeFXax+iKMvW1e/oS; AWSALBCORS=PnAUo8CPxucd+huT+LZW2nd3WsKDEYYLI8RgYWMf3ft8L6reuGzk1fMAIgWB1Yka6wthRd6JvjIwWSvKWvPj1gxEBhpEuq2cVEZhrxuq3IDbeFXax+iKMvW1e/oS; PHPSESSID=elb~uml9l55p2saj9c00k4ugpvnck2");
        put("Cache-Control", "no-cache");
    }};
}
