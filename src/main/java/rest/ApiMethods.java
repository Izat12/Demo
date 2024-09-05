package rest;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@Data
public abstract class ApiMethods {

    private String url;
    protected Map<String, String> headers;
    public Response response;
    protected RequestSpecification specification;

   // private static final Logger log = LoggerFactory.getLogger(ApiMethods.class);

    public ApiMethods(String url,Map<String, String> headers) {
        this.url = url;
        this.headers = headers;

        PreemptiveBasicAuthScheme preemptiveAuthSpec = new PreemptiveBasicAuthScheme();
        preemptiveAuthSpec.setUserName("WCYQvLwpXaqtXs7g1rCcAwkT9z5CkQ");

        specification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAuth(preemptiveAuthSpec)
                .setBaseUri(this.url)
                .addHeaders(this.headers)
                .setAccept(ContentType.JSON)
                .build();
    }
    private static final String SLASH = "/";
    public static String getEndpoint(String... args) {
        StringBuilder endPoint = new StringBuilder();
        for (String arg : args) {
            endPoint.append(arg).append(SLASH);
        }
        return endPoint.substring(0, endPoint.length() - 1);
    }

    public String formatParameter(HashMap<String, String> parameters) {
        StringBuilder query = new StringBuilder("?");
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            query.append(entry.getKey() + "=" + entry.getValue() + "&");
        }
        return query.deleteCharAt(query.length() - 1).toString();
    }

    public Response get(String endpoint) {
        this.response = RestAssured.given()
                .spec(this.specification)
                .get(endpoint);
        return  this.response;
    }
    public Response post(String endPoint, Map<String, String> params) {
        this.response = given()
                .spec(this.specification)
                .formParams(params)
                .post(endPoint);
        return this.response;
    }
    public Response post(String endPoint, String body) {
        this.response = given()
                .spec(this.specification)
                .body(body)
                .post(endPoint);
        return this.response;
    }
}

