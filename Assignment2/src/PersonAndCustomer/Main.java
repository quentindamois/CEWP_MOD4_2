package PersonAndCustomer;
import javax.swing.JOptionPane;
import GeneralClass.Security;
import GeneralClass.wrongCharInString;

public class Main {
    public static void main(String[] arg) {
        String name = Security.safeNameInput("Enter the customer name :");
        String address = Security.safeNameInput("Enter enter the customer address :");
        String telephone = Security.safePhoneNumberInput("Enter the customer's phone number :");
        int numberCustomer = Security.safeIntInput("Enter the customer number: ");
        boolean mail = Security.safeBooleanInput("Enter true if the customer is on the mailing list if no the enter false.");
        Customer customer1 = new Customer(numberCustomer, mail, name, telephone, address);
        JOptionPane.showMessageDialog(null, customer1);
        PreferredCustomer customer2 = new PreferredCustomer(Security.safeIntInput("Enter the total amount of dollars spend: "),numberCustomer, mail, name, telephone, address);
        JOptionPane.showMessageDialog(null, customer2);
        System.exit(0);
    }
}
