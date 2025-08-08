
package api_automation.TestingField;

import api_automation.dataProviderClass.GorestDataProviderClass;
import api_automation.utils.TestBase;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.testng.annotations.Test;

public class GoreTesting2 extends TestBase {

    @Test(dataProvider = "dataProvider",dataProviderClass = GorestDataProviderClass.class)
    public void user_create_requestData(String email, String name, String gender, String status) throws JsonProcessingException {
        System.out.println("class1");


    }
}

