package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Welcome new line");
//        System.out.println("Welcome new");
//        System.out.print("Welcome");

        Scanner userInput = new Scanner(System.in);
//        System.out.println("What is your name? ");
//        String firstName = userInput.nextLine();
//        System.out.printf("Hello %s!\n", firstName);
//        System.out.printf("Goodbye %s.\n", firstName);
//        System.out.printf("Goodbye %t.\n", firstName);



//        System.out.println("Enter a name: ");
//        String name = userInput.nextLine();
//        System.out.println("Give me an adverb: ");
//        String adverb = userInput.nextLine();
//        System.out.println("Give me an adjective: ");
//        String adjective = userInput.nextLine();
//        System.out.println("Give me a noun: ");
//        String noun = userInput.nextLine();
//        System.out.println("Give me another noun: ");
//        String nounTwo = userInput.nextLine();
//        System.out.println("Give me a number: ");
//        String number = userInput.nextLine();
//        System.out.println("Give me your name: ");
//        String yourName = userInput.nextLine();
//
//        System.out.println("Here is your story: ");
//        System.out.printf("\n Dear %s,", name);
//        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
//        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
//        System.out.printf("\n Sincerely, %s \n", yourName);

/**
 * Use the variables below to compose the following paragraph:
 * name, adjective, verbOne, verbTwo, number, yourName
 *
 * Dear name,
 * You are adverb adjective and I want to be your noun!
 * I want to go to the nounTwo with you in number days.
 * Sincerely, yourName
 * */

// not recommended
//int number, sum, answer;

// recommended
//        int number;
//        int sum ;
//        int answer;

// boolean
        boolean answer = true;

        char result = 'Y';
        char middleInitialiC = 0x0043;
        char lowerCaseA = '\u0061';
        char capA = 75;

        long longNumber = 230L;
        float someFloat = 97.86f;
        double someDbl = 396.905;

        int smallInt = 120;
        int bigInt = 550;


        /// cast downcast the int(4b) to a byte(1b).

        byte b1 = (byte)smallInt;
        byte b2 = (byte)bigInt;

        short s1 = (short)bigInt;

        int x = 9;
        int y = 5;

//        int sum = x+y;
        int sub = x-y;
        int div = x/y;
        int multi = x*y;
        int mod = x%y;

        int num = 2;
        num++;
        ++num;
        num--;
        --num;

        System.out.println(num);

        int sum = x/=y;
        System.out.println(sum);


//        System.out.println(x==y);
//        System.out.println(x!=y);
//        System.out.println(x!=y);
//        System.out.println(x>y);
//        System.out.println(x<y);
//        System.out.println(x>=y);
//        System.out.println(x<=y);
//
//        if (sum > 4 && sum < 20) {
//            System.out.println("this works");
//
//        }else{
//            System.out.println("Dont work");
//        }
//
//        if(userInput.equals("cash") || userInput.equals("credit")){
//            System.out.println(" thanks for shopping");
//        }else{
//            System.out.println("something clever");
//        }
//
//
//        int ageLimit = 18;
//
//        System.out.println(" How old are you");
//
//        int age = userInput.nextInt();
//
//        if (age < ageLimit) {
//            System.out.println("Need to be 21 to enter");
//        }

        int currentScoreOfGame;
        int current_score_of_score;
        int FinalScoreOfGame;



        final double TAX_RATE = 0.5;


        String str = "Hello";




        String str2 = new String("World");

        Integer nt = new Integer(55);


        Double number = Double.parseDouble("1200.77");

        System.out.println(str.length());
        System.out.println(str.concat(str2));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }
}
