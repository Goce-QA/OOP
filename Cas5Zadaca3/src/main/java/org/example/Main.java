package org.example;

//Write a Java program to reverse an integer number.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPlease insert a number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int revers=0;
        while (number!=0){
            revers= revers*10 +number%10;
            number = number/10;
        }
        System.out.println(revers);
    }
}