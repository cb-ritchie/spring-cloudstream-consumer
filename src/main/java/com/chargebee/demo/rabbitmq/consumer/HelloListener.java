package com.chargebee.demo.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloBinding.class)
public class HelloListener {

    private static final Logger logger = LoggerFactory.getLogger(HelloListener.class);

    @StreamListener("greetingChannel")
    public void processHelloGreetingChannel(String msg){
        logger.info(msg);
    }
}
