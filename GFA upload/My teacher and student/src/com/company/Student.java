package com.company;

public class Student {

    public void learn(Teacher teacher, Student student){
        System.out.println("I am learnig.");
        teacher.teach(student, teacher);
    }
}
