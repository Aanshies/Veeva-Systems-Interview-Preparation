import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TitleUpdateTest {

    @Test
    public void partialUpdateTest() {
// 1. SET THE BASE URL
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

// 2. CREATE THE PARTIAL PAYLOAD
// Notice we ONLY send the title field
        String patchPayload = "{\"title\": \"Corrected Title\"}";

// 3. THE API CALL
        given()
                .contentType(ContentType.JSON)
                .body(patchPayload)
                .when()
                .patch("/posts/1") // Target Post #1
                .then()

                .log().all() // Prints response so you can see the result

// 4. THE AUTOMATION CRITERIA
                .statusCode(200) // Criteria 1: Success status code

// Criteria 2: Verify the title IS updated
                .body("title", equalTo("Corrected Title"))

// Criteria 3: Verify body and userId are NOT changed (Still match original Post #1)
                .body("userId", equalTo(1))
                .body("body", containsString("quia et suscipit"));
    }
}