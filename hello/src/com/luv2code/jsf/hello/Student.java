package com.luv2code.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;	
	List<String> countryOptions;
	private String[] operatingSystemList;

	//construtor vazio
	public Student() {
		countryOptions = new ArrayList<>();
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("Germany");
		countryOptions.add("India");
		countryOptions.add("Turkey");
		countryOptions.add("United Kingdom");
		countryOptions.add("United States");
		
		
	}

	//getters and setters
	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystemList() {
		return operatingSystemList;
	}

	public void setOperatingSystemList(String[] operatingSystemList) {
		this.operatingSystemList = operatingSystemList;
	}
	
	
}
