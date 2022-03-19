package testScripts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pojo.Ticker;
import utils.HttpHelper;
import utils.TestListeners;

@Listeners(TestListeners.class)
public class VerifyCount extends TestListeners {

    ObjectMapper objectMapper = new ObjectMapper();
    Ticker[] tickerObj;

    @Parameters({"baseURL","tickerPath"})
    @Test(priority = 1, groups = "Smoke", description = "Verify count is above zero for every JSON object where symbol contains ILV")
    public void verifyCountIsAboveZero(String baseURL, String tickerPath) throws JsonProcessingException {

        //Read value from JSON response and store in Pojo Object
        tickerObj = objectMapper.readValue(HttpHelper.makeGETRequest(baseURL+tickerPath), new TypeReference<>(){});
        extentTest.get().info("Json Parsing completed");

        //Iterate through JSON and verified if Symbol is ILV & Count is greater then 0
        for (Ticker ticker: tickerObj) {
            if (ticker.getSymbol().contains("ILV")){
                extentTest.get().info("The Symbol is: "+ticker.getSymbol());
                Assert.assertTrue(ticker.getCount()>0);
            }
        }
        extentTest.get().info("Test Execution Completed Successfully!!!");
    }

}
