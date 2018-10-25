public class Game {

    public static void main(String[] args) {

        int totalGuesses = 0;
        boolean isAlive = true;

        GameHelper helper = new GameHelper();

        Battleship ship = new Battleship();

        int randomNumber = (int) (Math.random() * 5);

        int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};
        ship.setLocationCells(locations);

        while (isAlive) {
            totalGuesses++;
            String userGuess = helper.getUserInput("Please enter a number " +
                    "between" +
                    " 0 and 6.");
            String result = ship.guess(userGuess);

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + totalGuesses + " guesses.");
            }


        }

    }


}
