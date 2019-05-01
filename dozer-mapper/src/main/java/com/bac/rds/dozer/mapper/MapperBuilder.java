package com.bac.rds.dozer.mapper;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bac.rds.dozer.vo.College;
import com.bac.rds.dozer.vo.Student;

@Component
public class MapperBuilder {

	@Autowired
	DozerBeanMapper mapper;
	
	@Autowired
	BeanMappingBuilder builder;

	public Mapper getMapper() {
		builder.mapping(Student.class, College.class)
				.fields("name", "name")
				.fields("dep", "dep")
				.fields("address","address");
		
		mapper.addMapping(builder);
		return mapper;
	}
}