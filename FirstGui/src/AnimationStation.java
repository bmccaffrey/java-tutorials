import javax.swing.*;
import java.awt.*;

public class AnimationStation{
    private JFrame frame;
    private int[] coordinates = new int[2];
    private int[] rgb = new int[3];

    public static void main(String[] args) {
        AnimationStation gui = new AnimationStation();
        gui.setUpFrameAndPanel();
        gui.painfullyAnimate(40, 50);
    }
    private void setUpFrameAndPanel() {
        frame = new JFrame();
        createPanel();
        setFrameDefaults();
    }

    private void createPanel() {
        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, panel);
    }

    private void setFrameDefaults() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    private void painfullyAnimate(int speedMillis, int duration) {
        for(int i = 0; i < duration; i++) {
            randomizeColorsAndCoordinates();
            frame.repaint();
            addDelay(speedMillis);
        }
    }

    private void randomizeColorsAndCoordinates() {
        randomizeValues(rgb, 256);
        randomizeValues(coordinates, 175);
    }

    private void randomizeValues(int[] array, int upperBound) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * upperBound);
        }
    }

    private void addDelay(int speedMillis) {
        try { Thread.sleep(speedMillis); }
        catch (Exception ex) { ex.printStackTrace();}
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            Color randomColor = new Color(rgb[0], rgb[1], rgb[2]);
            g.setColor(randomColor);
            g.fillOval(coordinates[0], coordinates[1], 100, 100);
        }
    }

}
