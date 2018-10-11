package com.company;
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".
public class String3 {
    public static void main(String [] args){
        System.out.println(string0("abcdef"));
    }

    public static String string0(String text) {
        return text.substring(0, 1) + string(text.substring(1, text.length()));
    }
    public static String string(String text) {
        if (text.length() == 0) {
            return "";
        }
        else {
            return "*" + text.substring(0, 1) + string(text.substring(1, text.length()));
        }
    }
}
