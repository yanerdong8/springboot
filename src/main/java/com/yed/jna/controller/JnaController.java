package com.yed.jna.controller;

import com.yed.jna.entity.Clibrary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/jna")
public class JnaController {

    @RequestMapping("/test")
    public String testJNA(Map<String,Object> map){
        String password = new String("888888");
        byte[] cPassword = new byte[password.length()+1];
        cPassword = password.getBytes();
        int result = Clibrary.INSTANTCE.add(1,2);
        System.out.println("动态库加载成功！"+ result);
        map.put("hello", "Hello FrameMarker!");
        return "index";
    }

}
