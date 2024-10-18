package org.example;

//Write a program in Java to display the multiplication
//table of a given integer. number 10
public class Main {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        for(j=0;j<=10;j++){
          int multuplication = i*j;
            System.out.println(i+" x "+j + " = " + multuplication);
        }
    }
}