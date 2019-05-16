package com.jpm.aop;

public interface CustomerService {
	void withdraw(double amount);
	void logout();
	void login() throws Exception;
	double checkBalance(int accId);
}
