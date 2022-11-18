package com.example.DI2.controller;

import com.example.DI2.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {
    public GreetingRepository greetingRepository;

    @Autowired
    public void setGreetingRepository(@Qualifier("setterGreetingService") GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;

    }

    public String getGreeting(){
        return greetingRepository.sayGreeting();
    }
}
