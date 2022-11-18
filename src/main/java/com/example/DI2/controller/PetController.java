package com.example.DI2.controller;

import com.example.DI2.repository.PetRepository;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public String getGreeting() {
        return "Pies";
    }
}
