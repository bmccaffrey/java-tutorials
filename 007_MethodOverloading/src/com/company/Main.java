package com.company;

public class Main {

    public static void main(String[] args) {
//        int newScore = calcScore("Bob", 500);
//        System.out.println("New score is " + newScore);
// Java uses the data types of the params (not their names) to determine if the method is unique;
// When overloading a method, need to create a unique method signature;
// Signature = methodName &&|| the params;
// Changing the return type is not sufficient
//        calcScore(75);
//        calcScore();

//        System.out.println(calcFeetAndInchesToCentimeters(1, 6));
//        calcFeetAndInchesToCentimeters(99);
        fpFTW(2, 2, 2);
    }

    public static int calcScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points");
        return score * 1000;
    }

    public static int calcScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calcScore() {
        System.out.println("No player name; no player score.");
        return 0;
    }
//    Changing return vv (data) type is not sufficient to change the signature;
//    public static void calcScore() {
//        System.out.println("No player name; no player score.");
//    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double cm = ((feet >= 0) && ((inches >= 0) && (inches <= 12)))
                ? ( ( (feet * 12) + inches ) * 2.54)
                : -1;
        System.out.println(((feet * 12) +inches) + " inches is equivalent to: " + cm);
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = 0;
        if (inches >= 0) {
            feet = (int) inches / 12;
            inches %= 12;
        }

        return calcFeetAndInchesToCentimeters(feet, inches);
    }

    public static void fpFTW(int x, int y, int z) {
        System.out.println(x);
    }



}
