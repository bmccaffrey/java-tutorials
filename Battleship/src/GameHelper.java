import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int shipCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

    public ArrayList<String> placeBattleship(int shipSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();

        String temporaryString = null;
        int[] coords = new int[shipSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        shipCount++;
        int incr = 1; // set horizontal increment
        if ((shipCount % 2) == 1) { // if odd #, place vertically
            incr = gridLength; // set vertical increment
        }
        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * gridSize); //random starting point
            int x = 0;
                success = true;
                while (success && x < shipSize) { // adjacent unused spots?
                    if (grid[location] == 0) {    // if not already used,
                        coords[x++] = location;   // save location
                        location += incr;         // try 'next' location
                        if (location >= gridSize) { // Out of Bounds
                            success = false;
                        } // Out of Bounds: Right Edge vv
                        if (x > 0 && (location % gridLength == 0)) {
                            success = false;
                        }
                    } else {                      // Found already used location
                        success = false;
                    }
                }
        }

        int x = 0;                            // Turn location into alpha coords
        int row = 0;
        int column = 0;
        while (x < shipSize) {
            grid[coords[x]] = 1;            // mark master grid points as 'used'
            row = (int) (coords[x] / gridLength);
            column = coords[x] % gridLength;
            temporaryString = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temporaryString.concat(Integer.toString(row)));
            x++;             // Convert to alpha ^^
        }
        return alphaCells;
    }
}
