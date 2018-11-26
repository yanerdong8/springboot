package com.yed.springboot.service;

import com.yed.springboot.model.User;
import com.yed.springboot.mapper.UserMapper;
import com.yed.springboot.mapper.UserXMLMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description UserService
 * @Author yed
 * @Date 10:35 2018/9/26
 **/
@Service
public class UserService {

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private UserMapper userMapper;

    @Autowired
    private UserXMLMapper userXMLMapper;


    public List<User> getUsers(){
        List<User> users = userMapper.getAll();
        return users;
    }

    public List<User> getUsersXML(){
        List<User> users = userXMLMapper.getAll();
        return users;
    }


    @CachePut(value="user", key = "'id'+#user.getId()",unless = "#result == null")
    public User update(User user){
        userXMLMapper.update(user);
        return user;
    }


    @Cacheable(value ="user", key = "'id'+#id")
    public User getUser(int id){
        return userXMLMapper.getUserById(id);
    }
}
