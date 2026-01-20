package StructuralDesignPattern.Composite.Implementation.Example2;

public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "Jason Fedin", "Pro Developer");
        Employee dev2 = new Developer(101, "Myra Fedin", "Entry level Developer");

        Manager engManager = new Manager("Mike", 25000);
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee dev3 = new Developer(102,"Tom", "Developer");

        Manager generalManager = new Manager ("Mark", 50000);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();
    }
}
