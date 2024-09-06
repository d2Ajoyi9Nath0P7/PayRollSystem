package Payroll;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourRate;

    PartTimeEmployee(String Name,int ID,int hourWorked,double hourRate) {
        super(Name,ID);
        this.hoursWorked = hourWorked;
        this.hourRate = hourRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourRate;
    }
}