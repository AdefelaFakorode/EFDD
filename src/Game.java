import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game {
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 50); // could change later
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    JButton startButton;
    JTextArea mainTextArea;

    TitleScreenHandler tshandler = new TitleScreenHandler(); // action listener

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
        startButton.addActionListener(tshandler); // title screen handler


        titleNamePanel.add(titleNameLabel); // add the label to the panel
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.blue);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("You are an adventurer trapped in Dio's Dungeon; find a way out with your life intact!");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white); // text color
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);

        mainTextPanel.add(mainTextArea);
    }


    public class TitleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            createGameScreen();
        }
    }

}
