package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n"); //For better visual result
        System.out.printf("Hello World" + "\n----------------------------------------------------\n");
        String text = ("Inside the main() method insert a variable called text of type String and assign the value to it.\n" +
                "Print the value of the result using System.out.println().");
        System.out.println(text);
        System.out.println("\n----------------------------------------------------");
        int x = 34;
        double y = 1.43;
        float z = 6.32154F;
        char character = 'C';
        boolean bul = true;
        int xyz;
        xyz = 20;
        System.out.println("XYZ = " + xyz + "\n----------------------------------------------------");
        int req;
        req = 21;
        x = req;
        final int f = 36;

        System.out.println("X = " + x + "\n----------------------------------------------------");
        System.out.println("Y = " + y + "\n----------------------------------------------------");
        System.out.println("Z = " + z + "\n----------------------------------------------------");
        System.out.println("The Character is " + character + "\n----------------------------------------------------");
        System.out.println("Value of X is now "+ x + "\n----------------------------------------------------");
        System.out.println("Unchangeable value " + f + "\n----------------------------------------------------");
        }
    }
