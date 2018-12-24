import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
public class BuffReader {
    public static void main(String[] args) {
        BuffReader buff = new BuffReader();
        buff.initialize();
    }

    public void initialize() {
        try {
            Socket socket = new Socket("127.0.0.1", 5000);
            InputStreamReader stream = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(stream);
            String message = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
