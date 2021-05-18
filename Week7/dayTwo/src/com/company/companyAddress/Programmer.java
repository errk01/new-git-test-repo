package com.company.companyAddress;

public class Programmer {

    String name;

    Address programmerAddr;

    public Programmer(String name, Address programmerAddr) {
        this.name = name;
        this.programmerAddr = programmerAddr;
    }

    public String getName() {
        return name;
    }

    public Address getProgrammerAddr() {
        return programmerAddr;
    }
}
