package com.jpm.rest.services;

import java.util.List;

import com.jpm.rest.Country;
import com.jpm.rest.dao.CountryDaoImpl;
import com.jpm.rest.dao.ICountryDao;

public class CountryServiceImpl implements ICountryService{
	private ICountryDao countryDao;
	public CountryServiceImpl(){
		countryDao = new CountryDaoImpl();
	}
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
