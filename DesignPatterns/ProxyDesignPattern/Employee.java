package DesignPatterns.ProxyDesignPattern;

public interface Employee {
    public void createEmployee(String role, String employeeName, String designation);
    public void deleteEmployee(String role, String employeeName);
    public String viewEmployeeDesignation(String role, String employeeName);
}
