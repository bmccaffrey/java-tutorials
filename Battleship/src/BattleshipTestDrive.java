public class BattleshipTestDrive {

    public static void main(String[] args) {

        Battleship ship = new Battleship();
        int[] locations = {2, 3, 4};

        ship.setLocationCells(locations);

        String userGuess = "2";

        String result = ship.guess(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);

    }
}


