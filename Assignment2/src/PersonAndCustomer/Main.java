package PersonAndCustomer;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] arg) {
        String name = JOptionPane.showInputDialog("Enter the customer name :");
        if (name != null) {
            String address = JOptionPane.showInputDialog("Enter enter the customer address :");
            if (address != null) {
                String telephone = JOptionPane.showInputDialog("Enter the customer's phone number :");
                if (telephone != null) {
                    String tempoString = JOptionPane.showInputDialog("Enter the customer number: ");
                    System.out.println(tempoString);
                    if (tempoString != null) {
                        int numberCustomer = Integer.parseInt(tempoString);
                        tempoString = JOptionPane.showInputDialog("Enter if the customer is on the mailing list: ");
                        if (tempoString != null) {
                            boolean mail = Boolean.parseBoolean(tempoString);
                            Customer customer1 = new Customer(numberCustomer, mail, name, telephone, address);
                            JOptionPane.showMessageDialog(null, customer1);
                            tempoString = JOptionPane.showInputDialog("Enter the total amount of dollars spend: ");
                            if(tempoString != null) {
                                PreferredCustomer customer2 = new PreferredCustomer(Integer.parseInt(tempoString),numberCustomer, mail, name, telephone, address);
                                JOptionPane.showMessageDialog(null, customer2);
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Wrong input, program is ending");
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Wrong input, program is ending");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong input, program is ending");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong input, program is ending");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Wrong input, program is ending");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Wrong input, program is ending");
        }

    }
}
