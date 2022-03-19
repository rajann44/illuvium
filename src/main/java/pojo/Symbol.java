package pojo;

import java.util.List;

/*******JSON Mapping to Pojo Class for api/v3/exchangeInfo********/
public class Symbol {

    private String symbol;
    private String status;
    private String baseAsset;
    private Long baseAssetPrecision;
    private String quoteAsset;
    private Long quotePrecision;
    private Long quoteAssetPrecision;
    private Long baseCommissionPrecision;
    private Long quoteCommissionPrecision;
    private List<String> orderTypes = null;
    private Boolean icebergAllowed;
    private Boolean ocoAllowed;
    private Boolean quoteOrderQtyMarketAllowed;
    private Boolean allowTrailingStop;
    private Boolean isSpotTradingAllowed;
    private Boolean isMarginTradingAllowed;
    private List<Filter> filters = null;
    private List<String> permissions = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Symbol() {
    }

    /**
     *
     * @param symbol
     * @param quoteOrderQtyMarketAllowed
     * @param allowTrailingStop
     * @param baseAsset
     * @param filters
     * @param baseAssetPrecision
     * @param isSpotTradingAllowed
     * @param quoteAssetPrecision
     * @param quoteCommissionPrecision
     * @param ocoAllowed
     * @param quotePrecision
     * @param orderTypes
     * @param permissions
     * @param icebergAllowed
     * @param isMarginTradingAllowed
     * @param quoteAsset
     * @param baseCommissionPrecision
     * @param status
     */
    public Symbol(String symbol, String status, String baseAsset, Long baseAssetPrecision, String quoteAsset, Long quotePrecision, Long quoteAssetPrecision, Long baseCommissionPrecision, Long quoteCommissionPrecision, List<String> orderTypes, Boolean icebergAllowed, Boolean ocoAllowed, Boolean quoteOrderQtyMarketAllowed, Boolean allowTrailingStop, Boolean isSpotTradingAllowed, Boolean isMarginTradingAllowed, List<Filter> filters, List<String> permissions) {
        super();
        this.symbol = symbol;
        this.status = status;
        this.baseAsset = baseAsset;
        this.baseAssetPrecision = baseAssetPrecision;
        this.quoteAsset = quoteAsset;
        this.quotePrecision = quotePrecision;
        this.quoteAssetPrecision = quoteAssetPrecision;
        this.baseCommissionPrecision = baseCommissionPrecision;
        this.quoteCommissionPrecision = quoteCommissionPrecision;
        this.orderTypes = orderTypes;
        this.icebergAllowed = icebergAllowed;
        this.ocoAllowed = ocoAllowed;
        this.quoteOrderQtyMarketAllowed = quoteOrderQtyMarketAllowed;
        this.allowTrailingStop = allowTrailingStop;
        this.isSpotTradingAllowed = isSpotTradingAllowed;
        this.isMarginTradingAllowed = isMarginTradingAllowed;
        this.filters = filters;
        this.permissions = permissions;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Symbol withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Symbol withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getBaseAsset() {
        return baseAsset;
    }

    public void setBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
    }

    public Symbol withBaseAsset(String baseAsset) {
        this.baseAsset = baseAsset;
        return this;
    }

    public Long getBaseAssetPrecision() {
        return baseAssetPrecision;
    }

    public void setBaseAssetPrecision(Long baseAssetPrecision) {
        this.baseAssetPrecision = baseAssetPrecision;
    }

    public Symbol withBaseAssetPrecision(Long baseAssetPrecision) {
        this.baseAssetPrecision = baseAssetPrecision;
        return this;
    }

    public String getQuoteAsset() {
        return quoteAsset;
    }

    public void setQuoteAsset(String quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    public Symbol withQuoteAsset(String quoteAsset) {
        this.quoteAsset = quoteAsset;
        return this;
    }

    public Long getQuotePrecision() {
        return quotePrecision;
    }

    public void setQuotePrecision(Long quotePrecision) {
        this.quotePrecision = quotePrecision;
    }

    public Symbol withQuotePrecision(Long quotePrecision) {
        this.quotePrecision = quotePrecision;
        return this;
    }

    public Long getQuoteAssetPrecision() {
        return quoteAssetPrecision;
    }

    public void setQuoteAssetPrecision(Long quoteAssetPrecision) {
        this.quoteAssetPrecision = quoteAssetPrecision;
    }

    public Symbol withQuoteAssetPrecision(Long quoteAssetPrecision) {
        this.quoteAssetPrecision = quoteAssetPrecision;
        return this;
    }

    public Long getBaseCommissionPrecision() {
        return baseCommissionPrecision;
    }

    public void setBaseCommissionPrecision(Long baseCommissionPrecision) {
        this.baseCommissionPrecision = baseCommissionPrecision;
    }

    public Symbol withBaseCommissionPrecision(Long baseCommissionPrecision) {
        this.baseCommissionPrecision = baseCommissionPrecision;
        return this;
    }

    public Long getQuoteCommissionPrecision() {
        return quoteCommissionPrecision;
    }

    public void setQuoteCommissionPrecision(Long quoteCommissionPrecision) {
        this.quoteCommissionPrecision = quoteCommissionPrecision;
    }

    public Symbol withQuoteCommissionPrecision(Long quoteCommissionPrecision) {
        this.quoteCommissionPrecision = quoteCommissionPrecision;
        return this;
    }

    public List<String> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<String> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public Symbol withOrderTypes(List<String> orderTypes) {
        this.orderTypes = orderTypes;
        return this;
    }

    public Boolean getIcebergAllowed() {
        return icebergAllowed;
    }

    public void setIcebergAllowed(Boolean icebergAllowed) {
        this.icebergAllowed = icebergAllowed;
    }

    public Symbol withIcebergAllowed(Boolean icebergAllowed) {
        this.icebergAllowed = icebergAllowed;
        return this;
    }

    public Boolean getOcoAllowed() {
        return ocoAllowed;
    }

    public void setOcoAllowed(Boolean ocoAllowed) {
        this.ocoAllowed = ocoAllowed;
    }

    public Symbol withOcoAllowed(Boolean ocoAllowed) {
        this.ocoAllowed = ocoAllowed;
        return this;
    }

    public Boolean getQuoteOrderQtyMarketAllowed() {
        return quoteOrderQtyMarketAllowed;
    }

    public void setQuoteOrderQtyMarketAllowed(Boolean quoteOrderQtyMarketAllowed) {
        this.quoteOrderQtyMarketAllowed = quoteOrderQtyMarketAllowed;
    }

    public Symbol withQuoteOrderQtyMarketAllowed(Boolean quoteOrderQtyMarketAllowed) {
        this.quoteOrderQtyMarketAllowed = quoteOrderQtyMarketAllowed;
        return this;
    }

    public Boolean getAllowTrailingStop() {
        return allowTrailingStop;
    }

    public void setAllowTrailingStop(Boolean allowTrailingStop) {
        this.allowTrailingStop = allowTrailingStop;
    }

    public Symbol withAllowTrailingStop(Boolean allowTrailingStop) {
        this.allowTrailingStop = allowTrailingStop;
        return this;
    }

    public Boolean getIsSpotTradingAllowed() {
        return isSpotTradingAllowed;
    }

    public void setIsSpotTradingAllowed(Boolean isSpotTradingAllowed) {
        this.isSpotTradingAllowed = isSpotTradingAllowed;
    }

    public Symbol withIsSpotTradingAllowed(Boolean isSpotTradingAllowed) {
        this.isSpotTradingAllowed = isSpotTradingAllowed;
        return this;
    }

    public Boolean getIsMarginTradingAllowed() {
        return isMarginTradingAllowed;
    }

    public void setIsMarginTradingAllowed(Boolean isMarginTradingAllowed) {
        this.isMarginTradingAllowed = isMarginTradingAllowed;
    }

    public Symbol withIsMarginTradingAllowed(Boolean isMarginTradingAllowed) {
        this.isMarginTradingAllowed = isMarginTradingAllowed;
        return this;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public Symbol withFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    public Symbol withPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

}
