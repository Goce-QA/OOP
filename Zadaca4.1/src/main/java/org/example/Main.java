package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String gender = "female";
        int age = 61;
        if (gender == "male") {
            if (age >= 64) {
                System.out.println("eligable for pension");
            } else {
                System.out.println("not eligable for pension");
            }
        } else if (gender == "female") {
            if (age >= 62) {
                System.out.println("eligable for pension");
            } else {
                System.out.println("not eligable for pension");
            }
        } else {
            System.out.println("gender should be male or female");
        }
    }
}