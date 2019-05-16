package com.jpm.aop;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void withdraw(double amount) {
		System.out.println("Withdrawing amount.... " +amount);

	}

	@Override
	public void logout() {
		System.out.println("Logged out");
	}

	@Override
	public void login() throws Exception {
		throw new Exception("Sorry!! Something went wrong while login!!");		
	}

	@Override
	public double checkBalance(int accId) {
		System.out.println("Returning current balance for account Id:"+accId);
		return 1000.00;
	}
	
	

}
