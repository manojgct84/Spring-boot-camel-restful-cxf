package com.bac.rds.dozer.vo;

public class College {
	private String name;
	private String dep;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", dep=" + dep + ", address=" + address + "]";
	}

}
