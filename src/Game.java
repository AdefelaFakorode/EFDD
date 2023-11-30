import java.awt.*;
import javax.swing.*;

public class Game {
    JFrame window;
    Container con;
    JPanel titleNamePanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 50); // could change later

    public static void main(String[] args) {
        new Game();
    }

    public Game() {
        // creating window for the game
        window = new JFrame();
        window.setSize(800, 600); // could make 1280x720 another time
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 'x' button to close the window
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null); // default layout for now
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 70); // (x , y, width, height)
        titleNamePanel.setBackground(Color.darkGray);

        titleNameLabel = new JLabel("Escape From Dio's Dungeon"); //text
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        titleNamePanel.add(titleNameLabel); // add the label to the panel
        con.add(titleNamePanel);
    }
}
