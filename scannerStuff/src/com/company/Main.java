package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);


        System.out.println("what is your name?");
        String userName = userInput.next();
        System.out.println("hello, " + userName);
        System.out.println("what is your pets age");
        int petAge = userInput.nextInt();
        System.out.println("Who is your favorite actor?");
        String actorName = userInput.next();
        System.out.println("Hello " + userName +","+" your pet age is "+ petAge + actorName);

    }
}
