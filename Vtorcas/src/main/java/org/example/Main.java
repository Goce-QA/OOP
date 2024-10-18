package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nPlease enter a number");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();


        if (x > 0) {
            System.out.println("The number is positive.");
        } else if (x < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}