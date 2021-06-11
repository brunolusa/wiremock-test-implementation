package functional;

import basetest.BaseTest;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import requestspecification.RequestSpecificationBuilder;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.*;
import static requestspecification.RequestSpecificationBuilder.getRequestSpecification;

public class GetFunctionalCepTest extends BaseTest {

    @Test
    public void obtendoCpfComSucesso(){

        given().
            spec(getRequestSpecification()).
        when().
            get().
        then().
            statusCode(200).
            body("cep",is("74710-060"));

    }
}
