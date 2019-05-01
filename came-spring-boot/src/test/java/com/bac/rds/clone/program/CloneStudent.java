package com.bac.rds.clone.program;

public class CloneStudent {
	
	public static void main(String args[]) throws CloneNotSupportedException{
		Student stud = new Student("Manoj", "10002", "ECE", "GCT");
	//	Student stud1 = (Student) stud.clone();
	//	System.out.println("stud1Clone " +stud1);
/*		System.out.println("\n");
		Student stud2 = stud;
		System.out.println("stud2 "+stud2);
		System.out.println("\n");
		stud.setCollege("KCT");
		System.out.println("\n");
		System.out.println("stud "+stud);
		System.out.println("stud2 "+stud2);
		System.out.println("\n");*/
		//System.out.println("stud1Clone " +stud1);
		
		stud.emp = new Employee("Manoj","JPMC", "1002020");
		Student empStud1 = (Student) stud.clone();
		System.out.println("############ emp:" +empStud1);
	}
}
