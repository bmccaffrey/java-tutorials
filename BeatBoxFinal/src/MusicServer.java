import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class MusicServer {

    ArrayList<ObjectOutputStream> clientOutputStreams;

    public static void main(String[] args) {}

    public class ClientHandler implements Runnable{
        ObjectInputStream in;
        Socket clientSocket;

        public ClientHandler(Socket socket) {
            try {
                clientSocket = socket;
                in = new ObjectInputStream(clientSocket.getInputStream());
            } catch (Exception ex) { ex.printStackTrace(); }
        }
        public void run() {
            Object o2 = null;
            Object o1 = null;
            try {
                while ((o1 = in.readObject()) != null) {
                    o2 = in.readObject();
                    System.out.println("Two objects read.");
                    updateClients(o1, o2);
                }
            } catch (Exception ex) { ex.printStackTrace(); }
        }
    }

    public void start() {}

    public void updateClients(Object one, Object two) {
        Iterator it = clientOutputStreams.iterator();
        while (it.hasNext()) {
            try {
                ObjectOutputStream out = (ObjectOutputStream) it.next();
                out.writeObject(one);
                out.writeObject(two);
            } catch (Exception ex) { ex.printStackTrace(); }
        }
    }
}
