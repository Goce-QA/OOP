package org.example;

public class Person {
    public String name = "Bojan";
    public int age = 34;
    public String gender = "male";
    public String jobPosition = "Future QA tester";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String newName, String newGender, String newJobPosition) {
        name = newName;
        gender = newGender;
        jobPosition = newJobPosition;
    }

    public Person(String newName, String newGender, String newJobPosition, int newAge) {
        name = newName;
        gender = newGender;
        jobPosition = newJobPosition;
        age = newAge;
    }

    public void getInfo() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(jobPosition);
    }
}