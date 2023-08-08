package com.rabbitmq.rabbitmqconsumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqConsumerApplication implements MessageListener {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerApplication.class, args);
    }

    @Override
    public void onMessage(Message message) {
        System.out.println("message =[" + new String(message.getBody()) + "]");
    }
}
