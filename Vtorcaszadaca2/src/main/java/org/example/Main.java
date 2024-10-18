package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int x = 6;
       int y = 8;
       int z = 12;

       if (x>y) {
           if (y>z) {
               System.out.println("X e najgolem broj" + x);
           }
               else if (x<z) {
               System.out.println("Z e najgolem broj" + z);
           }

           } else {
           System.out.println("Y e najgolem broj" +y);
        }
    }
}