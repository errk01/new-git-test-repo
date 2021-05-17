package com.company.people;

public class Student extends Person {
    int gradYear;
    boolean enrolled = false;

    public boolean isEnrolled() {
        return enrolled = true;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }
}
