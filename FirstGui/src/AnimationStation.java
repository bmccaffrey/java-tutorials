import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationStation implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        AnimationStation gui = new AnimationStation();
        gui.setUp();
    }
    private void setUp() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Move Stuff!");
        button.addActionListener(this);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) { frame.repaint(); }

    class MyDrawPanel extends JPanel {
        int[] coordinates = new int[2];
        int[] rgb = new int[3];

        public void randomizeValues(int[] array, int upperBound) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * upperBound);
            }
        }

        public void paintComponent(Graphics g) {
            randomizeValues(rgb, 256);
            randomizeValues(coordinates, 175);
            Color randomColor = new Color(rgb[0], rgb[1], rgb[2]);
            g.setColor(randomColor);
            g.fillOval(coordinates[0], coordinates[1],100,100);
        }
    }

}
