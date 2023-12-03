import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game {
    // Main game window and containers
    JFrame window;
    Container con;

    // Panels for different sections of the game
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, continueButtonPanel, ChapterOnePanel, EventOnePanel, chapterOneContinueButtonPanel,
    playerPanel;

    // Label and font for game title
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 50);

    // Font for general text
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);

    Font smallFont = new Font("Times New Roman", Font.PLAIN, 22);

    // Buttons and text area
    JButton startButton, continueButton, chapterOneContinueButton;
    JTextArea mainTextArea, eventOneTextArea;

    int playerHP;
    String weapon;

    // Action listeners for handling button clicks
    TitleScreenHandler tshandler = new TitleScreenHandler();
    ContinueButtonHandler cbhandler = new ContinueButtonHandler();
    ChapterOneContinueHandler cc1handler = new ChapterOneContinueHandler();

    public static void main(String[] args) {
        new Game();
    }

    // Constructor to create the game window and set up initial settings
    public Game() {
        // Creating window for the game
        window = new JFrame();
        window.setSize(1280, 720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        // Title panel setup
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(80, 150, 1100, 70);
        titleNamePanel.setBackground(Color.black);

        // Game title label setup
        titleNameLabel = new JLabel("Escape From Dio's Dungeon");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        // Start button panel setup
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(520, 500, 200, 100);
        startButtonPanel.setBackground(Color.black);

        // Start button setup
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tshandler);

        // Adding components to their respective panels
        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        // Adding panels to the main container
        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    // Method to create the main game screen
    public void GameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        // Main text panel setup
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(80, 150, 1100, 120);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        // Main text area setup
        mainTextArea = new JTextArea("Trapped in Dio's Dungeon, rely on your wit and courage to navigate puzzles and evade traps, ensuring your escape with your life intact.");
        mainTextArea.setBounds(100, 200, 810, 850);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        continueButtonPanel = new JPanel();
        continueButtonPanel.setBounds(520, 500, 200, 100);
        continueButtonPanel.setBackground(Color.black);
        continueButtonPanel.setForeground(Color.white);
        continueButtonPanel.setFont(normalFont);

        // Adding panel button panel to container
        con.add(continueButtonPanel);

        continueButton = new JButton("CONTINUE");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.setFont(normalFont);
        continueButtonPanel.add(continueButton);
        continueButton.addActionListener(cbhandler);
    }

    // Method to create screen for Chapter One
    public void ChapterOneScreen() {
        // Hide prev panels
        mainTextPanel.setVisible(false);
        continueButtonPanel.setVisible(false);

        // Chapter one panel setup
        ChapterOnePanel = new JPanel();
        ChapterOnePanel.setBounds(400, 250, 450, 80);
        ChapterOnePanel.setBackground(Color.black);
        con.add(ChapterOnePanel);

        // Chapter one label setup
        JLabel chapterOneLabel = new JLabel("Chapter One: Exodus");
        chapterOneLabel.setForeground(Color.white);
        chapterOneLabel.setFont(titleFont);
        ChapterOnePanel.add(chapterOneLabel);

        // Chapter one conti button panel setup
        chapterOneContinueButtonPanel = new JPanel();
        chapterOneContinueButtonPanel.setBounds(520, 500, 200, 60);
        chapterOneContinueButtonPanel.setBackground(Color.black);
        chapterOneContinueButtonPanel.setForeground(Color.white);
        chapterOneContinueButtonPanel.setFont(normalFont);

        // Chapter one cont button setup
        chapterOneContinueButton = new JButton("CONTINUE");
        chapterOneContinueButton.setBackground(Color.black);
        chapterOneContinueButton.setForeground(Color.white);
        chapterOneContinueButton.setFont(normalFont);
        chapterOneContinueButton.addActionListener(cc1handler);
        chapterOneContinueButtonPanel.add(chapterOneContinueButton);

        // Adding chapter one cont button panel to container
        con.add(chapterOneContinueButtonPanel);
    }

    // Method to create the first event screen
    public void EventOneScreen() {
        ChapterOnePanel.setVisible(false);
        chapterOneContinueButtonPanel.setVisible(false);
        chapterOneContinueButton.setVisible(false);

        // Creating player health bar and weapon
        playerPanel = new JPanel();
        playerPanel.setBounds(140,15,1000,50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
        con.add(playerPanel);
        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel("10");
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);

        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);

        playerSetUp();

        // Panel setup
        EventOnePanel = new JPanel();
        EventOnePanel.setBounds(80,150,1100,300);
        EventOnePanel.setBackground(Color.black);
        con.add(EventOnePanel);

        // Text area setup
        eventOneTextArea = new JTextArea(
                "You wake up and find yourself in a caged cell with a guard in front of the cell door...\n" +
                        "You notice that the guard didn't take your pocket knife concealed around your ankle.\n" +
                        "Alongside you, across the room is a kid around the age of 14.\n" +
                        "Before you could say a word to him...\n" +
                        "A guard barges into the cell and tries to take the kid away.\n" +
                        "You have two choices...\n" +
                        "Either leave the kid to be taken away...\n" +
                        "Or help him...\n\n" +
                        "Which do you choose?"
        );

        eventOneTextArea.setBounds(100, 200, 810, 800);
        eventOneTextArea.setBackground(Color.black);
        eventOneTextArea.setForeground(Color.white);
        eventOneTextArea.setFont(smallFont);
        eventOneTextArea.setLineWrap(true);
        EventOnePanel.add(eventOneTextArea);

        //option 1

        //option 2


    }

    public void playerSetUp(){
        playerHP = 15;
        weapon = "Pocket-Knife";
        weaponLabelName.setText(weapon);
    }

    // Action listener class for handling button clicks
    public class TitleScreenHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            GameScreen();
        }
    }

    public class ContinueButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            ChapterOneScreen();
        }
    }

    public class ChapterOneContinueHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            EventOneScreen();
        }
    }
}
