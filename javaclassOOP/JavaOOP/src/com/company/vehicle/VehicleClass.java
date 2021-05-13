package com.company.vehicle;

public class VehicleClass {
// private constant (INTERNAL)
    private static final int MAX_DOORS = 6;
    private static final int MIN_DORRS = 1;

    // public constant (EXTERNAL)
    public static final String TYPE_SPORTY = "sporty";
    public static final String TYPE_SLOW = "family";

    private String carType;


    private String color;
    private int numberOfDoors;
// no-args constructor
    public VehicleClass(){
        //color = "blue";
        //numberOfDoors = 3;
    }

    // constructor with arguments or all args constructor
    public VehicleClass (String color, int numberOfDoors){
        this.color = color;
        this.numberOfDoors = numberOfDoors;
    }

//    // single argument constructor
//    public VehicleClass (String color){
//        this.color = color;
////        this.numberOfDoors = numberOfDoors;
//    }

    // getters
    public String getColor(){
        return color;
    }
    public String getCarType(){
        return carType;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }

//    setters
    public void setColor(String color){
        this.color = color;
    }
    public void setCarType(String carType){
        this.carType = carType;
    }
    public void setNumberOfDoors(int numberOfDoors){
        if(MIN_DORRS >= 1 && numberOfDoors <= MAX_DOORS){
            this.numberOfDoors = numberOfDoors;
        }else{
            this.numberOfDoors = -1;
        }

    }

    public void start(){
        System.out.println("Car is starting");
    }
    public void stop(){
        System.out.println("Car is drifting");
    }
    public void drive(){
        System.out.println("Car is racing ");
    }



}

