package org.example;

//Write a Java program to get the first and tenth character within given String

public class Main {
    public static void main(String[] args) {

        String sentence = "I'm learning Java programing and I hope to have more time for practice";
        System.out.println(sentence.charAt(0));
        if (sentence.length()<=9) {
            System.out.println("Sentence doesn't have that much characters");
        }
        else {

        System.out.println(sentence.charAt(9));

        }
    }
    }