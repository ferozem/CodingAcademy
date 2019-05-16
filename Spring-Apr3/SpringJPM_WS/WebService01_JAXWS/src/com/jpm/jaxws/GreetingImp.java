package com.jpm.jaxws;

import javax.jws.WebService;

/*SERVICE IMPLEMENTATION
 * The complete name of the service endpoint interface defining the service's abstract web service contract. 
 * This annotation allows the developer to separate the interface\contract from the implementation
 * 
 */

@WebService(endpointInterface ="com.jpm.jaxws.Greeting")
public class GreetingImp implements Greeting {

	@Override
	public String getGreetingAsString(String name) {
		return "Hello From JAX-WS...." +name;
	}

}
