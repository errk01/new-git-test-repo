package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AscII.printNumbers();
        AscII.printLowerCase();
        AscII.printUpperCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String firstName = input.nextLine();
        System.out.println("Hello " + firstName);

        System.out.print("Shall we play a game?");
        System.out.print("  Y/N: ");

        String Response = input.nextLine();
        switch (Response) {
            case "y", "Y", "yes" -> System.out.println("Lets continue");
            default -> {
                System.out.println("See you later");
                input.close();
            }
        }

        System.out.println("Do you drive a red car");
        System.out.print("  Y/N: ");
        String questions = input.nextLine();
        switch (questions) {
            case "y", "Y", "yes" -> System.out.println("Lucky");
            default -> System.out.println("How lame");
        }
        System.out.println("What is the name of your favorite pet?");
        String petName = input.nextLine();
        System.out.println(petName + "  is such a cute name!");
        System.out.println("How old is your pet?");
        String petAge = input.nextLine();

        System.out.println("What is your favorite number?");
        String favNum = input.nextLine();
        System.out.println(favNum + " ,good choice");

        System.out.println("What is two-digit model year of their car?");
        String carYr = input.nextLine();

        System.out.println("Do you have a favorite athlete?");
        System.out.print("  Y/N: ");
        String athlete = input.nextLine();
        if (athlete.equals("y")) {
            System.out.println("What is their number?");
            String sportNum = input.nextLine();
        }
        if (athlete.equals("Y")) {
            System.out.println("What is their number?");
            String sportNum = input.nextLine();
        }
        if (athlete.equals("N")) {
            System.out.println("That's okay.");
            String sportNum = input.nextLine();
        }
        else {
            System.out.println("");
        }

        System.out.println("What is the name of your favorite actor?");
        String actorName = input.nextLine();
        System.out.println("I like " + actorName + " too!");

        System.out.println("Enter a random number from 1 to 50");
        System.out.println();

        System.out.println("Do you want a lottery number?");
        System.out.print("  Y/N: ");
        String lotto = input.nextLine();
        if (lotto.equals("y")) {
            System.out.println("Okay, lets go");
            RandomNumber.printLottoNumber();
        } else {
            System.out.println("ok bye");
        }
    }
    }
