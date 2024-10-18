package org.example;

//Write a program in Java to display the odd natural number and their sum.

public class Main {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int i = 0;
        int sum = 0;
        for (i = 1; i <= 20; i++) {
            if (i % 2 != 0)
                System.out.println("Number" + myArray[i] + "is odd number");
            sum = sum + myArray[i];
            System.out.println(sum);

        }
    }
}