package api_automation.TestingField;
import static io.restassured.RestAssured.given;
import api_automation.dataProviderClass.GorestDataProviderClass;

//import api_automation.utils.Log;
import com.fasterxml.jackson.core.JsonProcessingException;

import api_automation.utils.TestBase;


import org.testng.Assert;
import org.testng.annotations.Test;

public class GoreTesting1 {

    @Test()
    public void user_create_requestData(){
        System.out.println("class1");
        Assert.assertEquals(1,2);

    }
}

