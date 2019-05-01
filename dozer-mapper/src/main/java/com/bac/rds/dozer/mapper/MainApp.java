package com.bac.rds.dozer.mapper;

import org.apache.commons.lang3.text.StrSubstitutor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bac.rds.dozer.vo.Student;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-contex.xml");
		Student student = new Student();
		
		student.setName("Manojkumar");
		student.setDep("IT");
		student.setAddress("CBE");
		
		MapperTransformer obj = (MapperTransformer) context.getBean("mapper");
		obj.getMapper(student);
	}
}
