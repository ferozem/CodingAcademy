package com.jpm.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class GreetingService implements iGreeting {

	@Override
	@GET
	@Path("/{pName}")
	/*
	 * @PathParam-Binds the parameter passed to the method to a value in path.
	 * user along with the mehtod parameter.
	 */
	public Response getMsg(String name) {
		
		String output = "Hello" + name +", From Rest";
		return Response.status(200).entity(output).build();
		/*
		 * custom response
		 * he entity() method returns the object which we want converted in to an		
		 * HTTP message body.
		 * The getStatus() method returns the HTTP response Code.
		 * build() - build the custom response.
		 * 
		 */
		
		
	}

}
