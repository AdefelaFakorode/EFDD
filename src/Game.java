import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;

public class Game {
    JFrame window;
    Container con;

    public static void main(String[] args) {
        new Game();
    }

    public Game(){
        //creating window for game
        window = new JFrame();
        window.setSize(1280,720); //could make 1980x1080 another time
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 'x' button to close the window
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null); //default layout for now
        window.setVisible(true);
        con = window.getContentPane();
    }
}
