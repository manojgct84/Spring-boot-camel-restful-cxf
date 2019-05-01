package com.bac.rds.dozer.mapper;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.bac.rds.dozer.vo.College;
import com.bac.rds.dozer.vo.Student;

public class MapperTransformer {

	@Autowired
	Mapper map;
	
	public Object getMapper(Student student){
		
		if (student !=null){
			College college = map.map(student, College.class);
			System.out.println("College:" + college);
		}
		
		return null;
		
		
	}
}
