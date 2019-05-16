package org.jpm.rest.service;

import java.util.List;

import org.jpm.rest.Country;
import org.jpm.rest.dao.CountryDaoImpl;
import org.jpm.rest.dao.ICountryDao;

public class CountryServiceImpl implements ICountryService {
	
	//Step 1: create instance variable of dao Interface
	
	private ICountryDao countryDao;
	//Step 2: create the object of dao class in constructor
	public CountryServiceImpl(){
		countryDao= new CountryDaoImpl();
		//ServiceFactory.getCountryDao();
	}
	//Step 3: invoke dao layer method in each method of service
	//step 4: cross verify method not return null or 0

	@Override
	public List<Country> getAllCountries() {
	return countryDao.getAllCountries();
	}

	@Override
	public Country getCountry(int countryId) {
		return countryDao.getCountry(countryId);
	}

	@Override
	public Country addCountry(Country country) {
		return countryDao.addCountry(country);
	}

	@Override
	public Country deleteCountry(int countryId) {
		return countryDao.deleteCountry(countryId);
	}

	@Override
	public Country updateCountry(Country country) {
		return countryDao.updateCountry(country);
	}

}
