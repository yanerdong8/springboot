package com.yed.springboot.controller;

import com.yed.springboot.domain.User;
import com.yed.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public String getUsers(){
        List<User> users = userService.getUsers();
        return ((List) users).toString();
    }

    @RequestMapping("/allxml")
    public String getUsersXML(){
        List<User> users = userService.getUsersXML();
        return ((List) users).toString();
    }

    @RequestMapping("/update")
    public void update(){
        User user = new User();
        user.setId(1);
        user.setUserName("yed222");
        user.setPassword("111111");
        userService.update(user);
    }

    @RequestMapping("/getuser")
    public void getUser(){
      User user =  userService.getUser(1);
      System.out.println(user.toString());

        User user1 =  userService.getUser(1);
        System.out.println(user1.toString());

        User user2 =  userService.getUser(1);
        System.out.println(user2.toString());
    }
}
