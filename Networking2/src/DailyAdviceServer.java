import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {

    String[] adviceList = {"Take smaller bites", "Be kinder to others", "Smile more", "Be grateful today", "Compliment somebody for no reason", "Be vulneralbe"};

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);

            while(true) {
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex) { ex.printStackTrace(); }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }
}
