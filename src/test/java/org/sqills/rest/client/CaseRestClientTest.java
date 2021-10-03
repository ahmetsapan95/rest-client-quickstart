package org.sqills.rest.client;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.sqills.rest.pojo.CaseRequest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CaseRestClientTest {

    @Test
    public void testCaseEndpoint() {
        CaseRequest caseRequest = new CaseRequest();
        caseRequest.setInputStr("com.SQILLS.assignment an.oth8er  Sample.1nput-Str");
        given().contentType(ContentType.JSON).body(caseRequest)
                .when().post("/v1/parse-str")
                .then()
                .statusCode(200);
    }

}