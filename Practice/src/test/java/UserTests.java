import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserTests {
    @Test
    public void getSinglePostTest() {
// Using JSONPlaceholder instead of Reqres to avoid Cloudflare blocks
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        String response = given()
                .header("Content-Type", "application/json")

                .when()
                .get("/posts/1") // Action: GET
                .then()
                .assertThat().statusCode(200) // Assertion: Success
                .body("id", equalTo(1)) // In-line validation
                .extract().asString();

// JSON Parsing: Extracting a specific value
        JsonPath js = new JsonPath(response);
        String title = js.getString("title");
        System.out.println("Post Title: " + title);

        Assert.assertNotNull(title);
    }
}