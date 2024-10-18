package org.example;

//Write a Java program to test if number is prime number or not.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please insert a number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean isPrime = true;


            for (int j=2; j<number; j++){
                if (number%j==0) {
                    isPrime = false;
                    break;
                }

            }

        if(isPrime){
          System.out.println(number + " is prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }
    }
}