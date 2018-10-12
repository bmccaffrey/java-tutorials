package com.company;

public class Main {

    public static void main(String[] args) {
        // width of 32 (4 bytes)
        int myIntValue = 5 /2;
        // have to cast for this if you don't suffix an f
        // width of 32 (4 bytes)
        // 7 digits of precision
        float myFloatValue = 5f / 3f;
        // width of 64 (8 bytes)
        // 16 digits of precision
        double myDoubleValue = 5d / 3d;

        double pi = 3.141_592_653_59d;

        System.out.println(pi);
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
}
