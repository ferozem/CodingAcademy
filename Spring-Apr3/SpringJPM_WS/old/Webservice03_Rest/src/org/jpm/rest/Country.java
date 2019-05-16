package org.jpm.rest;

import java.io.Serializable;

public class Country implements Serializable{
	private static final long serialVersionUID = -8249389487978600853L;
	private int countryId;
	private String countryName;
	private long population;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(int countryId, String countryName, long population) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", population=" + population + "]";
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
}