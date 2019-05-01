package com.bac.rds.clone.program;

public class Employee implements Cloneable {
	private String empName;
	private String cmpName;
	private String empNumber;

	public Employee() {
		this.empName = "";
		this.cmpName = "";
		this.empNumber = "";
	}

	public Employee(String empName, String cmpName, String empNumber) {
		//super();
		this.empName = empName;
		this.cmpName = cmpName;
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCmpName() {
		return cmpName;
	}

	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}
}
