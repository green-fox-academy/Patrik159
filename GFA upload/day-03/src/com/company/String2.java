package com.company;
// Given a string,
// compute recursively a new string where all the 'x' chars have been removed.
public class String2 {
    public static void main(String [] args) {
        System.out.println(string("axbxcxdxexfx"));
    }
    public static String string(String text){
        if (text.length() == 0) {
            return "";
        }
        else if (text.substring(0, 1).equals("x")) {
            return string(text.substring(1, text.length()));
        }
        else {
            return text.substring(0, 1) + string(text.substring(1, text.length()));
        }
    }
}
