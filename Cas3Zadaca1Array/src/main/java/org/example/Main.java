package org.example;
public class Main {
    public static void main(String[] args) {

        int[] broevi = {1, 54, 65, 45, 85, 121, 12, 1};
        int x = broevi.length;
        if (x >=2) {
            if (broevi[0] == broevi[x - 1]) {
                System.out.println("Prviot i posledniot broj se ednakvi");
            } else {
                System.out.println("Broevite ne se ednakvi");
            }
        }
        else {
            System.out.println("Vnesovte pomalce od 2 broevi");}
        }
    }
