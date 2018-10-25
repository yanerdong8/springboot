package com.yed.springboot.controller;

import com.yed.springboot.rabbitmq.TopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MQController {

    @Autowired
    private TopicSender topicSender;

    @RequestMapping("/testmq")
    public String testmq(Map<String,Object> map){

        map.put("hello", "Hello FrameMarker!");
        topicSender.topicSend();
        topicSender.topicSends();
        return "index";
    }
}
