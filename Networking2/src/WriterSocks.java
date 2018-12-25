import java.io.PrintWriter;
import java.net.Socket;

public class WriterSocks {
    public static void main(String[] args) {
        WriterSocks socks = new WriterSocks();
        socks.initialize();
    }

    public void initialize() {
        try {
            Socket socket = new Socket("127.0.0.1", 5000);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println("sample message");
            writer.print("final test message");
        } catch(Exception e) {e.printStackTrace(); }
    }
}
