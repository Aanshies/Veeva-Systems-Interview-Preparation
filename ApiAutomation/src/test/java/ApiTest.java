import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import static
        io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ApiTest {

    @Test
    public void testCase1_GetAndParse() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        String response = given().when().get("/posts/1").then().extract().asString();

        JsonPath js = new JsonPath(response);
        System.out.println("Title: " + js.getString("title"));
        Assert.assertEquals(js.getInt("id"), 1);
    }

    @Test
    public void testCase2_PostWithAuth() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        given()
                .header("Content-Type", "application/json")
                .auth().oauth2("sample_token")
                .body("{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}")
                .when().post("/posts")
                .then().statusCode(201);
    }

    @Test
    public void testCase3_SchemaValidation() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        given().when().get("/posts/1").then().assertThat()
                .body(matchesJsonSchemaInClasspath("schema.json"));

    }
}