package com.jpm.spring.currency;

public class ExchangeSerivceImpl implements ExchangeService {
	
	private double exchangeRate;
	
	public ExchangeSerivceImpl(double exchangeRate){
		System.out.println("ExchangeServiceImpl() .. instantiated");
		this.exchangeRate = exchangeRate;
	}

	@Override
	public double getExchangeRate() {
		System.out.println("getEchangeRate()");
		return exchangeRate;
	}

}
