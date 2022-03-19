package pojo;

/*******JSON Mapping to Pojo Class for api/v3/exchangeInfo********/
public class RateLimit {

    private String rateLimitType;
    private String interval;
    private Long intervalNum;
    private Long limit;

    /**
     * No args constructor for use in serialization
     *
     */
    public RateLimit() {
    }

    /**
     *
     * @param intervalNum
     * @param limit
     * @param interval
     * @param rateLimitType
     */
    public RateLimit(String rateLimitType, String interval, Long intervalNum, Long limit) {
        super();
        this.rateLimitType = rateLimitType;
        this.interval = interval;
        this.intervalNum = intervalNum;
        this.limit = limit;
    }

    public String getRateLimitType() {
        return rateLimitType;
    }

    public void setRateLimitType(String rateLimitType) {
        this.rateLimitType = rateLimitType;
    }

    public RateLimit withRateLimitType(String rateLimitType) {
        this.rateLimitType = rateLimitType;
        return this;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public RateLimit withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    public Long getIntervalNum() {
        return intervalNum;
    }

    public void setIntervalNum(Long intervalNum) {
        this.intervalNum = intervalNum;
    }

    public RateLimit withIntervalNum(Long intervalNum) {
        this.intervalNum = intervalNum;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public RateLimit withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

}
