package org.jpm.rest.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jpm.rest.service.CountryServiceImpl;
import org.jpm.rest.service.ICountryService;

//In jaxrs we use @Path annotation to map the request to specific resource

@Path(value="/countries")
public class CountryController {
	//Step 2: create Instance variable of service interface
		private ICountryService countryService;
	//Step 3 : Instantiate the service in constructor
		public CountryController(){
			countryService = new CountryServiceImpl();
			//or get the service object from the ServiceFactory
			//countryService= ServiceFactory.getServiceInstance();
		}
		
	//Step 4:  write methods to invoke service 
		//http://localhost:8080/Webservice03_Rest/rest/countries/hello
		@GET
		@Path("/hello")
		@Produces(MediaType.TEXT_PLAIN)
		public String sayHello(){
			return "Hello From JAX-RS using jersy....";
		}
	// and map it to the specific HTTP request
	//jersy,RestEasy,CFX,Axis,spring etc.. are the rest providers	
	

}
