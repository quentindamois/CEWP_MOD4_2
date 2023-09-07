package PersonAndCustomer;
import javax.swing.JOptionPane;
import GeneralClass.Security;
public class Main {
    public static void main(String[] arg) {
        String name = JOptionPane.showInputDialog("Enter the customer name :");
        String address = JOptionPane.showInputDialog("Enter enter the customer address :");
        String telephone = JOptionPane.showInputDialog("Enter the customer's phone number :");
        int numberCustomer = Security.safeIntInput("Enter the customer number: ");
        boolean mail = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter true if the customer is on the mailing list if not enter something else :"));
        Customer customer1 = new Customer(numberCustomer, mail, name, telephone, address);
        JOptionPane.showMessageDialog(null, customer1);
        PreferredCustomer customer2 = new PreferredCustomer(Security.safeIntInput("Enter the total amount of dollars spend: "),numberCustomer, mail, name, telephone, address);
        JOptionPane.showMessageDialog(null, customer2);
        System.exit(0);
    }
}
