package com.company;

public class Main {

    public static void main(String[] args) {

        // player's name & position in high score table
        // disply name along iwth message "managed to get into poisiton and the position they got and a further message
        // 'on the high score table

        // player score; return int
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(true, 800, levelCompleted, bonus);
//        System.out.println("Your final score was " + highscore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // 1500, 900, 400, 50;

        displayPlayerRank("Bob", 1500);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table!");
    }

    public static int calcHighScorePosition(int score) {
        return (score >= 1000) ? 1
                : (score >= 500 && score < 1000) ? 2
                : (score >= 100 && score < 500) ? 3
                : 4;
    }

    public static void displayPlayerRank(String name, int score) {
        displayHighScorePosition(name, calcHighScorePosition(score));
    }

}