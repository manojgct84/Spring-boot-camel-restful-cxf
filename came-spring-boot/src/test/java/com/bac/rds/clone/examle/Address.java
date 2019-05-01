package com.bac.rds.clone.examle;


class Address implements Cloneable {
	  public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	private String street;

	  private String city;

	  private String state;

	  private String zipCode;

	  public Address() {
	    this.street = "";
	    this.city = "";
	    this.state = "";
	    this.zipCode = "";
	  }

	  public Address(String street, String city, String state, String zipCode) {
	    this.street = street;
	    this.city = city;
	    this.state = state;
	    this.zipCode = zipCode;
	  }

	  public Object clone(){
	    try {
	      return super.clone();
	    } catch (CloneNotSupportedException e) {
	      return null; // will never happen
	    }
	  }

	  public String getAddress() {
	    return this.street + "\n" + this.city + ", " + this.state + " " + this.zipCode;
	  }
	}