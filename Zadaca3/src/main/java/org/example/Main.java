package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int Personage = 15;
        if (Personage < 18) {
            System.out.println(Personage);
        }
        else if  (Personage > 18 && Personage < 40)
        {
                System.out.println(Personage);
            }

        else {
            System.out.println("Above 40");
        }

        System.out.println("___________________");

        int Personage1 = 15;
        if (Personage1 < 18) {
            System.out.println(Personage1);
        }
        else {
            System.out.println("Person is older the 18");}
    }
}