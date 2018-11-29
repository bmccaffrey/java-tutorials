import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GraphicallyEventfulGui implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        GraphicallyEventfulGui gui = new GraphicallyEventfulGui();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change Colors");
        button.addActionListener(this);

        GraphicalGui drawPanel = new GraphicalGui();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}
