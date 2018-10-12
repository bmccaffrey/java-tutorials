package com.company;

public class Main {

    public static void main(String[] args) {
        // sequence of characters
        String myString = "I don't know why it's capitalized";

        System.out.println(myString);
        System.out.println(myString + ", but he may tell me.");
        myString = myString + ", but here's an example concatenation.";
        System.out.println(myString);

        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}