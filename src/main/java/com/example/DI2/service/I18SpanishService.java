package com.example.DI2.service;

import com.example.DI2.repository.GreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ES")
public class I18SpanishService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Spanish";
    }
}
