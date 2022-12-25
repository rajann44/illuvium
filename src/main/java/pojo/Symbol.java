package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/*******JSON Mapping to Pojo Class for api/v3/exchangeInfo********/
public class Symbol {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("status")
    private String status;
    @JsonProperty("baseAsset")
    private String baseAsset;
    @JsonProperty("baseAssetPrecision")
    private Integer baseAssetPrecision;
    @JsonProperty("quoteAsset")
    private String quoteAsset;
    @JsonProperty("quotePrecision")
    private Integer quotePrecision;
    @JsonProperty("quoteAssetPrecision")
    private Integer quoteAssetPrecision;
    @JsonProperty("baseCommissionPrecision")
    private Integer baseCommissionPrecision;
    @JsonProperty("quoteCommissionPrecision")
    private Integer quoteCommissionPrecision;
    @JsonProperty("orderTypes")
    private List<String> orderTypes = null;
    @JsonProperty("icebergAllowed")
    private Boolean icebergAllowed;
    @JsonProperty("ocoAllowed")
    private Boolean ocoAllowed;
    @JsonProperty("quoteOrderQtyMarketAllowed")
    private Boolean quoteOrderQtyMarketAllowed;
    @JsonProperty("allowTrailingStop")
    private Boolean allowTrailingStop;
    @JsonProperty("cancelReplaceAllowed")
    private Boolean cancelReplaceAllowed;
    @JsonProperty("isSpotTradingAllowed")
    private Boolean isSpotTradingAllowed;
    @JsonProperty("isMarginTradingAllowed")
    private Boolean isMarginTradingAllowed;
    @JsonProperty("filters")
    private List<Filter> filters = null;
    @JsonProperty("permissions")
    private List<String> permissions = null;
    @JsonProperty("defaultSelfTradePreventionMode")
    private String defaultSelfTradePreventionMode;
    @JsonProperty("allowedSelfTradePreventionModes")
    private List<String> allowedSelfTradePreventionModes = null;

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("baseAsset")
    public String getBaseAsset() {
        return baseAsset;
    }

    @JsonProperty("baseAsset")
    public void setBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
    }

    @JsonProperty("baseAssetPrecision")
    public Integer getBaseAssetPrecision() {
        return baseAssetPrecision;
    }

    @JsonProperty("baseAssetPrecision")
    public void setBaseAssetPrecision(Integer baseAssetPrecision) {
        this.baseAssetPrecision = baseAssetPrecision;
    }

    @JsonProperty("quoteAsset")
    public String getQuoteAsset() {
        return quoteAsset;
    }

    @JsonProperty("quoteAsset")
    public void setQuoteAsset(String quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    @JsonProperty("quotePrecision")
    public Integer getQuotePrecision() {
        return quotePrecision;
    }

    @JsonProperty("quotePrecision")
    public void setQuotePrecision(Integer quotePrecision) {
        this.quotePrecision = quotePrecision;
    }

    @JsonProperty("quoteAssetPrecision")
    public Integer getQuoteAssetPrecision() {
        return quoteAssetPrecision;
    }

    @JsonProperty("quoteAssetPrecision")
    public void setQuoteAssetPrecision(Integer quoteAssetPrecision) {
        this.quoteAssetPrecision = quoteAssetPrecision;
    }

    @JsonProperty("baseCommissionPrecision")
    public Integer getBaseCommissionPrecision() {
        return baseCommissionPrecision;
    }

    @JsonProperty("baseCommissionPrecision")
    public void setBaseCommissionPrecision(Integer baseCommissionPrecision) {
        this.baseCommissionPrecision = baseCommissionPrecision;
    }

    @JsonProperty("quoteCommissionPrecision")
    public Integer getQuoteCommissionPrecision() {
        return quoteCommissionPrecision;
    }

    @JsonProperty("quoteCommissionPrecision")
    public void setQuoteCommissionPrecision(Integer quoteCommissionPrecision) {
        this.quoteCommissionPrecision = quoteCommissionPrecision;
    }

    @JsonProperty("orderTypes")
    public List<String> getOrderTypes() {
        return orderTypes;
    }

    @JsonProperty("orderTypes")
    public void setOrderTypes(List<String> orderTypes) {
        this.orderTypes = orderTypes;
    }

    @JsonProperty("icebergAllowed")
    public Boolean getIcebergAllowed() {
        return icebergAllowed;
    }

    @JsonProperty("icebergAllowed")
    public void setIcebergAllowed(Boolean icebergAllowed) {
        this.icebergAllowed = icebergAllowed;
    }

    @JsonProperty("ocoAllowed")
    public Boolean getOcoAllowed() {
        return ocoAllowed;
    }

    @JsonProperty("ocoAllowed")
    public void setOcoAllowed(Boolean ocoAllowed) {
        this.ocoAllowed = ocoAllowed;
    }

    @JsonProperty("quoteOrderQtyMarketAllowed")
    public Boolean getQuoteOrderQtyMarketAllowed() {
        return quoteOrderQtyMarketAllowed;
    }

    @JsonProperty("quoteOrderQtyMarketAllowed")
    public void setQuoteOrderQtyMarketAllowed(Boolean quoteOrderQtyMarketAllowed) {
        this.quoteOrderQtyMarketAllowed = quoteOrderQtyMarketAllowed;
    }

    @JsonProperty("allowTrailingStop")
    public Boolean getAllowTrailingStop() {
        return allowTrailingStop;
    }

    @JsonProperty("allowTrailingStop")
    public void setAllowTrailingStop(Boolean allowTrailingStop) {
        this.allowTrailingStop = allowTrailingStop;
    }

    @JsonProperty("cancelReplaceAllowed")
    public Boolean getCancelReplaceAllowed() {
        return cancelReplaceAllowed;
    }

    @JsonProperty("cancelReplaceAllowed")
    public void setCancelReplaceAllowed(Boolean cancelReplaceAllowed) {
        this.cancelReplaceAllowed = cancelReplaceAllowed;
    }

    @JsonProperty("isSpotTradingAllowed")
    public Boolean getIsSpotTradingAllowed() {
        return isSpotTradingAllowed;
    }

    @JsonProperty("isSpotTradingAllowed")
    public void setIsSpotTradingAllowed(Boolean isSpotTradingAllowed) {
        this.isSpotTradingAllowed = isSpotTradingAllowed;
    }

    @JsonProperty("isMarginTradingAllowed")
    public Boolean getIsMarginTradingAllowed() {
        return isMarginTradingAllowed;
    }

    @JsonProperty("isMarginTradingAllowed")
    public void setIsMarginTradingAllowed(Boolean isMarginTradingAllowed) {
        this.isMarginTradingAllowed = isMarginTradingAllowed;
    }

    @JsonProperty("filters")
    public List<Filter> getFilters() {
        return filters;
    }

    @JsonProperty("filters")
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    @JsonProperty("permissions")
    public List<String> getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("defaultSelfTradePreventionMode")
    public String getDefaultSelfTradePreventionMode() {
        return defaultSelfTradePreventionMode;
    }

    @JsonProperty("defaultSelfTradePreventionMode")
    public void setDefaultSelfTradePreventionMode(String defaultSelfTradePreventionMode) {
        this.defaultSelfTradePreventionMode = defaultSelfTradePreventionMode;
    }

    @JsonProperty("allowedSelfTradePreventionModes")
    public List<String> getAllowedSelfTradePreventionModes() {
        return allowedSelfTradePreventionModes;
    }

    @JsonProperty("allowedSelfTradePreventionModes")
    public void setAllowedSelfTradePreventionModes(List<String> allowedSelfTradePreventionModes) {
        this.allowedSelfTradePreventionModes = allowedSelfTradePreventionModes;
    }

}
