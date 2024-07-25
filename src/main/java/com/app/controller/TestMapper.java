package com.app.controller;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RestController;

@Mapper
public interface TestMapper {
	
	@Select("select 1 as no")
	public int testDB();

}
