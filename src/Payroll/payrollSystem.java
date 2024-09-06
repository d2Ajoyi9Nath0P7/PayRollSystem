package Payroll;

import java.util.ArrayList;

public class payrollSystem{
    private ArrayList<Employee> employeeList;

    payrollSystem() {
        employeeList = new ArrayList<Employee>();
    }
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }
    public void removeEmployee(int ID) {
        Employee employeeToRemove = null;
        for(Employee emp : employeeList)
        {
            if(emp.getId() == ID){
                employeeToRemove = emp;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
        else{
            System.out.println(ID+" Employee not found");
        }
    }

    public void displayEmployees(){
        for(Employee emp : employeeList){
            System.out.println(emp);
        }
    }
}