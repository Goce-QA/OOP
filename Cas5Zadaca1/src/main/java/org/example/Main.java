package org.example;

//Write a Java program to get whole and fractional parts from a double value

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPlease insert a number that contains decimals");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();

        Number number1 = new Number();
        number1.decimalnumber(number);
        }
    }
