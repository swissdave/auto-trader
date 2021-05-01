package com.dave.autotrader.tradingviewendpoint;

import com.dave.autotrader.domain.BuyOrSell;
import com.dave.autotrader.domain.TradingViewAlert;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradingViewAlertApplication {
	private BuyOrSell d;
	private TradingViewAlert event;

	public static void main(String[] args) {
		SpringApplication.run(TradingViewAlertApplication.class, args);
	}

}
