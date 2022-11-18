package com.example.DI2.controller;

import com.example.DI2.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {

    private final GreetingRepository greetingRepository;

    public ConstructorController(@Qualifier("constructorGreetingService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreeting(){
        return greetingRepository.sayGreeting();
    }
}
