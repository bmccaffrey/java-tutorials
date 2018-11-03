import java.util.*;

public class Game {
    // Needs to 1. setup game, 2. play game, & 3. end game

    private GameHelper helper = new GameHelper();
    private ArrayList<Battleship> battleshipArrayList =
            new ArrayList<Battleship>();
    private int totalGuesses = 0;

    private void setUpGame() {
        // instantiate/initialize battleships
        Battleship one = new Battleship();
        one.setName("Corvette");

        Battleship two = new Battleship();
        one.setName("Frigate");

        Battleship three = new Battleship();
        one.setName("Destroyer");

        // Add to ArrayList
        battleshipArrayList.add(one);
        battleshipArrayList.add(two);
        battleshipArrayList.add(three);

        // User Instructions
        System.out.println("You must sink three battleships: \na corvette, a " +
                "frigate, and a destroyer.");
        System.out.println("\nThe ships are laid out on a 7x7 grid, with the " +
                "columns being number 0-6 and the rows being  labelled A-G " +
                "\nEach ship requires three hits to sink.\nAn example guess " +
                "would be 'B3'.");
        System.out.println("\nBest of luck.");


        // Generate & Set a Location for Each Instance
        for (Battleship battleshipToSet : battleshipArrayList) {
            ArrayList<String> newLocation = helper.placeBattleship(3);
            battleshipToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!battleshipArrayList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess.");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        totalGuesses++;
        String result = "miss"; // default response

        for (Battleship battleshipToTest: battleshipArrayList) {
            result = battleshipToTest.guess(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                battleshipArrayList.remove(battleshipToTest); // remove the sunk
                break;
            }
        }
        System.out.println(result);
    }

    // Pretty much a superfluous method that either praises or goads the user
    private void finishGame() {
        System.out.println("All your base are belong to us.");
        if (totalGuesses <= 18) {
            System.out.println("It only took you " + totalGuesses + " guesses");
        } else {
            System.out.println("Took you long enough. " + totalGuesses + " " +
                    "guesses in total? \nYou're lucky they can't fire back.");
        }

    }

    public static void main(String[] args) {
        Game game = new Game();
        game.setUpGame();
        game.startPlaying();
    }
}
