package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVnesete nekoj broj pogolem od 9");
        long broj = scanner.nextInt();
        int suma = 0;

        if (broj>9) {
            do {
                suma += broj % 10;
                broj /= 10;
            }
            while (broj > 0);
            System.out.println(suma);
        }

          else {
            System.out.println("Vneovte broj pomal od 9");
        }
    }
}