package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class Get
{
    @Test
    public void testGet()
    {
        given().
                baseUri("https://petstore.swagger.io").
        when().
                get("/v2/pet/9222968140497325629").
        then().
                log().all().
                assertThat().statusCode(200).
                body("name", is(equalTo("fish")));
    }
}
