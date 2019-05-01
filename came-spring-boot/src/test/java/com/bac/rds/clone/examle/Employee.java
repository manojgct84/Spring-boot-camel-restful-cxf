package com.bac.rds.clone.examle;

class Employee implements Cloneable {
	  private String lastName;

	  private String firstName;

	  private Double salary;

	  public Address address;

	  public Employee(String lastName, String firstName) {
	    this.lastName = lastName;
	    this.firstName = firstName;
	    this.address = new Address();
	  }

	  public String getLastName() {
	    return this.lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public String getFirstName() {
	    return this.firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public Double getSalary() {
	    return this.salary;
	  }

	  public void setSalary(Double salary) {
	    this.salary = salary;

	  }

	  public Object clone() {
	    Employee emp;
	    try {
	      emp = (Employee) super.clone();
	      emp.address = (Address) address.clone();
	    } catch (CloneNotSupportedException e) {
	      return null; // will never happen
	    }
	    return emp;
	  }

	  public String toString() {
	    return this.getClass().getName() + "[" + this.firstName + " " + this.lastName + ", "
	        + this.salary + "]";
	  }
	}
