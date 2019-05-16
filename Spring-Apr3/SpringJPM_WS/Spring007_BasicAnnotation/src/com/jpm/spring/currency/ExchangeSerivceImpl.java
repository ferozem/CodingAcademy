package com.jpm.spring.currency;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value ="exchangeService")
public class ExchangeSerivceImpl implements ExchangeService {
	
	private double exchangeRate;
	
	public ExchangeSerivceImpl(double exchangeRate){
		System.out.println("ExchangeServiceImpl() .. instantiated");
		this.exchangeRate = exchangeRate;
	}

	
	public double getExchangeRate() {
		System.out.println("getEchangeRate()");
		return exchangeRate;
	}

	@Value(value="70.33")
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	

}
