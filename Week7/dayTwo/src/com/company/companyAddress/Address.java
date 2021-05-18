package com.company.companyAddress;

public class Address {

    int streetNum;
    String city;
    String state;

    public Address(int streetNum, String city, String state) {
        this.streetNum = streetNum;
        this.city = city;
        this.state = state;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
