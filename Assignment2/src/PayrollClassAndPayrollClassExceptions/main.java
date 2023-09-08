package PayrollClassAndPayrollClassExceptions;

import PayrollClassAndPayrollClassExceptions.PayrollExceptions.EmptyName;
import PayrollClassAndPayrollClassExceptions.PayrollExceptions.InvalidID;
import PayrollClassAndPayrollClassExceptions.PayrollExceptions.InvalidNumber;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name : ");
        String Name = null;
        int ID = 0;
        try {
            Name = input.nextLine();
            if(Name == null || Name.isEmpty()) {
                throw new EmptyName();
            }
        } catch (EmptyName e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Enter employee's ID number : ");
        try {
            ID = input.nextInt();
            if(ID <= 0) {
                throw new InvalidID();
            }
        } catch (InvalidID e) {
            System.out.println(e.getMessage());
        }
        Payroll Employee = new Payroll(Name, ID);

        double Hours_Worked = 0, Pay_rate = 0;
        System.out.println("Enter employee's number of hours worked : ");
        try {
            Hours_Worked = input.nextDouble();
            if(Hours_Worked < 0 || Hours_Worked > 84) {
                throw new InvalidNumber();
            }
        } catch (InvalidNumber e) {
            System.out.println(e.getMessage());
        }
        Employee.setHours_worked(Hours_Worked);

        System.out.println("Enter employee's hourly pay rate : ");
        try {
            Pay_rate = input.nextDouble();
            if(Pay_rate < 0 || Pay_rate > 25) {
                throw new InvalidNumber();
            }
        } catch (InvalidNumber e) {
            System.out.println(e.getMessage());
        }
        Employee.setPay_rate(Pay_rate);

        System.out.println("Employee gross pay : " + Employee.gross_pay());
    }
}
