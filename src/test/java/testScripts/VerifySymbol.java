package testScripts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pojo.ExchangeInfo;
import pojo.Ticker;
import utils.HttpHelper;
import utils.TestListeners;

import java.util.List;

@Listeners(TestListeners.class)
public class VerifySymbol extends TestListeners {

    ObjectMapper objectMapper = new ObjectMapper();
    List<Ticker> tickerObjMap;
    ExchangeInfo exchangeInfoObjMap;
    int getRandomNumBasedOnResponseSize;
    String getRandomSymbol;

    @Parameters({"baseURL", "tickerPath", "exchangeInfoPath"})
    @Test(priority = 1, groups = "Smoke",description = "Verify the field baseAsset in conjunction with the field quoteAsset" +
            "matches the symbol name (field symbol from the same object)")
    public void verifyBaseQuoteAsset(String baseURL, String tickerPath, String exchangeInfoPath) throws JsonProcessingException {

        tickerObjMap = objectMapper.readValue(HttpHelper.makeGETRequest(baseURL+tickerPath), new TypeReference<>(){});
        extentTest.get().info("Json Parsing completed for Ticker");

        getRandomNumBasedOnResponseSize = (int) (Math.random()*tickerObjMap.size());
        getRandomSymbol = tickerObjMap.get(getRandomNumBasedOnResponseSize).getSymbol();
        extentTest.get().info("Random Symbol Selected:" + getRandomSymbol);
        exchangeInfoObjMap = objectMapper.readValue(HttpHelper.makeGETRequest(baseURL+exchangeInfoPath+getRandomSymbol), new TypeReference<>(){});
        extentTest.get().info("Json Parsing completed for Exchange Info");

        Assert.assertEquals(exchangeInfoObjMap.getSymbols().get(0).getSymbol(),
                exchangeInfoObjMap.getSymbols().get(0).getBaseAsset()
                        +exchangeInfoObjMap.getSymbols().get(0).getQuoteAsset(),
                "baseAsset + quoteAsset != symbol");
        extentTest.get().info(exchangeInfoObjMap.getSymbols().get(0).getBaseAsset() +" + "+
                exchangeInfoObjMap.getSymbols().get(0).getQuoteAsset() +" == "+ exchangeInfoObjMap.getSymbols().get(0).getSymbol());
        extentTest.get().info("Test Execution Completed Successfully!!!");
    }

}
