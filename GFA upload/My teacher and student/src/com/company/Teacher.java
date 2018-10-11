package com.company;

public class Teacher {

    public void teach(Student student, Teacher teacher) {
        System.out.println("I am teaching.");
        student.learn(teacher, student);
    }

    public static void main(String [] args){
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.teach(student, teacher);
    }
}
