package com.company;

import com.company.Vehicle.Car;
import com.company.Vehicle.Motorcycle;
import com.company.Vehicle.RallyCar;
import com.company.companyAddress.Address;
import com.company.companyAddress.Programmer;

public class Main {

    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.setDoors(2);
//        System.out.println(car1.getDoors());
//
//        Motorcycle bike = new Motorcycle();
//        bike.changeGears(5);
//        bike.accelerate(150);
//        bike.brake(1);
//        System.out.println("Motorcycle class");
//        bike.displayStatus();
//
//        RallyCar Evo = new RallyCar();
//        Evo.changeGears(4);
//        Evo.accelerate(60);
//        Evo.brake(2);
//        System.out.println("RallyCar class");
//        Evo.displayStatus();


        Address address = new Address(5000,"Someville","SD");

        Programmer obj = new Programmer("Jane", address);
        System.out.println(obj.getName());
        System.out.println(obj.getProgrammerAddr().getStreetNum());
        System.out.println(obj.getProgrammerAddr().getCity());
        System.out.println(obj.getProgrammerAddr().getState());
    }
}
