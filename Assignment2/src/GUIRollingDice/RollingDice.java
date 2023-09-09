package GUIRollingDice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollingDice extends JFrame {
    /**
     * This is the RollingDice class. This classis an extgension of the JFrame class.
     * */
    /**
     * panel is a field on which store the label and the button.
     * */
    private JPanel panel;
    /**
     * dice1 is a JLabel variable that store a dice picture.
     * */
    private JLabel dice1;
    /**
     * dice2 is a JLabel variable that store a dice picture
     * */
    private JLabel dice2;
    /**
     * submit is a JButton that store the button rolling the dice.
     * */
    private JButton submit;
    /**
     * WINDOW_WIDTH is an int constant usede to define the window width.
     * */
    private final int WINDOW_WIDTH = 700;
    /**
     * WINDOW_HEIGHT is an int constant used to define the window height.
     * */
    private final int WINDOW_HEIGHT = 350;
    /**
     * This is the constructor of the class RollingDice that is used to start the method that roll dice.
     * */
    public RollingDice() {
        setTitle("Rolling Dice Simulator");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addContent();
        add(panel);
        setVisible(true);
    }
    /**
     * The addContent create the JPanel. It also creates and add to the JPanel the two JLabel wtoring the dice picture and the JButton.
     * */
    public void addContent() {
        this.panel = new JPanel();
        ImageIcon dice1Content = new ImageIcon(".\\Assignment2\\src\\GUIRollingDice\\dice" + (int)(Math.random() * 5) + ".png");
        ImageIcon dice2Content = new ImageIcon(".\\Assignment2\\src\\GUIRollingDice\\dice" + (int)(Math.random() * 5) + ".png");
        this.dice1 = new JLabel(dice1Content);
        this.dice2 = new JLabel(dice2Content);
        this.submit = new JButton("Roll");

        this.submit.addActionListener(new rolling());

        this.panel.add(dice1);
        this.panel.add(dice2);
        this.panel.add(submit);
    }
    private class rolling implements ActionListener {
        /**
         * This is the rolling class. Its purpose is to implement the ActionListener interface and to create the metode to roll the dice.
         * */
        /**
         * ActionPerformed is a method that is executed when the roll button is click on. The methode generate randomly 2 int between 0 and 5.
         * Each int is added to a string, togeter they form a path to one of six drawing of dice.
         * The file path are then used to load new dice prictures.
         * */
        public void actionPerformed(ActionEvent e) {
            ImageIcon dice1Content = new ImageIcon(".\\Assignment2\\src\\GUIRollingDice\\dice" + (int)(Math.random() * 5) + ".png");
            ImageIcon dice2Content = new ImageIcon(".\\Assignment2\\src\\GUIRollingDice\\dice" + (int)(Math.random() * 5) + ".png");
            dice1.setIcon(dice1Content);
            dice2.setIcon(dice2Content);
        }
    }
    /**
     * This is the main method. It is the first methode executed.
     * */
    public static void main(String[] arg) {
        new RollingDice();
    }
}
