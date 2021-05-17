package com.company.people;

public class Person {
    // Default: without an access modifier specified, they are accessible only within the same package
    //Private: can only be accessed within the class it is declared
    // Protected: accessible within the same package or sub classes in different packages
    // Public: can be accessed from every where in the program

    // Constant
    //Cannot be marked static,
    // because then they'd become class variables.
//    private static final String DATA_TYPE = "Whatever";

    // instance variables
    private String firstName;
    private String lastName;
    private String location;
    private int age;
    private double height;
    private boolean hasJob;

    // The first step of creating an object
    public Person(String firstName, String lastName, String location, int age, double height, boolean hasJob) {
        // local variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.age = age;
        this.height = height;
        this.hasJob = hasJob;
    }

    // One argument constructor
    public Person(String firstName) {

    }

    // Empty constructor / default constructor
    public Person() {
    }


    public void sayHello() {
        System.out.println("Hello, " + firstName);
    }

    public int birthday() {
        return (age + 1);
    }

//    public int birthday(String month){
//        return (age + 1);
//    }

    public int birthYear(int currentYear) {
        return currentYear - age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasJob() {
        return hasJob;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hasJob=" + hasJob +
                '}';
    }
}
