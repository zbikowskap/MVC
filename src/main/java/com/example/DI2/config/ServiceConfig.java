package com.example.DI2.config;

import pl.ex.example.CatService;
import pl.ex.example.DogService;


// tworzenie beanów przy pomocy klasy konfiguracyjnenj gdyby nie było adnotacji w klasach
public class ServiceConfig {

   // @Bean
    DogService dogService(){
        return new DogService();
    }

   // @Bean
    CatService catService(){
        return new CatService();

    }
}
