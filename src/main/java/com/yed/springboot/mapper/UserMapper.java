package com.yed.springboot.mapper;

import com.yed.springboot.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    @Results({
            @Result(property="userName",column = "userName"),
            @Result(property = "password", column = "password")
    })
    List<User> getAll();

    @Insert("insert into user(id, userName, password) values(#{id}, #{userName},#{password)")
    void insert(User user);

    @Update("update user set userName=#{userName} where id=#{id}")
    void update(User user);


}
