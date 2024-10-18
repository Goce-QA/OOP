package org.example;

//Write a program in Java to display the cube of every third number up to given an integer.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int input = in.nextInt();
        int number =0;
        int cube=0;
        for (number=0;number<=input; number+=3){
            cube=number*number*number;
            System.out.println(cube);
        }
    }
}