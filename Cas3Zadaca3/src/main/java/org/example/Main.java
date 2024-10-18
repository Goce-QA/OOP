package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myarray = {2, 22, 124, 54, 565, 48, 98};
        System.out.println("Please enter a number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int arraynumber : myarray) {
            if (number == arraynumber) {
                System.out.println("Number " + number + " exist in the array ");
            } else if (number != arraynumber) {
            System.out.println("number is not in the array");
        }

        }
    }
}