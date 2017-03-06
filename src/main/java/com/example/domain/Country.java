package com.example.domain;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Country {

	private String code;
	private String name;
	private String continent;
	private String region;
	private BigDecimal surfaceArea;
	private BigDecimal indepYear;
	private BigDecimal population;
	private BigDecimal lifeExpectancy;
	private BigDecimal gnp;
	private BigDecimal gnpOld;
	private String localName;
	private String governmentForm;
	private String headOfState;
	private BigDecimal capital;
	private String code2;
	private List<City> cities;

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public Country() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		String str=null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			str =mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public BigDecimal getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(BigDecimal surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public BigDecimal getIndepYear() {
		return indepYear;
	}

	public void setIndepYear(BigDecimal indepYear) {
		this.indepYear = indepYear;
	}

	public BigDecimal getPopulation() {
		return population;
	}

	public void setPopulation(BigDecimal population) {
		this.population = population;
	}

	public BigDecimal getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(BigDecimal lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public BigDecimal getGnp() {
		return gnp;
	}

	public void setGnp(BigDecimal gnp) {
		this.gnp = gnp;
	}

	public BigDecimal getGnpOld() {
		return gnpOld;
	}

	public void setGnpOld(BigDecimal gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public BigDecimal getCapital() {
		return capital;
	}

	public void setCapital(BigDecimal capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	
}
