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
        preemptiveAuthSpec.setUserName("rT4R6sst4PFW1cnsL9ZWh3cWMjC1hG");

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

    public Response get(String endpoint) {
        this.response = RestAssured.given()
                .spec(this.specification)
                .get(endpoint);
        return  this.response;
    }
}

