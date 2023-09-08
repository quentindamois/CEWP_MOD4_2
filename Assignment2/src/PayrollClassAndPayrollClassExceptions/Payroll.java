package PayrollClassAndPayrollClassExceptions;

public class Payroll {
    private String Name;
    private int ID_number;
    private double Pay_rate;
    private double Hours_worked;
    public Payroll(String Name, int ID_number){
        this.Name = Name;
        this.ID_number = ID_number;
    }

    public void setPay_rate(double Pay_rate) {
        this.Pay_rate = Pay_rate;
    }
    public void setHours_worked(double Hours_worked){
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
