package org.example;

//Write a Java program to get whole and fractional parts from a double value

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPlease insert a number that contains decimals");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();

        decimalnumber(number);
    }


    public static void decimalnumber(double number) {
        int whole = (int) number;
        double fraction = number - whole;
        if (fraction ==0){
            System.out.println("Number is Int type");
        }
        else {
            System.out.println("Number is type Double");
        }

        System.out.println("The whole part of the inserted value is " + whole);
        System.out.println("The fraction from the inserted value is " + fraction);
    }
}

