package com.dave.autotrader.domain;

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

    public TradingViewAlert(String buyOrSell, String ticker, BigDecimal price, Instant tradingViewTime, String indicatorName, long interval) {
        this(BuyOrSell.valueOf(buyOrSell),ticker,price,tradingViewTime,indicatorName,interval);
    }

}