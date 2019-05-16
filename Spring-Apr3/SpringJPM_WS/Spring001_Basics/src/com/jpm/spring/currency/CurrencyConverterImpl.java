package com.jpm.spring.currency;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	private ExchangeService exchangeService;
	
	

	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl instantiated.....");
	}



	public ExchangeService getExchangeService() {
		return exchangeService;
	}



	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}



	@Override
	public double dollarsToRupees(double dollars) {
		return exchangeService.getExchangeRate()*dollars;
	}



}
