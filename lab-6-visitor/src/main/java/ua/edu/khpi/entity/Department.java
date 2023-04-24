package ua.edu.khpi.entity;

import ua.edu.khpi.Visitor;

import java.util.List;

public class Department implements Common {

    private List<Employee> employees;

    public Department() {
    }

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.departmentReport(this);
    }

    @Override
    public String toString() {
        return "Department{" +
                "employees=" + employees +
                '}';
    }
}
