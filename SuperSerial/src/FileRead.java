import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            File testFile = new File("test.txt");
            FileReader fileReader = new FileReader(testFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;

            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
