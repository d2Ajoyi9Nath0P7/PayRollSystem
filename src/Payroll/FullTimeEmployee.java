package Payroll;

public class FullTimeEmployee extends Employee{

    private double monthlySalary;
    FullTimeEmployee(String Name,int ID,double monthlySalary)
    {
        super(Name,ID);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary(){
        return monthlySalary;
    }
}