package com.example.DI2.controller;

import com.example.DI2.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyController {
    @Autowired
    @Qualifier("propertyGreetingService")
    private GreetingRepository greetingRepository;

    public String getGreeting(){
        return greetingRepository.sayGreeting();
    }
}
