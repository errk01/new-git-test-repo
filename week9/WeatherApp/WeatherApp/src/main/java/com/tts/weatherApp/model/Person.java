package com.tts.weatherApp.model;

import lombok.Data;

import java.util.List;



@Data
public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public List<String> favoriteFoods;

}
