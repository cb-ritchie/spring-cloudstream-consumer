package com.chargebee.demo.rabbitmq.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface HelloBinding {

    @Input("greetingChannel")
    SubscribableChannel greet();
}
