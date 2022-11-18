package com.example.DI2.service;

import com.example.DI2.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Wstrzyknięcie z pola";
    }
}
