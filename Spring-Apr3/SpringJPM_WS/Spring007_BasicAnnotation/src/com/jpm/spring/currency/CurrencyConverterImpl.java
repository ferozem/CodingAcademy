package com.jpm.spring.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value= "currencyConverter")
public class CurrencyConverterImpl implements CurrencyConverter {
	
	@Autowired
	@Qualifier(value="exchangeService")
	private ExchangeService exchangeService;
	
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl instantiated...");
	}
	
	@Override
	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");
		
		return exchangeService.getExchangeRate() * dollars;
	}


	public ExchangeService getExchangeService() {
		
		System.out.println("getExchangeRate()... instantiated");
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("in the currency converter.. Injecting exchangeService");
		System.out.println("setExchangeRate()... instantiated");
		this.exchangeService = exchangeService;
	}

	
}
