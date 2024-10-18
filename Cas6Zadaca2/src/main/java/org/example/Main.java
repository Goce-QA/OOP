package org.example;

//Write a Java program to concatenate a given string to the end of another string.

public class Main {
    public static void main(String[] args) {
    String firstsentence = "I'm learning Java programing and I hope to have more time for practice.";
    String secondsentence= "Programing is fun, but challenging";
        System.out.println(firstsentence + " " + secondsentence);
        System.out.println(firstsentence.concat(secondsentence));
    }
}