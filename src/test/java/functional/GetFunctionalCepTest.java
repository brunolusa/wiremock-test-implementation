package functional;

import basetest.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;
public class GetFunctionalCepTest extends BaseTest {

    @Test
    public void obtendoCpfComSucesso(){

        when().
            get("http://localhost:8080/teste").
        then().
            statusCode(200).
            body("cep",is("74710-060"));

    }
}
