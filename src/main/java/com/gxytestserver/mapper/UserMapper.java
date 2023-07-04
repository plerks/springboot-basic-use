package com.gxytestserver.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.gxytestserver.entity.User;

@Mapper
@Repository
public interface UserMapper {
    @Select("select * from User")
    List<User> queryAll();

    @Select("select * from User where idNum = #{idNumber}")
    User queryByIdNumber(String idNumber);

    List<User> queryByName(@Param(value = "name") String name);
}
