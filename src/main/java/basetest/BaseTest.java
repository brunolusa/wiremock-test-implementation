package basetest;

import Utils.Environment;
import com.github.tomakehurst.wiremock.WireMockServer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;

public class BaseTest {

    public WireMockServer wireMockServer;

    @BeforeTest
    public void setUp(){

        if(Environment.getEnvironment().equals(Environment.EnvironmentInterface.MOCK)){
            buildStubMock();
        }

        enableLoggingOfRequestAndResponseIfValidationFails();

    }

    private void buildStubMock() {
        wireMockServer = new WireMockServer(8080);
        wireMockServer.start();
        wireMockServer.stubFor(get(urlEqualTo("/ws/74710060/json"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withHeader("x-v", "1.0.0")
                        .withStatus(200)
                        .withBodyFile("responseBodyTest.json")));

    }

    @AfterTest
    public void tearDown(){

        if(Environment.getEnvironment().equals(Environment.EnvironmentInterface.MOCK)) {
            wireMockServer.stop();
        }
    }
}
