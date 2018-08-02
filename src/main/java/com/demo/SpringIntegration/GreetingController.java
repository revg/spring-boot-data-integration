package com.demo.SpringIntegration;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Greeting greet(@RequestParam(value="name", defaultValue = "World") String name){
        return new Greeting(String.format("Hello %s", name));
    }
}
