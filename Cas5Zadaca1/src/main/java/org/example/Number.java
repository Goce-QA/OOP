package org.example;

public class Number {
    public static void decimalnumber(double number) {
        int whole = (int) number;
        double fraction = number - whole;
        double rounded = Math.ceil(fraction*100)/100;

        System.out.println("The whole part of the inserted value is " + whole);
        System.out.println("The fraction from the inserted value is " + rounded);
    }
}