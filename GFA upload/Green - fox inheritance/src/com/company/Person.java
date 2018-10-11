package com.company;

public class Person {
    String name;
    int age;
    String gender;

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " +
                gender);
    }

    public void getGoal () {
        System.out.println("My goal is: Live for moment!");
    }

    public Person (String name, int age, String gender){
        name = name;
        age = age;
        gender = gender;
    }

    public Person (){
        this("Jane Doe", 30, "female");
    }
}
