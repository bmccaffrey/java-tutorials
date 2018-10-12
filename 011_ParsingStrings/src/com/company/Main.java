package com.company;

public class Main {

    public static void main(String[] args) {
        // Using Wrapper Objects to Covert Types
        String x = "2018";
        int xNumber = Integer.parseInt(x);
        System.out.println(x + 1);
        System.out.println(xNumber + 1);

        x = "2018.123";
        double xDouble = Double.parseDouble(x);
        System.out.println(xDouble);
        // moral of the story: have to parse w/ the appropriate type
//        int xDub = Integer.parseInt(x);
//        System.out.println(xDub);
    }
}
