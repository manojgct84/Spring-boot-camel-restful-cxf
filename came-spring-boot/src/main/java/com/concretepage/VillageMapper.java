package com.concretepage;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface VillageMapper {
	@Results({
        @Result(property = "vid", column = "id"),
        @Result(property = "villageName", column = "name"),
        @Result(property = "district", column = "district")
    })
	@Select("SELECT id, name, district from village WHERE id = #{id}")
	Village selectVillage(int id);
	@Insert("INSERT into village(name,district) VALUES(#{villageName}, #{district})")
	void insertVillage(Village village);
	@Update("UPDATE village SET name=#{villageName}, district =#{district} WHERE id =#{vid}")
	void updateVillage(Village village);
	@Delete("DELETE FROM village WHERE id =#{id}")
	void deleteVillage(int id);
}
