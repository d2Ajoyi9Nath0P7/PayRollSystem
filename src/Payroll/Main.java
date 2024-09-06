package Payroll;

public class Main {
    public static void main(String[] args) {
        payrollSystem PS = new payrollSystem();

        FullTimeEmployee employee_1 = new FullTimeEmployee("Sakib Bhai",101,250000);
        PartTimeEmployee employee_2 = new PartTimeEmployee("Dipta Bhai",5001,16,500);

        PS.addEmployee(employee_1);
        PS.addEmployee(employee_2);

        System.out.println("Initial Employee Details : ");
        PS.displayEmployees();
        System.out.println("Removing Employee : ");
        PS.removeEmployee(5001);
        System.out.println("Remaining Employee Details : ");
        PS.displayEmployees();
    }
}