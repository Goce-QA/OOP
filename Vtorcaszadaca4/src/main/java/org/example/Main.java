package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("\nPoceten broj na rangot");
        int prv = in.nextInt();
        System.out.println("\nPosleden broj vo rangot");
        int posleden = in.nextInt();
        int x;
        int sum = 0;

        if (prv < posleden) {
            for (x = prv; x <= posleden; x++) {
                if (x % 2 == 0) {
                    sum += x;
                }

            }
            System.out.println("Sumata na parni broevi vo rang od " + prv + " do " + posleden + " iznesuva " + sum);

        } else {
            System.out.println("Ve molime da vnesete validen rang");
        }
    }
}
