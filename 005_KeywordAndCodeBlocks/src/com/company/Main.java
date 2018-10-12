package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 4000)
            System.out.println("Your score was 5000");

        if (score < 5000) {
            System.out.println("Your score was 5000");
        } else if (score < 1000) {
            System.out.println("Print something else");
        }
        else {
            System.out.println("Got here...");
        }

        // code blocks are optional if you've only got one line to process
        // that being said, their use is strongly recommended
        System.out.println("This was executed");

        // can't reference variables created within a codeblock;
    }
}
