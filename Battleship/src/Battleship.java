public class Battleship {

    // Fields
    int[] locationCells;
    int numberOfHits = 0;

    public int[] getLocationCells() {
        return locationCells;
    }

    public int getNumberOfHits() {
        return numberOfHits;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public void setNumberOfHits(int hits) {
        this.numberOfHits = hits;
    }

    public String guess(String guess) {
        // increments totalGuesses w/ each guess;
        int userGuess = Integer.parseInt(guess);

        String result = "miss";

        for (int cell : locationCells) {
            if (userGuess == cell) {
                result = "hit";
                numberOfHits++;
                break;
            }
        }

        if (numberOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        Battleship ship = new Battleship();
        int[] locations = {2, 3, 4};

        ship.setLocationCells(locations);
        ship.guess("5");
    }
}




