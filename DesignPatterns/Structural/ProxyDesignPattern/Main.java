package DesignPatterns.Structural.ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Employee employee = new EmployeeProxy();
        employee.createEmployee("USER", "Gaurav", "SP");
        employee.createEmployee("ADMIN", "Gaurav", "SP");
        System.out.println(employee.viewEmployeeDesignation("ADMIN", "Gaurav"));
        System.out.println(employee.viewEmployeeDesignation("USER", "Gaurav"));
        employee.deleteEmployee("USER", "Gaurav");
        employee.deleteEmployee("ADMIN", "Gaurav");
        System.out.println(employee.viewEmployeeDesignation("USER", "Gaurav"));
    }
}
