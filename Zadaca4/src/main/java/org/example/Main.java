package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 61;
        String sex = "female";

        if (sex == "female") {
            if (age >= 62) {
                System.out.println("Eligible for a pension");
            } else {
                System.out.println("Not eligible for a pension");
            }
        } else if (sex == "male") {
            if (age >= 64) {
                System.out.println("Eligible for a pension");
            } else {
                System.out.println("Not eligible for a pension");
            }
        } else {
            System.out.println("Ganeder should be male or female");
        }
    }
}

