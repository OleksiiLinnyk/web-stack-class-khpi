package ua.edu.khpi.entity;

import java.math.BigDecimal;

public class Employee {

    private String title;
    private BigDecimal salary;

    public Employee() {
    }

    public Employee(String title, BigDecimal salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
