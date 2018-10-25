package com.yed.springboot.mapper;

import com.yed.springboot.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserXMLMapper {

    List<User> getAll();

    void update(User user);

    User getUserById(int id);
}
