import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APICRUDPractice {

    @BeforeClass
    public void setup() {
        // Set the base URI once so we don't have to repeat it in every test
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test(priority = 1)
    public void practice1_CreateTask() {
        // Payload: {"title": "Finish Homework", "completed": false, "userId": 1}
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Finish Homework");
        body.put("completed", false);
        body.put("userId", 1);

        given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/todos")
                .then()
                .log().all() // Logs the response to console so you can see it
                .assertThat().statusCode(201)
                .body("completed", equalTo(false))
                .body("id", equalTo(201));
    }


    @Test(priority = 2)
    public void practice2_GetUserDetails() {
        given()
                .when()
                .get("/users/2")
                .then()
                .assertThat().statusCode(200)
                .body("username", equalTo("Antonette"))
                .body("email", equalTo("Shanna@melissa.tv"))
                // Validating nested fields using dot notation (address.city)
                .body("address.city", equalTo("Wisokyburgh"));
    }

    @Test(priority = 3)
    public void practice3_UpdatePostFull() {
        // Payload for PUT (Full replacement)
        Map<String, Object> body = new HashMap<>();
        body.put("id", 5);
        body.put("title", "New Title");
        body.put("body", "New Body Content");
        body.put("userId", 5);

        given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .put("/posts/5")
                .then()
                .assertThat().statusCode(200)
                .body("title", equalTo("New Title"))
                .body("body", equalTo("New Body Content"))
                .body("id", equalTo(5));
    }

    @Test(priority = 4)
    public void practice4_PatchUserEmail() {
        // Payload for PATCH (Partial update)
        Map<String, Object> body = new HashMap<>();
        body.put("email", "updated_email@gmail.com");

        given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .patch("/users/1")
                .then()
                .assertThat().statusCode(200)
                .body("email", equalTo("updated_email@gmail.com"))
                // name should remain unchanged
                .body("name", equalTo("Leanne Graham"));
    }

    @Test(priority = 5)
    public void practice5_DeleteTodo() {
        given()
                .when()
                .delete("/todos/10")
                .then()
                .assertThat().statusCode(200);
        // JSONPlaceholder returns an empty body {} for DELETE
    }
}