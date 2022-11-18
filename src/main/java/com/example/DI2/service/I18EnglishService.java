package com.example.DI2.service;

import com.example.DI2.repository.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"EN","default"}) // defoultowo domyślnie ma brać j.ang
@Primary
public class I18EnglishService implements GreetingRepository {
    @Override
    public String sayGreeting() {
        return "Angielski";
    }
}
