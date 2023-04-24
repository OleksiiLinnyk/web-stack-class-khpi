package ua.edu.khpi;

import ua.edu.khpi.entity.Company;
import ua.edu.khpi.entity.Department;

public interface Visitor {

    void companyReport(Company company);

    void departmentReport(Department department);
}
