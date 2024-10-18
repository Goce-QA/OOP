package org.example;

import java.util.Scanner;

//Write a Java program that takes the user to provide a single character from the alphabet.
//Print Vowel of Consonant, depending on the user input. If the user input is not a letter
//(between a and z or A and Z), or is a string of length > 1, print an error message.
//boolean specialCharacter = input.charAt(0) >= 97 && input.charAt(0) <= 122;
public class Main {
    public static void main(String[] args) {
        Scanner character = Scanner(System.in);
        String newcharacter = character.nextLine();

        if (newcharacter.length() != 1 || !Character.isLetter(newcharacter.charAt(0))) {
            System.out.println("Error: Invalid input. Please enter a single letter from a-z or A-Z.");
        } else {
    }
}