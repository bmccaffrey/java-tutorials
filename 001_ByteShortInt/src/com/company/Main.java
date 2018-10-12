package com.company;

public class Main {

    public static void main(String[] args) {
        // width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // width of 8
        byte myByteValue = -128;
        // expression assignments are by default int
        // workaround: casting: vv;
        byte myNewByteValue = (byte) (myByteValue/2);

        // width of 16
        short myShortValue = 32767;

        // width of 64
        long myLongValue = 100L;
        // and for some reason you don't need to cast w/ long;
        long myNewLong = (100L * 2);
        System.out.println(myNewLong);

    }
}
