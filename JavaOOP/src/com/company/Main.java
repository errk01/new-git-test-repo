package com.company;

import com.company.vehicle.VehicleClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        VehicleClass car = new VehicleClass();
        car.setColor("Blue");
        car.setNumberOfDoors(3);
        car.getColor();
        car.getNumberOfDoors();
        car.start();
        car.stop();
        car.drive();
        car.getCarType();
        car.setCarType("Ford");

        VehicleClass carTwo = new VehicleClass();
        carTwo.setNumberOfDoors(3);
        carTwo.getNumberOfDoors();
        /// packages are lowerCase
        /// classes start with a UpperCase

//        ArrayList<String> arrList = null;
//        arrList.add("first");
//        arrList.size();
//        String val = arrList.get(1);
//        LinkedList<String> lList = new LinkedList<>();

//        if (arrList != null) {
//            System.out.println("num of elements" + arrList.size());
//        }else{
//            System.out.println("its empty");
//        }
//        boolean doors = VehicleClass.equalDoors(family, sporty);
    }

    public static boolean equalDoors(VehicleClass car, VehicleClass carTwo){
        return car.getNumberOfDoors() == carTwo.getNumberOfDoors();
    }

    
}
