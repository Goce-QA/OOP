package org.example;

//Create new constructor named Person that has default values for name, age, gender,
//jobPosition.
//Initialize 4 objects and print out all parameters for each of them:
//- Object 1: uses the default values
//- Object 2: declare new values for name and age during initialization
//- Object 3: declare new values for name gender and jobPosition during initialization
//- Object 4: declare new values for ALL parameters during initialization

public class Main {
    public static void main(String[] args) {

        Person man = new Person();
        Person man1 = new Person("Marko", 33);
        Person man2 = new Person("Eli", "female", "Lawyer");
        Person man3 = new Person("Ratko", "male","QA tester", 33);

        man.getInfo();
        man1.getInfo();
        man2.getInfo();
        man3.getInfo();
    }
}