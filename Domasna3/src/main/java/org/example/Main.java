package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            System.out.println("\nInsert a value ");
            Scanner in = new Scanner(System.in);
            double number = in.nextDouble();
            if (number > 80 && number<90) {
                number = number+5;
                System.out.println(number);
            }
            else if(number<80)
            {
                number = number+3;
                System.out.println(number);
            }
            else {
                System.out.println("The variable value isn’t changed");
            }
    }
}
