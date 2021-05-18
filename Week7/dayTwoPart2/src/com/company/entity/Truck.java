package com.company.entity;

public class Truck extends Vehicle{
    boolean hasTruckBed = true;
    boolean hasBigTires = true;

    public Truck(int numGears, int wheels, String model, String make, boolean hasTruckBed, boolean hasBigTires) {
        super(numGears, wheels, model, make);
        this.hasTruckBed = hasTruckBed;
        this.hasBigTires = hasBigTires;
    }

    public Truck(boolean hasTruckBed, boolean hasBigTires) {
        this.hasTruckBed = hasTruckBed;
        this.hasBigTires = hasBigTires;
    }


}
