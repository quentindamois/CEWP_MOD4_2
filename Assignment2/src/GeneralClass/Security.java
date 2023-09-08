package GeneralClass;

import javax.swing.*;

public class Security {
    /**
     * This is the scercurity class. The class stored static method used to handle exeption.
     * */
    /**
     * This is the safeIntInput method. It prevents NumberFormatExeption to appear when inputing an int.
     * @param question : this string is displayed in the screen when the user is asked to input an int.
     * @return res : the int inputed by the user.
     * */
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


