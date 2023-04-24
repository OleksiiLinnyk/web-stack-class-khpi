package ua.edu.khpi;

import ua.edu.khpi.entity.Company;
import ua.edu.khpi.entity.Department;
import ua.edu.khpi.entity.Employee;

import java.math.BigDecimal;

public class SalaryCounter implements Visitor {

    @Override
    public void companyReport(Company company) {
        BigDecimal totalCompanySalary = company.getDepartments()
                .stream().map(this::salaryDepartmentCounter)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Total salary for department = " + totalCompanySalary);
    }

    @Override
    public void departmentReport(Department department) {
        System.out.println("Total salary for department = " + salaryDepartmentCounter(department));
    }

    private BigDecimal salaryDepartmentCounter(Department department) {
        return department.getEmployees().stream().map(Employee::getSalary)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
