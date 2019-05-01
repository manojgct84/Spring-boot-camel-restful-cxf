package com.bac.rds.clone.program;

public class Student implements Cloneable {

	private String name;
	private String rollNo;
	private String dep;
	private String college;
	public Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Student(String name, String rollNo, String dep, String college) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.dep = dep;
		this.college = college;
		this.emp = new Employee();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	/*
	 * public Object clone() throws CloneNotSupportedException{ Employee emp =
	 * new Employee(getName(),getDep(),getRollNo()); return emp;
	 * 
	 * }
	 */
	public Object clone() throws CloneNotSupportedException {
		Student stud;
		stud = (Student) super.clone();
		stud.emp = (Employee) emp.clone();
		return stud;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Student [name=");
		stringBuilder.append(name);
		stringBuilder.append(", rollNo=");
		stringBuilder.append(rollNo);
		stringBuilder.append(", dep=");
		stringBuilder.append(dep);
		stringBuilder.append(", college=");
		stringBuilder.append(college);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
