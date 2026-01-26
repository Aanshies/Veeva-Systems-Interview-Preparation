import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostTest {

    @Test
    public void createPostTest() {
// 1. Define the Base URL
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

// 2. Define the JSON Body (Data we are sending)
        String myBody = "{\"title\": \"HandsOn\", \"body\": \"REST Assured\", \"userId\": 1}";

        given()
                .header("Content-Type", "application/json") // Header: Telling server we send JSON
                .auth().oauth2("token123") // Auth: Sending a Bearer Token
                .body(myBody) // Body: Attaching the JSON data
                .when()
                .post("/posts") // Action: POST method
                .then()
                .log().all() // Print response to console
                .assertThat().statusCode(201) // Assert: 201 means 'Created'
                .body("title", equalTo("HandsOn")); // Assert: Verify title in response
    }
}