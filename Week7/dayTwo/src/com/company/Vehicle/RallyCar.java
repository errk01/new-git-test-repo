package com.company.Vehicle;

import com.company.repo.VehicleRepo;

public class RallyCar implements VehicleRepo {
    int speed;
    int gear;

    @Override
    public void changeGears(int newGear) {
        gear = newGear;
    }

    @Override
    public void accelerate(int increment) {
        speed = speed + increment;
    }

    @Override
    public void brake(int eBrake) {
        speed = speed - eBrake;
    }
    public void displayStatus(){
        System.out.println("speed: "+speed+"\ngear: "+gear);
    }
}
