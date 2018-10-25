package com.yed.springboot.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void topicSend(){
        String context = "hi, i am message 1";
        System.out.println("Sender1 : " + context);
        amqpTemplate.convertAndSend("exchange", "topic.message", context);
    }

    public void topicSends(){
        String context = "hi, i am message 2";
        System.out.println("Sender2 : " + context);
        amqpTemplate.convertAndSend("exchange", "topic.messages", context);
    }

}
