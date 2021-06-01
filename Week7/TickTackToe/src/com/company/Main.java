package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToeClass game = new TicTacToeClass();

        boolean flag = true;
        Scanner input = new Scanner(System.in);
        System.out.println("player 1 is x");


        while (flag) {
            game.displayBoard();
            if(game.isFull()) {
                System.out.println(" player one, Make your move");
                int firstPlayerRow = input.nextInt();
                int firstPlayerCol = input.nextInt();
                System.out.println("player two, make your move");
                int secondPlayerRow = input.nextInt();
                int secondPlayerCol = input.nextInt();
            }

            System.out.println("Q to quit");
            String quit = input.next();
            if (quit.equals("Q")) {
                flag = false;
            }
        }

    }

    }
