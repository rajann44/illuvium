package pojo;

/*******JSON Mapping to Pojo Class for api/v3/exchangeInfo********/
public class Filter {

    private String filterType;
    private String minPrice;
    private String maxPrice;
    private String tickSize;
    private String multiplierUp;
    private String multiplierDown;
    private Long avgPriceMins;
    private String minQty;
    private String maxQty;
    private String stepSize;
    private String minNotional;
    private Boolean applyToMarket;
    private Long limit;
    private Long maxNumOrders;
    private Long maxNumAlgoOrders;

    /**
     * No args constructor for use in serialization
     *
     */
    public Filter() {
    }

    /**
     *
     * @param maxNumOrders
     * @param multiplierDown
     * @param multiplierUp
     * @param stepSize
     * @param applyToMarket
     * @param tickSize
     * @param minNotional
     * @param minPrice
     * @param limit
     * @param avgPriceMins
     * @param maxPrice
     * @param filterType
     * @param maxQty
     * @param maxNumAlgoOrders
     * @param minQty
     */
    public Filter(String filterType, String minPrice, String maxPrice, String tickSize, String multiplierUp, String multiplierDown, Long avgPriceMins, String minQty, String maxQty, String stepSize, String minNotional, Boolean applyToMarket, Long limit, Long maxNumOrders, Long maxNumAlgoOrders) {
        super();
        this.filterType = filterType;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.tickSize = tickSize;
        this.multiplierUp = multiplierUp;
        this.multiplierDown = multiplierDown;
        this.avgPriceMins = avgPriceMins;
        this.minQty = minQty;
        this.maxQty = maxQty;
        this.stepSize = stepSize;
        this.minNotional = minNotional;
        this.applyToMarket = applyToMarket;
        this.limit = limit;
        this.maxNumOrders = maxNumOrders;
        this.maxNumAlgoOrders = maxNumAlgoOrders;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public Filter withFilterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public Filter withMinPrice(String minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Filter withMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public String getTickSize() {
        return tickSize;
    }

    public void setTickSize(String tickSize) {
        this.tickSize = tickSize;
    }

    public Filter withTickSize(String tickSize) {
        this.tickSize = tickSize;
        return this;
    }

    public String getMultiplierUp() {
        return multiplierUp;
    }

    public void setMultiplierUp(String multiplierUp) {
        this.multiplierUp = multiplierUp;
    }

    public Filter withMultiplierUp(String multiplierUp) {
        this.multiplierUp = multiplierUp;
        return this;
    }

    public String getMultiplierDown() {
        return multiplierDown;
    }

    public void setMultiplierDown(String multiplierDown) {
        this.multiplierDown = multiplierDown;
    }

    public Filter withMultiplierDown(String multiplierDown) {
        this.multiplierDown = multiplierDown;
        return this;
    }

    public Long getAvgPriceMins() {
        return avgPriceMins;
    }

    public void setAvgPriceMins(Long avgPriceMins) {
        this.avgPriceMins = avgPriceMins;
    }

    public Filter withAvgPriceMins(Long avgPriceMins) {
        this.avgPriceMins = avgPriceMins;
        return this;
    }

    public String getMinQty() {
        return minQty;
    }

    public void setMinQty(String minQty) {
        this.minQty = minQty;
    }

    public Filter withMinQty(String minQty) {
        this.minQty = minQty;
        return this;
    }

    public String getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(String maxQty) {
        this.maxQty = maxQty;
    }

    public Filter withMaxQty(String maxQty) {
        this.maxQty = maxQty;
        return this;
    }

    public String getStepSize() {
        return stepSize;
    }

    public void setStepSize(String stepSize) {
        this.stepSize = stepSize;
    }

    public Filter withStepSize(String stepSize) {
        this.stepSize = stepSize;
        return this;
    }

    public String getMinNotional() {
        return minNotional;
    }

    public void setMinNotional(String minNotional) {
        this.minNotional = minNotional;
    }

    public Filter withMinNotional(String minNotional) {
        this.minNotional = minNotional;
        return this;
    }

    public Boolean getApplyToMarket() {
        return applyToMarket;
    }

    public void setApplyToMarket(Boolean applyToMarket) {
        this.applyToMarket = applyToMarket;
    }

    public Filter withApplyToMarket(Boolean applyToMarket) {
        this.applyToMarket = applyToMarket;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Filter withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    public Long getMaxNumOrders() {
        return maxNumOrders;
    }

    public void setMaxNumOrders(Long maxNumOrders) {
        this.maxNumOrders = maxNumOrders;
    }

    public Filter withMaxNumOrders(Long maxNumOrders) {
        this.maxNumOrders = maxNumOrders;
        return this;
    }

    public Long getMaxNumAlgoOrders() {
        return maxNumAlgoOrders;
    }

    public void setMaxNumAlgoOrders(Long maxNumAlgoOrders) {
        this.maxNumAlgoOrders = maxNumAlgoOrders;
    }

    public Filter withMaxNumAlgoOrders(Long maxNumAlgoOrders) {
        this.maxNumAlgoOrders = maxNumAlgoOrders;
        return this;
    }

}
