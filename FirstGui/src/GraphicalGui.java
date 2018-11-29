import javax.swing.*;
import java.awt.*;

public class GraphicalGui extends JPanel {
    public static void main(String[] args) {
        GraphicalGui gui = new GraphicalGui();
        gui.repaint();
    }

//    public void paintComponent(Graphics g) {
//        g.setColor(Color.orange);
//        g.fillRect(20,50,100,100);
//    }
    
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("example.jpeg").getImage();
        g.drawImage(image,3,4,this);
    }
}
