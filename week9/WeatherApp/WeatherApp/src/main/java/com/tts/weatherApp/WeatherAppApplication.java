package com.tts.weatherApp;

import com.tts.weatherApp.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class WeatherAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(WeatherAppApplication.class, args);

//		Person person = new Person();
//		person.firstName = "John";
//		person.lastName = "Doe";
//		person.age = 45;
//		person.favoriteFoods = Arrays.asList("Pizza","Stake","Pie");
//
//		System.out.println(person);

	}

}
