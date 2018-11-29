import javax.swing.*;

public class FirstGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Make a Frame
        JButton button = new JButton("Click Me!"); // Make a Widget

        // Close & Don't Hang
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button); // Add Widget to Content Pane

        frame.setSize(300, 300); // Set Frame Pixel Size

        frame.setVisible(true); // Make Visible (which seems redundant)

    }
}
