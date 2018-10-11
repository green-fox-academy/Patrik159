package com.company;

class Electronic extends Book {
    String format;

    public Electronic(String text) {
        format = text;
    }

    public void write_form(){
        System.out.println(format);
    }

    public static void main(String args){
        Electronic Raven = new Electronic("pdf");
        Raven.write_form();
        Raven.write();

    }
}
