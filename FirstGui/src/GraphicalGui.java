import javax.swing.*;
import java.awt.*;

public class GraphicalGui extends JPanel {
    public static void main(String[] args) {
        GraphicalGui gui = new GraphicalGui();
        gui.repaint();
    }

    public void paintComponent(Graphics g) {
        g.fillRect(0,0,this.getWidth(), this.getHeight());
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }

//    public void paintComponent(Graphics g) {
//        Image image = new ImageIcon("example.jpeg").getImage();
//        g.drawImage(image,3,4,this);
//    }

}
