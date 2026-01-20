package StructuralDesignPattern.Composite.Implementation.Example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Manager implements Employee{
    private List<Employee> employeeList = new ArrayList<Employee>();

    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("-------------");
        System.out.println("Name ="+getName());
        System.out.println("Salary ="+getSalary());
        System.out.println("-------------");

        Iterator<Employee> employeeIterator = employeeList.iterator();
        while(employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.showEmployeeDetails();
        }
    }

    public Employee getChild(int i) {
        return employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}
