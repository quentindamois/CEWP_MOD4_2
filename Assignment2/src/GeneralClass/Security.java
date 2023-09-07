package GeneralClass;

import javax.swing.*;

public class Security {
    public static int safeIntInput(String question) {
        int res;
        try {
            res = Integer.parseInt(JOptionPane.showInputDialog(question));
        } catch (NumberFormatException expetionNumberCustomer) {
            JOptionPane.showMessageDialog(null,"ERROR !\nYou must input an interger !");
            res = safeIntInput(question);
        }
        return res;
    }
    }


