import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit button
        this.setResizable(false); // Sets resizable window false
        this.setTitle("Unitled"); // Adds the title for the window
        this.setSize(573,474); // Changes the x and y dimensions of window
        this.setVisible(true); // Enbales visiblity for the Window
        
        ImageIcon image = new ImageIcon("plank.png");
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(Color.green); //change color of background
        this.getContentPane().setBackground(new Color(0,0,232)); // Custom R G B colors (customisable colors for background) or HEXADECIMAL color values
        
	}
}