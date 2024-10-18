package org.example;

import java.util.Scanner;

//Write a method to calculate the average value of 3 numbers
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the three numbers");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int average = sumOfthree(x,y,z);
        System.out.println("The average number of the three inserted numbers is "+average);
    }
    public static int sumOfthree(int x ,int y, int z){
        int sum = x+y+z;
        int average = sum/3;
        return average;
    }

}