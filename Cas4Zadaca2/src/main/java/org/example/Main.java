package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPlease enter 3 numbers\n");
        System.out.println("\nPlease enter the first number.\n");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();
        int average = AverageOfNumbers.averageOfNumbers(first, second, third);

        System.out.println("The Averige of this 3 numbers is " + average);
        }
    }
