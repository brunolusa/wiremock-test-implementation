# wiremock-test-implementation
Projeto de testes back-end com utilização de Mock's (WireMock)

Objetivo: Validar requisições HTTP com response body _mockado_.

# Bibliotecas Utilizadas

Mock: WireMock
```
        <dependency>
            <groupId>com.github.tomakehurst</groupId>
            <artifactId>wiremock-jre8</artifactId>
            <version>2.27.0</version>
        </dependency>
```
Engine: TestNG
```
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version>
        </dependency>
```
Requisições HTTP: RestAssured
```
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>4.4.0</version>
        </dependency>
```