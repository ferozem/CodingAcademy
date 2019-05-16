package com.jpm.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style= Style.RPC)
public interface Calculator {
	
	@WebMethod
	public int addition(int param1, int param2);
	
	@WebMethod
	public int subtraction(int param1, int param2);
	
	@WebMethod
	public int multiplication(int param1, int param2);
	
	@WebMethod
	public int division(int param1, int param2);
	
	@WebMethod
	public int modulus(int param1, int param2);

}
