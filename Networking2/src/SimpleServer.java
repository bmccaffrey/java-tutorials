import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleServer {

    ArrayList clientOutputStreams;

    public static void main(String[] args) {
        new SimpleServer().setUp();
    }

    public void setUp() {
        clientOutputStreams = new ArrayList();

        try {
            ServerSocket serverSock = new ServerSocket(5000);

            while (true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("Connection received.");
            }
        } catch(IOException ex) {ex.printStackTrace(); }
    }

    public void update(String message) {
        Iterator it = clientOutputStreams.iterator();
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

        public void run() {
            String message;

            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    update(message);
                }
            } catch (Exception ex) { ex.printStackTrace(); }
        }
    }

}
