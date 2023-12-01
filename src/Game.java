import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game {
    // Main game window and containers
    JFrame window;
    Container con;

    // Panels for different sections of the game
    JPanel titleNamePanel, startButtonPanel, mainTextPanel;

    // Label and font for game title
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 50); // Font for the game title, can be changed later

    // Font for general text
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);

    // Buttons and text area
    JButton startButton;
    JTextArea mainTextArea;

    // Action listener for handling button clicks
    TitleScreenHandler tshandler = new TitleScreenHandler(); // Action listener

    // Main method to launch the game
    public static void main(String[] args) {
        new Game();
    }

    // Constructor to create the game window and set up initial settings
    public Game() {
        // Creating window for the game
        window = new JFrame();
        window.setSize(800, 600); // Size of the window, can make 1280x720 another time
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 'x' button to close the window
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null); // Default layout for now
        window.setVisible(true);
        con = window.getContentPane();

        // Title panel setup
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 70); // (x , y, width, height)
        titleNamePanel.setBackground(Color.black);

        // Game title label setup
        titleNameLabel = new JLabel("Escape From Dio's Dungeon"); // Text
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        // Start button panel setup
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        // Start button setup
        startButton = new JButton("START");
        startButton.setBackground(Color.black); // Color of the button
        startButton.setForeground(Color.white); // Color of the text
        startButton.setFont(normalFont);
        startButton.addActionListener(tshandler); // Title screen handler

        // Adding components to their respective panels
        titleNamePanel.add(titleNameLabel); // Add the label to the panel
        startButtonPanel.add(startButton);

        // Adding panels to the main container
        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    // Method to create the main game screen
    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        // Main text panel setup
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.blue);
        con.add(mainTextPanel);

        // Main text area setup
        mainTextArea = new JTextArea("You're an adventurer trapped in Dio's Dungeon. Find a way out with your life intact!");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white); // Text color
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);

        mainTextPanel.add(mainTextArea);
    }

    // Action listener class for handling button clicks
    public class TitleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }
}
