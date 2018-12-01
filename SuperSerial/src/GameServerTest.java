import java.io.*;

public class GameServerTest {
    public static void main(String[] args) {
        GameCharacter fullSnack = new GameCharacter(5000, "Full-Stack Developer", new String[] {"keyboard", "sarcasm", "writing tests"});

        GameCharacter designer = new GameCharacter(4000, "Designer", new String[] {"Sketch", "Prototyping", "Art Appreciation"});

        GameCharacter angryInternetPerson = new GameCharacter(9001, "Rando on StackOverflow", new String[] {"Expertise in Everything", "Condescension", "Community"});

        GameCharacter troll = new GameCharacter(25, "Mountain Troll", new String[] {"Club", "Fists", "Breath"});

        // Code that does something with objects' state here

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(fullSnack);
            os.writeObject(designer);
            os.writeObject(angryInternetPerson);
            os.writeObject(troll);
            os.close();
        } catch (IOException ex) { ex.printStackTrace(); }

        fullSnack = null;
        designer = null;
        angryInternetPerson = null;
        troll = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter fullSnackRestore = (GameCharacter) is.readObject();
            GameCharacter designerRestore = (GameCharacter) is.readObject();
            GameCharacter angryInternetPersonRestore = (GameCharacter) is.readObject();
            GameCharacter trollRestore = (GameCharacter) is.readObject();

            System.out.println("FullSnack's type: " + fullSnackRestore.getType());
            System.out.println("Designer's type: " + designerRestore.getType());
            System.out.println("Angry Internet Person's type: " + angryInternetPersonRestore.getType());
            System.out.println("Trolls's type: " + trollRestore.getType());
        } catch(Exception ex) { ex.printStackTrace(); }
    }
}
