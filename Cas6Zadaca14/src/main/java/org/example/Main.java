package org.example;

import java.util.Scanner;

//Write a Java program to add new array element at index: 2. The current value of index 2
//should not be replaced, but moved to the next index, etc.
//Example:
//Array: 1, 2, 3, 4, 5
//New array: 1, 2, 8, 3, 4
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the amount of numbers");
        int amount = in.nextInt();
        System.out.println("Pleas add the numbers");
        int[] myArray=new int[amount];

        for (int i=0;i<myArray.length;i++){
            myArray[i]=in.nextInt();
            int index = i + 1;
            System.out.println("Please insert the " + index + " number and press Enter");

        }
        //dodadi uste edna niza
        System.out.println("Insert the number that should replace the 3rd number you have added");
        int replace=in.nextInt();
        myArray[2]=replace;
        for (int i = 0; i < amount; i++) {
            System.out.print(myArray[i] + " ");
    }

    }
}