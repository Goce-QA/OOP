package org.example;

/*Write a Java program that requires user input for the Array elements and at the end it
prints out the array as result.
• You should enter the number of elements the array will have during runtime
• You should enter the value for each element during runtime.
• Print out the entire array as a result.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements of the array: ");
        Scanner in = new Scanner(System.in);
        int elements = in.nextInt();
        int[] myarray = new int[elements];
        System.out.println("Enter the numbers of the array:");
        for (int i = 0; i<elements; i++) {
            myarray[i] = in.nextInt();
        }System.out.println("The numbers of the array:");
        for (int element : myarray) {
            System.out.print(element + " ");
        }

    }
}