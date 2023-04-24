package ua.edu.khpi.entity;

import ua.edu.khpi.Visitor;

import java.util.List;

public class Company implements Common {

    private List<Department> departments;

    public Company() {
    }

    public Company(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.companyReport(this);
    }

    @Override
    public String toString() {
        return "Company{" +
                "departments=" + departments +
                '}';
    }
}
