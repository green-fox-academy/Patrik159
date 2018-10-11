package com.company;

public class Human {
    String name;
    int age;
    int iq;

    public Human(){
        this("Petr", 1, 2);
    }

    public Human(String name, int age, int iq){
        this.name=name;
        this.age=age;
        this.iq=iq;
    }

    public Human(String name, int age){
        this.name=name;
        age=age;
        iq=200;
    }
    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human("Tomas", 10);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.iq);
        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.iq);
    }
}