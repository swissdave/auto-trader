package com.dave.autotrader.tradingviewendpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = TradingViewAlertApplication.class)
public class TradingViewAlertApplication {

	public static void main(String[] args) {
		SpringApplication.run(TradingViewAlertApplication.class, args);
	}

}
