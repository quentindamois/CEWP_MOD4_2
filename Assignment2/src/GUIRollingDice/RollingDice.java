package GUIRollingDice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollingDice extends JFrame {
    private JPanel panel;
    private JLabel dice1;
    private JLabel dice2;
    private JButton submit;
    private final int WINDOW_WIDTH = 700;
    private final int WINDOW_HEIGHT = 350;
    public RollingDice() {
        setTitle("Rolling Dice Simulator");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addContent();
        add(panel);
        setVisible(true);
    }
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
        public void actionPerformed(ActionEvent e) {
            ImageIcon dice1Content = new ImageIcon(".\\Assignment2\\src\\GUIRollingDice\\dice" + (int)(Math.random() * 5) + ".png");
            ImageIcon dice2Content = new ImageIcon(".\\Assignment2\\src\\GUIRollingDice\\dice" + (int)(Math.random() * 5) + ".png");
            dice1.setIcon(dice1Content);
            dice2.setIcon(dice2Content);
        }
    }
    public static void main(String[] arg) {
        new RollingDice();
    }
}
