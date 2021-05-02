package com.dave.autotrader.tradingviewendpoint;

import com.dave.autotrader.domain.BuyOrSell;
import com.dave.autotrader.domain.TradingViewAlert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/alert", produces = MediaType.APPLICATION_JSON_VALUE)
public class TradingViewAlertController {

    private static final Logger log = LoggerFactory.getLogger(TradingViewAlertController.class);
    private final TradingViewAlert dummyAlert = new TradingViewAlert(BuyOrSell.BUY, "BTCUSD", new BigDecimal("0.01"), Instant.now(), "MDX", 1);

    @GetMapping
    List<TradingViewAlert> all() {
        log.info("Hi Dave, get");
        return Collections.singletonList(dummyAlert);
    }

    @PostMapping
    public TradingViewAlert newTradingViewEvent(@RequestBody TradingViewAlert newTradingViewEvent) {
        log.info("Hi Dave, post");
        return dummyAlert;
    }

    @PutMapping
    public TradingViewAlert replaceTradingViewEvent(@RequestBody TradingViewAlert newTradingViewEvent) {
        log.info("Hi Dave, put");
        return dummyAlert;
    }

    @DeleteMapping
    void deleteTradingViewAlert() {
        log.info("Hi Dave, delete");
    }

}
