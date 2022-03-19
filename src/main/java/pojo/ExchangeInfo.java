package pojo;

import java.util.List;

/*******JSON Mapping to Pojo Class for api/v3/exchangeInfo********/
public class ExchangeInfo {

    private String timezone;
    private Long serverTime;
    private List<RateLimit> rateLimits = null;
    private List<Object> exchangeFilters = null;
    private List<Symbol> symbols = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public ExchangeInfo() {
    }

    /**
     *
     * @param rateLimits
     * @param exchangeFilters
     * @param timezone
     * @param serverTime
     * @param symbols
     */
    public ExchangeInfo(String timezone, Long serverTime, List<RateLimit> rateLimits, List<Object> exchangeFilters, List<Symbol> symbols) {
        super();
        this.timezone = timezone;
        this.serverTime = serverTime;
        this.rateLimits = rateLimits;
        this.exchangeFilters = exchangeFilters;
        this.symbols = symbols;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ExchangeInfo withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    public ExchangeInfo withServerTime(Long serverTime) {
        this.serverTime = serverTime;
        return this;
    }

    public List<RateLimit> getRateLimits() {
        return rateLimits;
    }

    public void setRateLimits(List<RateLimit> rateLimits) {
        this.rateLimits = rateLimits;
    }

    public ExchangeInfo withRateLimits(List<RateLimit> rateLimits) {
        this.rateLimits = rateLimits;
        return this;
    }

    public List<Object> getExchangeFilters() {
        return exchangeFilters;
    }

    public void setExchangeFilters(List<Object> exchangeFilters) {
        this.exchangeFilters = exchangeFilters;
    }

    public ExchangeInfo withExchangeFilters(List<Object> exchangeFilters) {
        this.exchangeFilters = exchangeFilters;
        return this;
    }

    public List<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
    }

    public ExchangeInfo withSymbols(List<Symbol> symbols) {
        this.symbols = symbols;
        return this;
    }

}
