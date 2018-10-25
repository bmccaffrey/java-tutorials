import java.util.ArrayList;

public class Battleship {

    // Fields
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String guess(String userInput) {

        String result = "miss";

        // returns -1 if userInput isn't w/i the array
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
//        System.out.println(result);
        return result;
    }
}




