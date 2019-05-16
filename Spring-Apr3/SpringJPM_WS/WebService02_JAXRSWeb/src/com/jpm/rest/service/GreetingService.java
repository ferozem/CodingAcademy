package com.jpm.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class GreetingService implements IGreeting {

	@Override
	@GET
	@Path("/{pName}")
	public Response getMsg(@PathParam("pName") String name) {
		
		String output = "Hello" + name + ", FromRest";
		return Response.status(200).entity(output).build();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/customerList")
	public ArrayList<Customer> getCustomerList(){
		ArrayList<Customer> list =new ArrayList<Customer>();
		Customer c1 = new Customer(111,"Surya","s@gmail.com","8880299889");
		Customer c2 = new Customer(112,"Surya Chandra","s@gmail.com","8880299889");
		Customer c3 = new Customer(113,"Ravi Kumar","s@gmail.com","8880299889");
		list.add(c1);
		list.add(c2);
		list.add(c3);
		GenericEntity<List<Customer>> entity = new GenericEntity<List<Customer>> (list){};
		Response repsonse = Response.ok(entity).build();
		return list;
		
		
	}
	
}
