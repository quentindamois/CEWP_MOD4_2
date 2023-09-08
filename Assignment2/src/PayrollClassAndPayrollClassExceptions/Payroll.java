package PayrollClassAndPayrollClassExceptions;

import PayrollClassAndPayrollClassExceptions.PayrollExceptions.EmptyName;
import PayrollClassAndPayrollClassExceptions.PayrollExceptions.InvalidID;
import PayrollClassAndPayrollClassExceptions.PayrollExceptions.InvalidNumber;

public class Payroll {
    private String Name;
    private int ID_number;
    private double Pay_rate;
    private double Hours_worked;
    public Payroll(String Name, int ID_number){
        try {
            if (Name == null || Name.isEmpty()) {
                throw new EmptyName();
            }
            if (ID_number <= 0) {
                throw new InvalidID();
            }
        } catch (EmptyName | InvalidID e) {
            System.out.println(e.getMessage());
            System.exit(2);
        }
        this.Name = Name;
        this.ID_number = ID_number;
    }

    public void setPay_rate(double Pay_rate) {
        try {
            if (Pay_rate < 0 || Pay_rate > 25) {
                throw new InvalidNumber();
            }
        } catch (InvalidNumber e) {
            System.out.println(e.getMessage());
            System.exit(2);

        }
        this.Pay_rate = Pay_rate;
    }
    public void setHours_worked(double Hours_worked){
        try {
            if (Hours_worked < 0 || Hours_worked > 84) {
                throw new InvalidNumber();
            }
        } catch (InvalidNumber e) {
            System.out.println(e.getMessage());
            System.exit(2);

        }
        this.Hours_worked = Hours_worked;
    }

    public String getName(){
        return this.Name;
    }
    public int getID_number(){
        return this.ID_number;
    }
    public double getPay_rate(){
        return this.Pay_rate;
    }
    public double getHours_worked() {
        return this.Hours_worked;
    }
    public double gross_pay(){
        return (this.Hours_worked * this.Pay_rate);
    }

}
