import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleServer {

    ArrayList clientOutputStream;

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

    public void update(String message) {
        Iterator it = clientOutputStream.iterator();
        while (it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception ex) { ex.printStackTrace(); }
        }
    }

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (Exception ex) { ex.printStackTrace(); }
        }

        public void run() {}
    }

}
