package org.example;

//Write two methods:
//• One that will return the biggest element in a given array.
//• And the other one that will return the smallest element in a given array.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double biggestnumber = 0;
        double smallestnumber =0;
        Scanner in = new Scanner(System.in);
        System.out.println("\nPlease insert how many number will be added");
        int amount = in.nextInt();
        double[] array = new double[amount];
        System.out.println("\nPlease enter the numbers");
        for (int i = 0; i < amount; i++) {
            int index = i + 1;
            System.out.println("Please insert the " + index + " number and press Enter");
            array[i] = in.nextDouble();
        }
        //Just check if the array is correct
        for (int i = 0; i < amount; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        biggestnumber = biggernumber1(array);
        System.out.println("The biggest number is "+ biggestnumber);
        System.out.println("\n");
        smallestnumber = smallestnumber1(array);
        System.out.println("The smallest number is "+ smallestnumber);
    }

    public static double biggernumber1(double[] array) {
        double amount = array.length;
        double check = array[0];
        for (int i = 1; i < amount; i++)
            if (check < array[i]) {
                check = array[i];

            } return check;
    }
    public static double smallestnumber1(double[] array) {
        double amount = array.length;
        double check = array[0];
        for (int i = 1; i < amount; i++)
            if (check > array[i]) {
                check = array[i];

            } return check;
    }
}