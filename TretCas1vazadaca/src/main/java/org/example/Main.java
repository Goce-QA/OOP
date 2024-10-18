package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x;
        System.out.println("Vnesete tri broevi\n");
        System.out.println("Vnesete go prviot broj");
        Scanner in = new Scanner(System.in);
        int prv = in.nextInt();
        System.out.println("\nVnesete go vtoriot broj");
        Scanner in = new Scanner(System.in);
        int vtor = in.nextInt();
        System.out.println("\nVnesete go tretiot broj");
        Scanner in = new Scanner(System.in);
        int tret = in.nextInt();

        if (prv == 0 || vtor == 0 || tret == 0) {
            System.out.println("Program terminated as one of the numbers is 0.");
            break;
        }
        if (prv>vtor)
        { x=prv;}
         else x=vtor;

         if (x>tret)
         {
             System.out.println(x);
         }
         else {
             System.out.println(tret);
    }
}
}