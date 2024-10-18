package org.example;

//Write a method that will return the sum of all of the positive elements in a given array.
//• Method should be created in the main class.

public class Main {
    public static void main(String[] args) {
        int[] myArray = {2, 5, 8, -10, 4, -2, -8, 7};
        int sum;

        sum = positivenumbers(myArray);
        System.out.println(sum);
    }

    public static int positivenumbers(int[] myArray) {
        int sum = 0;
        for (int i : myArray) {
            if (i > 0) {
                sum += i;
            }
        }return sum;

    }
}