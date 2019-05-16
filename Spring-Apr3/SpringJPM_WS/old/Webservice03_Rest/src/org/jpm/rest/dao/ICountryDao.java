
package org.jpm.rest.dao;
import java.util.List;

import org.jpm.rest.Country;

public interface ICountryDao {
	public List<Country> getAllCountries();
	public Country getCountry(int countryId);
	public Country addCountry(Country country);
	public Country deleteCountry(int countryId);
	public Country updateCountry(Country country);
}



