package Payroll;

abstract class Employee {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();//Confusion

    public String toString()
    {
        return "Name: " + name + " ID: " + id + " Salary: " + calculateSalary();
    }
}