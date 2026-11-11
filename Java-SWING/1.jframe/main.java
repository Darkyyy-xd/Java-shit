import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class main {
    public static void main (String[] args) {

        // JFrame = a gui window
        
        JFrame frame = new JFrame(); // Creates a new frame
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit button
        frame.setResizable(false); // Sets resizable window false
        frame.setTitle("Unitled"); // Adds the title for the window
        frame.setSize(573,474); // Changes the x and y dimensions of window
        frame.setVisible(true); // Enbales visiblity for the Window
        
        ImageIcon image = new ImageIcon("plank.png");
        frame.setIconImage(image.getImage());

    }
}
