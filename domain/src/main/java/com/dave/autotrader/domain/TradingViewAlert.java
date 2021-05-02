package com.dave.autotrader.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.Instant;

public class TradingViewAlert {

    private final BuyOrSell buyOrSell;
    private final String ticker;
    private final BigDecimal price;
    private final Instant tradingViewTime;
    private final String indicatorName;
    private final long interval;

    public TradingViewAlert(BuyOrSell buyOrSell, String ticker, BigDecimal price, Instant tradingViewTime, String indicatorName, long interval) {
        this.buyOrSell = buyOrSell;
        this.ticker = ticker;
        this.price = price;
        this.tradingViewTime = tradingViewTime;
        this.indicatorName = indicatorName;
        this.interval = interval;
    }
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public TradingViewAlert(@JsonProperty("BuyOrSell") String buyOrSell,
                            @JsonProperty("Ticker") String ticker,
                            @JsonProperty("Price") BigDecimal price,
                            @JsonProperty("Time")String tradingViewTime,
                            @JsonProperty("IndicatorName") String indicatorName,
                            @JsonProperty("Interval") long interval) {
        this(BuyOrSell.valueOf(buyOrSell),ticker,price,Instant.parse(tradingViewTime),indicatorName,interval);
    }

    public BuyOrSell getBuyOrSell() {
        return buyOrSell;
    }

    public String getTicker() {
        return ticker;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Instant getTradingViewTime() {
        return tradingViewTime;
    }

    public String getIndicatorName() {
        return indicatorName;
    }

    public long getInterval() {
        return interval;
    }

    @Override
    public String toString() {
        return "TradingViewAlert{" +
                "buyOrSell=" + buyOrSell +
                ", ticker='" + ticker + '\'' +
                ", price=" + price +
                ", tradingViewTime=" + tradingViewTime +
                ", indicatorName='" + indicatorName + '\'' +
                ", interval=" + interval +
                '}';
    }
}
