package com.example.DI2;

import com.example.DI2.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ={"com.example.di2","pl.ex.example"})
//powyrzej pokazana adnotacja dociąga paczki do projektu wskazujemy z czego ma korzystać
@SpringBootApplication
public class Di2Application {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Di2Application.class, args);

		System.out.println("_______POLE");
		PropertyController propertyController = (PropertyController) ctx.getBean("propertyController");
		System.out.println(propertyController.getGreeting());

		System.out.println("_______Konstruktor");
		ConstructorController constructorController = (ConstructorController) ctx.getBean("constructorController");
		System.out.println(constructorController.getGreeting());

		System.out.println("_______SETTER");
		SetterController setterController = (SetterController) ctx.getBean("setterController");
		System.out.println(setterController.getGreeting());

		System.out.println("_______ZWIERZĘ");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.getGreeting());

		System.out.println("_______WYBRANY JĘZYK");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
	}
	}