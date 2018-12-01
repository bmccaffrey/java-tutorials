import java.io.*;

public class Pond implements Serializable {

    transient private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond myPond = new Pond();

        try {
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myPond);
            os.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

class Duck {
    public String bestAttribute = "feathers";
    public boolean isImpedingTraffic = true;
    public String sound = "Quack";

    public void ruffle(String x) {
        if (x.equalsIgnoreCase(bestAttribute)) { System.out.println(sound); }
        else {
            System.out.println("**Stare Blankly**");
        }
    }
}
