package org.example;

import org.w3c.dom.ls.LSOutput;

//Which two-digit numbers have a greater first digit than the second, and how many are
//there.
public class Main {
    public static void main(String[] args) {
           int x, first, second, totalnumbers;
           totalnumbers = 0;
        System.out.println("Ova se broevite koi imaat pogolema prva cifra" );

           for (x = 10; x < 100; x++)
            {
            first = x / 10;
            second = x % 10;
                    if (first > second)
                    {
                        System.out.println(x);
                        totalnumbers++;
                    }
            }
        System.out.println("Postojat vkupno " + totalnumbers + " koi imaat pogolema prva cifra" );
    }
}