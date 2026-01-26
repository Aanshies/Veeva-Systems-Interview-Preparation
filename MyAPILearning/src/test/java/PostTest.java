import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

// Importing tools to check for specific values
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostTest {

    @Test
    public void createNewPostAutomation() {

// 1. SET THE BASE URL
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

// 2. CREATE THE PAYLOAD (The data we want to send)
// We use \" to tell Java that the quotes are part of the JSON text
        String myPayload = "{" +
                "\"title\": \"Learning API\"," +
                "\"body\": \"This is my first POST request\"," +
                "\"userId\": 1" +
                "}";

// 3. THE API CALL (Given/When/Then pattern)
        given()
                .contentType(ContentType.JSON) // Tell the server "I am sending JSON"
                .body(myPayload) // Attach our JSON data
                .when()
                .post("/posts") // Send the "POST" request to the /posts endpoint
                .then()
                .log().all() // Print the response in the console for us to see

// 4. THE AUTOMATION CRITERIA (Assertions)
                .statusCode(201) // Criteria 1: Assert Status Code is 201
                .body("id", notNullValue()) // Criteria 2: Assert response contains an 'id'
                .body("title", equalTo("Learning API")); // Criteria 3: Verify title matches
    }
}