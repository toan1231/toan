package api_automation.TestingField;
import static io.restassured.RestAssured.given;
import api_automation.dataProviderClass.GorestDataProviderClass;
import api_automation.requestBuilder.GoreRequestBuilder;

//import api_automation.utils.Log;
import api_automation.utils.Log;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jcraft.jsch.Logger;
import io.restassured.http.ContentType;

import api_automation.utils.TestBase;

import io.restassured.response.Response;


import org.testng.annotations.Test;

public class GoreTesting extends TestBase {

    @Test(dataProvider = "dataProvider",dataProviderClass = GorestDataProviderClass.class)
    public void user_create_requestData(String email, String name, String gender, String status) throws JsonProcessingException {
        System.out.println("class1");


    }
}

