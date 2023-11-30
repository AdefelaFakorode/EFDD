import java.awt.*;
import javax.swing.*;

public class Game {
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 50); // could change later
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton;

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
        titleNamePanel.setBackground(Color.black);

        titleNameLabel = new JLabel("Escape From Dio's Dungeon"); //text
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");
        startButton.setBackground(Color.black); // color of button
        startButton.setForeground(Color.white); // color text
        startButton.setFont(normalFont);


        titleNamePanel.add(titleNameLabel); // add the label to the panel
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }
}
