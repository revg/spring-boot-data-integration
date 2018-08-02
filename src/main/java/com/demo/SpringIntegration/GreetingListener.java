package com.demo.SpringIntegration;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class GreetingListener {

    @JmsListener(destination = "GreetingQ")
    public void receiveMessage(String greeting) {
        System.out.println("Received <" + greeting + ">");
    }
}
