package com.company.people;

public class Author extends Person {
    String book;
    boolean isCurrent;

    public boolean writingBook(){
       return isCurrent=false;
    }
}
