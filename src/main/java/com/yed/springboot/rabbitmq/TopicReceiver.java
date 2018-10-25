package com.yed.springboot.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiver {

    @RabbitListener(queues = "topic.message")
    public void receive1(String str){
        System.out.println("Recieve1:"+ str);
    }

    @RabbitListener(queues = "topic.messages")
    public void receive2(String str){
        System.out.println("Recieve2:"+ str);
    }

}
