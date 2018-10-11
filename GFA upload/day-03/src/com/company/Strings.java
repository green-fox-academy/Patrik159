package com.company;
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class Strings {
    public static void main(String [] args) {
        System.out.println(string("axbxcxdxexfxXx"));
    }

    public static String string(String text) {
        if (text.length() == 0) {
            return "";
        }
        else if (text.substring(0, 1).equals("x")) {
            return "y" + string(text.substring(1, text.length()));
        }
        else {
            return text.substring(0, 1) + string(text.substring(1, text.length()));
        }
    }
}
