package com.jpm.spring.hello;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	private double exchangeRate;
	
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl instaniated...");
	}

	@Override
	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()..");
		return dollars * exchangeRate;
	}

	public double getExchangeRate() {
		System.out.println("getExhcangeRate()..");
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		System.out.println("setExhcangeRate()..");
		this.exchangeRate = exchangeRate;
	}

}
