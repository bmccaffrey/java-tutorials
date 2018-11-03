import java.util.ArrayList;

public class Battleship {

    // Fields
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> location) {
        this.locationCells = location;
    }

    public void setName(String shipName) {
        this.name = shipName;
    }

    public String guess(String userInput) {

        String result = "miss";

        // returns location if guess is w/i AL; otherwise returns -1
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) { // determines if sunk yet
                result = "kill";
                System.out.println("You have sunk the " + this.name + ".");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}




