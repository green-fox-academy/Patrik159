package com.company;

public class Mentor extends Person {
    String level;

    public void getGoal(){
        System.out.println(
                "Educate brilliant junior software developers."
        );
    }

    public void introduce(){
        System.out.println(
                "Hi, I'm " + name + ", a " + age + " years old " +
                        gender + level + " mentor."
        );
    }

    public Mentor(String name, int age, String gender, String level){
        super(name, age, gender);
        level = level;
    }

    public Mentor(){
        this("Jane Doe", 30, "female", "intermediate");
    }
}
