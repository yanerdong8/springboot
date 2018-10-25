package com.yed.springboot.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloReceiver {

    @RabbitListener(queues = "testQueue")
    public void receive(String str){
        System.out.println("Recieve:"+ str);
    }
}
