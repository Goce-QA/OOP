package org.example;

//You are picking apples from a tree. One basket can hold 23 apples. How many baskets will
//you need for 100, 230 and 470 apples?
public class Main {
    public static void main(String[] args) {
        int kos = 23;
        int sto = 100;
        int dvestatrieset = 230;
        int cetrstosedumdeset = 470;
        int brojnakos = 0;
        int x, y , z;
        x = cetrstosedumdeset / kos;
        System.out.println(x);
        y = dvestatrieset / kos;
        System.out.println(y);
        z = sto / kos;
        System.out.println(z);

        if (x * kos >= cetrstosedumdeset) {
            System.out.println("Brojot na kosnici potrebni za 470 jabolki iznesuva " + x);
        } else {
            x = x + 1;
            {
                System.out.println("Brojot na kosnici potrebni za 470 jabolki iznesuva " + x);
            }
        }
        if (y * kos >= dvestatrieset) {
            System.out.println("Brojot na kosnici potrebni za 230 jabolki iznesuva " + y);
        } else
        {
            y = y + 1;
            {
                System.out.println("Brojot na kosnici potrebni za 230 jabolki iznesuva " + y);
            }
        }
        if (z * kos >= sto) {
            System.out.println("Brojot na kosnici potrebni za 100 jabolki iznesuva " + z);
        } else {
            z = z + 1;
            {
                System.out.println("Brojot na kosnici potrebni za 100 jabolki iznesuva " + z);
            }
        }
    }
}