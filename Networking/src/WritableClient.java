import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;
import java.net.Socket;

public class WritableClient {
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
        new WritableClient().go();
    }

    public void go() {
        JFrame frame = new JFrame("Simple Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}
