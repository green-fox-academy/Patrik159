package com.company;

class Book {
    int year;

    public Book () {

        year = 1900;
    }

    public void write() {
        System.out.println(year);
    }

    public int old(String text) {
        System.out.println(text);
        return 2018 - year;
    }

    public static void main(String[] args) {
        Book Faust = new Book();
        Faust.write();
        System.out.println(Faust.old("Counting")-100);
    }
}



