package com.company.entity;

public class Vehicle {
    int numGears;
    int wheels;
    String model;
    String make;

    public Vehicle(int numGears, int wheels, String model, String make) {
        this.numGears = numGears;
        this.wheels = wheels;
        this.model = model;
        this.make = make;
    }

    public Vehicle() {
    }


    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
