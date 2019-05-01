package com.bac.rds.clone.examle;

public class MainClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee("M", "A");
		emp1.setSalary(40000.0);
		emp1.address = new Address("First Street", "San F", "CA", "93702");
		Employee emp2 = (Employee) emp1.clone();
		printEmployee(emp1);
		printEmployee(emp2);

		emp2.setLastName("Smith");
		emp2.address = new Address("Street", "B", "CA", "93722");

		printEmployee(emp1);
		printEmployee(emp2);

	}

	private static void printEmployee(Employee e) {
		System.out.println(e.getFirstName() + " " + e.getLastName());
		System.out.println(e.address.getAddress());
		System.out.println("Salary: " + e.getSalary());
	}
}
