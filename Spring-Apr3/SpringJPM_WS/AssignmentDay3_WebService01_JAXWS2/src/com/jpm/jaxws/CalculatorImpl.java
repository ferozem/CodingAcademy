package com.jpm.jaxws;

import javax.jws.WebService;

/*SERVICE IMPLEMENTATION
 * The complete name of the service endpoint interface defining the service's abstract web service contract. 
 * This annotation allows the developer to separate the interface\contract from the implementation
 * 
 */

@WebService(endpointInterface ="com.jpm.jaxws.Calculator")
	public class CalculatorImpl implements Calculator{
		
		@Override
		public int addition(int param1, int param2){
			return param1 + param2;
		}
		@Override
		public int subtraction(int param1, int param2){
			return param1 - param2;
		}
		
		@Override
		public int multiplication(int param1, int param2){
			return param1 * param2;
		}
		
		@Override
		public int division(int param1, int param2){
			return param1 / param2;
		}
		
		@Override
		public int modulus(int param1, int param2){
			return param1 % param2;
		}
	}

