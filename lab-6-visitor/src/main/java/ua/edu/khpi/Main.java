package ua.edu.khpi;

import ua.edu.khpi.entity.Company;
import ua.edu.khpi.entity.Department;
import ua.edu.khpi.entity.Employee;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee employeeA1 = new Employee("Junior Software Engineer", BigDecimal.valueOf(800));
        Employee employeeA2 = new Employee("Middle Software Engineer", BigDecimal.valueOf(1500));
        Employee employeeA3 = new Employee("Senior Software Engineer", BigDecimal.valueOf(5000));

        Employee employeeB1 = new Employee("Senior QA", BigDecimal.valueOf(2300));
        Employee employeeB2 = new Employee("Intern QA", BigDecimal.valueOf(300));

        Department departmentA = new Department(Arrays.asList(employeeA1, employeeA2, employeeA3));
        Department departmentB = new Department(Arrays.asList(employeeB1, employeeB2));

        Company company = new Company(Arrays.asList(departmentA, departmentB));
        Visitor salaryCounterVisitor = new SalaryCounter();

        departmentA.accept(salaryCounterVisitor);
//        Salary across department = 7300

        departmentB.accept(salaryCounterVisitor);
//        Salary across department = 2600

        company.accept(salaryCounterVisitor);
//        Salary across company = 9900
    }
}
