package org.example;

//Write a Java program to accept two integers and return true if the either one is 15 or if
//their sum or difference is 15.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPlease insert two numbers");
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the first number\n");
        int number1 = in.nextInt();
        System.out.println("\nEnter the second number\n");
        int number2 = in.nextInt();

        if ((number1 == 15 || number2 == 15)||(number1+number2) == 15|| Math.abs(number1-number2)==15){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}