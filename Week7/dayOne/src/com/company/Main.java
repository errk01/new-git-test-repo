package com.company;

import com.company.people.Author;
import com.company.people.Person;
import com.company.people.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Java oops 2
        // obj vs class
        // An obj is a piece of data - 4, "Whom", false [1,2,3,4]
        // An a class is what type of data that is - int, String, boolean, Array


        // this is the instance of the object
        //Integer num = new Integer(4);

        // returns the class
        //num.getClass();

        // first way of creating a instance of obj
        Person firstPerson = new Person();

        // the second way
        Person secondPerson = new Person("John");

        // the last way
        Person thirdPerson = new Person("john", "doe", "Phx", 54, 6, false);
        thirdPerson.sayHello();

//        System.out.println(thirdPerson.birthday());
//        System.out.println(thirdPerson.birthYear(2021));


        Author new_Author = new Author();
        new_Author.setFirstName("Dan");


//        System.out.println(new_Author.writingBook());

        ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student();
        s1.setFirstName("Sara");
        s1.setAge(19);
        s1.setGradYear(2025);
        studentList.add(s1);

        Student s2 = new Student();
        s2.setFirstName("Ashley");
        s2.setAge(20);
        s2.setGradYear(2022);
        studentList.add(s2);

        for (Student s : studentList) {
            System.out.println("Name: " + s.getFirstName() +
                    "\nAge: " + s.getAge() + "\ngrad year: " +
                    s.getGradYear());
        }

    }
}
