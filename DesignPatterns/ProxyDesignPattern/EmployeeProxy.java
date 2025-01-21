package DesignPatterns.ProxyDesignPattern;

// Here, this proxy class is acting as a validator for the incoming request and if validation passed, it forwards the
// call to the impl class which do the actual processing and return data back
public class EmployeeProxy implements Employee{

    private Employee employee;

    public EmployeeProxy(){
        employee = new EmployeeImpl();
    }

    @Override
    public void createEmployee(String role, String name, String designation) {
        if(role.equals("ADMIN")){
            employee.createEmployee(role, name, designation);
        }
        else{
            System.out.println("Role: " + role + " not authorised to create an Employee !!");
        }
    }

    @Override
    public void deleteEmployee(String role, String name) {
        if(role.equals("ADMIN")){
            employee.deleteEmployee(role, name);
        }
        else{
            System.out.println("Role: " + role + " not authorised to delete an Employee !!");
        }
    }

    @Override
    public String viewEmployeeDesignation(String role, String name) {
        if(role.equals("ADMIN") || role.equals("USER")){
            return employee.viewEmployeeDesignation(role, name);
        }
        else{
            return "Role: " + role + " not authorised to view an Employee !!";
        }
    }
}
