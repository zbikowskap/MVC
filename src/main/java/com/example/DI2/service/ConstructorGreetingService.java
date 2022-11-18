package com.example.DI2.service;

import com.example.DI2.repository.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ConstructorGreetingService implements GreetingRepository {


    @Override
    public String sayGreeting() {
        return "Wstrzyknięcie przez konstruktor";
    }
}
