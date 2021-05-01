package com.dave.autotrader.tradingviewendpoint;

import com.dave.autotrader.domain.BuyOrSell;
import com.dave.autotrader.domain.TradingViewAlert;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TradingViewAlertController {

    private final TradingViewAlert dummyAlert = new TradingViewAlert(BuyOrSell.BUY, "BTCUSD", new BigDecimal("0.01"), Instant.now(), "MDX", 1);

    @GetMapping("/alert")
    List<TradingViewAlert> all(){
        return new ArrayList<TradingViewAlert>(Arrays.asList(new TradingViewAlert[]{dummyAlert}));
    }

    @PostMapping("/alert")
    public TradingViewAlert newTradingViewEvent(@RequestBody TradingViewAlert newTradingViewEvent){
        System.out.println("Hi Dave");
            return dummyAlert;
    }

    @PutMapping("/alert")
    public TradingViewAlert replaceTradingViewEvent(@RequestBody TradingViewAlert newTradingViewEvent){
        System.out.println("Hi Dave");
        return dummyAlert;
    }

    @DeleteMapping("/alert")
    void deleteTradingViewAlert(){
        return;
    }


}
