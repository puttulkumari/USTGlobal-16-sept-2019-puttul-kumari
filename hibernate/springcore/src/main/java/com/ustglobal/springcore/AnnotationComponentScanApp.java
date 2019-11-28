package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.AnnotationComponentScanConfiguration;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationComponentScanApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationComponentScanConfiguration.class);
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("i love you");
		System.out.println(hello.getMsg());
		
		

		Pet pet = context.getBean(Pet.class);
		pet.setName("Google");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}

}
