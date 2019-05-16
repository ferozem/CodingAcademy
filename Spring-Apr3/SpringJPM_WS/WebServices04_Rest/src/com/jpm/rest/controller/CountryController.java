package com.jpm.rest.controller;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jpm.rest.Country;
import com.jpm.rest.services.CountryServiceImpl;
import com.jpm.rest.services.ICountryService;

@Path(value="/countries")
public class CountryController {
	//step2: create instance variable of CountryService
	private ICountryService countryService;
	//step3: instantiate the service in constructor
	public CountryController(){
		countryService = new CountryServiceImpl();
		//we can also get the service method from serviceFactory
	}
	//step4: write method to invoke service
	//and map it to the specific HTTP Request.
	
	//http://localhost:8080/WebServices04_Rest/rest/countries/hello
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "Hello From JAX-RS jersy...";
	}
	
	//step5: and map to the specific HTTP request
	//jersy,AFX,AXIS Spring, are the rest providers.
	
	
	@GET
	@Path("/countryList")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getAllCountries(){
		List<Country> list = countryService.getAllCountries();
		return list;
	}
	
	@POST
	@Path("/addCountry")
	@Produces(MediaType.APPLICATION_JSON)
	public Country addNewCountry(@FormParam("txtId")int countryId, @FormParam("txtName")String countryName, @FormParam("txtPopulation")long population){
		//fetching the input value of country from page
		//creating the country object
		Country country = new Country(countryId, countryName, population);
		return countryService.addCountry(country);
	}
	
}
