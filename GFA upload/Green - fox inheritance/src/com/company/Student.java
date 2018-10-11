package com.company;

public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " +
                gender + " from " + previousOrganization + " who skipped " +
                skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays){
        skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender,
                   String previousOrganization) {
        super(name, age, previousOrganization);
        previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student(){
        this("Jane Doe", 30, "female",
                "The School of Life");
        skippedDays = 0;

    }
}
