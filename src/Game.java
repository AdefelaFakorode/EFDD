import javax.swing.JFrame;
import java.awt.Color;

public class Game {
    JFrame window;
    public static void main(String[] args) {
        new Game();
    }

    public Game(){
        //creating window for game
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 'x' button to close the window
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null); //default layout for now
        window.setVisible(true);
    }
}
