package com.example.DI2.controller;

import com.example.DI2.repository.GreetingRepository;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingRepository greetingRepository;

    public I18nController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
    public String sayHello(){
        return greetingRepository.sayGreeting();
    }
}
