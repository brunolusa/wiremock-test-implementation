package functional;

import basetest.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;
import static requestspecification.RequestSpecificationBuilder.*;

public class GetFunctionalCepTest extends BaseTest {

    @Test
    public void obtendoCpfComSucesso(){

        given().
            log().all().
            spec(getRequestSpecification()).
        when().
            get().
        then().
            statusCode(200).
            body("cep",is("74710-060"));

    }

    @Test
    public void adicionandoCepComSucesso(){
        given().
            log().all().
            spec(getRequestSpecificationPost()).
        when().
            post("ws/").
        then().
            statusCode(201);
    }
}
