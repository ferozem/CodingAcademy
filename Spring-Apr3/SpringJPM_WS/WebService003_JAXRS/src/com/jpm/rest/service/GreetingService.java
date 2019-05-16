package com.jpm.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class GreetingService implements iGreeting {

	@Override
	@GET
	@Path("/{pName}")
	public Response getMsg(@PathParam("pName")String name) {
		String output = "Hello "+name+" ,from Rest";
		return Response.status(200).entity(output).build();
	}

}
