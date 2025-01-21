package DesignPatterns.ProxyDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class EmployeeImpl implements Employee{

    Map<String, String> db = new HashMap<>();

    @Override
    public void createEmployee(String role, String employeeName, String designation) {
        db.put(employeeName, designation);
        System.out.println("Employee Created with Role: " + role);
    }

    @Override
    public void deleteEmployee(String role, String employeeName) {
        db.remove(employeeName);
        System.out.println("Employee Deleted with Role: " + role);
    }

    @Override
    public String viewEmployeeDesignation(String role, String employeeName) {
        return db.get(employeeName) == null ? "Employee not found !" : db.get(employeeName);
    }
}
