import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("This is a test.");
            writer.close();
        } catch(IOException ex) { ex.printStackTrace(); }
    }
}
