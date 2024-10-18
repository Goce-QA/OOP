package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPlease enter a number \n");
        Scanner in = new Scanner(System.in);
        int number= in.nextInt();
        int sum = Sum.sum(number);
        System.out.println(sum);

        }
    }
