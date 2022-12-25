package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/*******JSON Mapping to Pojo Class for api/v3/exchangeInfo********/
public class Filter {

    @JsonProperty("filterType")
    private String filterType;
    @JsonProperty("minPrice")
    private String minPrice;
    @JsonProperty("maxPrice")
    private String maxPrice;
    @JsonProperty("tickSize")
    private String tickSize;
    @JsonProperty("minQty")
    private String minQty;
    @JsonProperty("maxQty")
    private String maxQty;
    @JsonProperty("stepSize")
    private String stepSize;
    @JsonProperty("minNotional")
    private String minNotional;
    @JsonProperty("applyToMarket")
    private Boolean applyToMarket;
    @JsonProperty("avgPriceMins")
    private Integer avgPriceMins;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("minTrailingAboveDelta")
    private Integer minTrailingAboveDelta;
    @JsonProperty("maxTrailingAboveDelta")
    private Integer maxTrailingAboveDelta;
    @JsonProperty("minTrailingBelowDelta")
    private Integer minTrailingBelowDelta;
    @JsonProperty("maxTrailingBelowDelta")
    private Integer maxTrailingBelowDelta;
    @JsonProperty("bidMultiplierUp")
    private String bidMultiplierUp;
    @JsonProperty("bidMultiplierDown")
    private String bidMultiplierDown;
    @JsonProperty("askMultiplierUp")
    private String askMultiplierUp;
    @JsonProperty("askMultiplierDown")
    private String askMultiplierDown;
    @JsonProperty("maxNumOrders")
    private Integer maxNumOrders;
    @JsonProperty("maxNumAlgoOrders")
    private Integer maxNumAlgoOrders;

    @JsonProperty("filterType")
    public String getFilterType() {
        return filterType;
    }

    @JsonProperty("filterType")
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    @JsonProperty("minPrice")
    public String getMinPrice() {
        return minPrice;
    }

    @JsonProperty("minPrice")
    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    @JsonProperty("maxPrice")
    public String getMaxPrice() {
        return maxPrice;
    }

    @JsonProperty("maxPrice")
    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    @JsonProperty("tickSize")
    public String getTickSize() {
        return tickSize;
    }

    @JsonProperty("tickSize")
    public void setTickSize(String tickSize) {
        this.tickSize = tickSize;
    }

    @JsonProperty("minQty")
    public String getMinQty() {
        return minQty;
    }

    @JsonProperty("minQty")
    public void setMinQty(String minQty) {
        this.minQty = minQty;
    }

    @JsonProperty("maxQty")
    public String getMaxQty() {
        return maxQty;
    }

    @JsonProperty("maxQty")
    public void setMaxQty(String maxQty) {
        this.maxQty = maxQty;
    }

    @JsonProperty("stepSize")
    public String getStepSize() {
        return stepSize;
    }

    @JsonProperty("stepSize")
    public void setStepSize(String stepSize) {
        this.stepSize = stepSize;
    }

    @JsonProperty("minNotional")
    public String getMinNotional() {
        return minNotional;
    }

    @JsonProperty("minNotional")
    public void setMinNotional(String minNotional) {
        this.minNotional = minNotional;
    }

    @JsonProperty("applyToMarket")
    public Boolean getApplyToMarket() {
        return applyToMarket;
    }

    @JsonProperty("applyToMarket")
    public void setApplyToMarket(Boolean applyToMarket) {
        this.applyToMarket = applyToMarket;
    }

    @JsonProperty("avgPriceMins")
    public Integer getAvgPriceMins() {
        return avgPriceMins;
    }

    @JsonProperty("avgPriceMins")
    public void setAvgPriceMins(Integer avgPriceMins) {
        this.avgPriceMins = avgPriceMins;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("minTrailingAboveDelta")
    public Integer getMinTrailingAboveDelta() {
        return minTrailingAboveDelta;
    }

    @JsonProperty("minTrailingAboveDelta")
    public void setMinTrailingAboveDelta(Integer minTrailingAboveDelta) {
        this.minTrailingAboveDelta = minTrailingAboveDelta;
    }

    @JsonProperty("maxTrailingAboveDelta")
    public Integer getMaxTrailingAboveDelta() {
        return maxTrailingAboveDelta;
    }

    @JsonProperty("maxTrailingAboveDelta")
    public void setMaxTrailingAboveDelta(Integer maxTrailingAboveDelta) {
        this.maxTrailingAboveDelta = maxTrailingAboveDelta;
    }

    @JsonProperty("minTrailingBelowDelta")
    public Integer getMinTrailingBelowDelta() {
        return minTrailingBelowDelta;
    }

    @JsonProperty("minTrailingBelowDelta")
    public void setMinTrailingBelowDelta(Integer minTrailingBelowDelta) {
        this.minTrailingBelowDelta = minTrailingBelowDelta;
    }

    @JsonProperty("maxTrailingBelowDelta")
    public Integer getMaxTrailingBelowDelta() {
        return maxTrailingBelowDelta;
    }

    @JsonProperty("maxTrailingBelowDelta")
    public void setMaxTrailingBelowDelta(Integer maxTrailingBelowDelta) {
        this.maxTrailingBelowDelta = maxTrailingBelowDelta;
    }

    @JsonProperty("bidMultiplierUp")
    public String getBidMultiplierUp() {
        return bidMultiplierUp;
    }

    @JsonProperty("bidMultiplierUp")
    public void setBidMultiplierUp(String bidMultiplierUp) {
        this.bidMultiplierUp = bidMultiplierUp;
    }

    @JsonProperty("bidMultiplierDown")
    public String getBidMultiplierDown() {
        return bidMultiplierDown;
    }

    @JsonProperty("bidMultiplierDown")
    public void setBidMultiplierDown(String bidMultiplierDown) {
        this.bidMultiplierDown = bidMultiplierDown;
    }

    @JsonProperty("askMultiplierUp")
    public String getAskMultiplierUp() {
        return askMultiplierUp;
    }

    @JsonProperty("askMultiplierUp")
    public void setAskMultiplierUp(String askMultiplierUp) {
        this.askMultiplierUp = askMultiplierUp;
    }

    @JsonProperty("askMultiplierDown")
    public String getAskMultiplierDown() {
        return askMultiplierDown;
    }

    @JsonProperty("askMultiplierDown")
    public void setAskMultiplierDown(String askMultiplierDown) {
        this.askMultiplierDown = askMultiplierDown;
    }

    @JsonProperty("maxNumOrders")
    public Integer getMaxNumOrders() {
        return maxNumOrders;
    }

    @JsonProperty("maxNumOrders")
    public void setMaxNumOrders(Integer maxNumOrders) {
        this.maxNumOrders = maxNumOrders;
    }

    @JsonProperty("maxNumAlgoOrders")
    public Integer getMaxNumAlgoOrders() {
        return maxNumAlgoOrders;
    }

    @JsonProperty("maxNumAlgoOrders")
    public void setMaxNumAlgoOrders(Integer maxNumAlgoOrders) {
        this.maxNumAlgoOrders = maxNumAlgoOrders;
    }

}
