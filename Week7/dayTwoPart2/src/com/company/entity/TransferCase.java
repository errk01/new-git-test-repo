package com.company.entity;

public class TransferCase extends Vehicle {

    public TransferCase(){
        this.numGears = 4;
    }
    public TransferCase(int gears){
        this.numGears = gears;
    }

    private int numGears;

    public int getNumGears(){
        return this.numGears;
    }

}
