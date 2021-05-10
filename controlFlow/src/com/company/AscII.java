package com.company;

public class AscII {

        public static void printNumbers(){
            System.out.println("Valid number inputs:");
            for(int i=48;i<=57;i++){
                System.out.print((char)i);
            }
            System.out.println();
        }

        public static void printLowerCase(){
            System.out.println("Valid lowercase inputs:");
            for(int i=97;i<=122;i++){
                System.out.print((char)i);
            }
            System.out.println();
        }

        public static void printUpperCase(){
            System.out.println("Valid uppercase inputs:");
            for(int i=65;i<=90;i++){
                System.out.print((char)i);
            }
            System.out.println();
        }

}
