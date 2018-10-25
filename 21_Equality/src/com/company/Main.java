package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'b';
        byte myByte = 100;
        short myShort = 100;
        int myInteger = 100;
        long myLong = 100;
        float myFloat = 100f;
        double myDouble = 100d;
        String myString = "b";
        String myOtherString = "b";

        System.out.println(myByte == myShort);
        System.out.println(myShort == myInteger);
        System.out.println(myInteger == myLong);
        System.out.println(myLong == myFloat);
        System.out.println(myFloat == myDouble);
        System.out.println(myDouble == myByte);

        System.out.println("But myChar (" + myChar +") isn't equal to myString ("
                + myString + "), because one is a primitive and the other is an"
                + " object / instance of the String class...");

        System.out.println("But, comparing two String objects with the same "
                + "character(s) is " + (myString == myOtherString) + ", provided"
                + " you remember to parenthesize them and avoid concatenation-- "
                + "not that you would " + myString + " that forgetful! :)");
    }
}
