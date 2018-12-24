import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        SimpleServer server = new SimpleServer();
        server.setUp();
    }

    public void setUp() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            Socket s = new Socket("190.165.1.103", 4242);
            Socket sock = serverSock.accept();
        } catch(IOException ex) {ex.printStackTrace(); }
    }
}
