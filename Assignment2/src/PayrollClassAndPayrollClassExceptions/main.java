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
        Name = input.nextLine();
        System.out.println("Enter employee's ID number : ");
        ID = input.nextInt();
        Payroll Employee = new Payroll(Name, ID);

        double Hours_worked = 0, Pay_rate = 0;
        System.out.println("Enter employee's number of hours worked : ");
        Hours_worked = input.nextDouble();
        Employee.setHours_worked(Hours_worked);

        System.out.println("Enter employee's hourly pay rate : ");
        Pay_rate = input.nextDouble();
        Employee.setPay_rate(Pay_rate);

        System.out.println("Employee gross pay : " + Employee.gross_pay());
    }
}
