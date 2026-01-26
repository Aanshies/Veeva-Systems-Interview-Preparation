import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static
        io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class SchemaTest {

    @Test
    public void validateSchema() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()

                .when()
                .get("/posts/1")
                .then()
                .assertThat().statusCode(200)
// This line compares the response against your schema.json file
                .body(matchesJsonSchemaInClasspath("schema.json"));

        System.out.println("Schema Validation Passed!");
    }
}