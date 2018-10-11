package com.company;

import java.awt.*;

class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor){
        backgroundColor = backgroundColor;
        text = text;
        textColor = textColor;
    }



    public static void main(String[] args) {
        PostIt Idea_1 = new PostIt (
                "orange", "Idea 1", "blue"
        );
        PostIt Awesome = new PostIt (
                "pink", "Awesome", "black"
        );
        PostIt Superb = new PostIt(
                "yellow", "superb!", "green"
        );
    }
}
