package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgencyFacade {
    private final List<Company> companies=new ArrayList<>();
    private final List<Employee> employees=new ArrayList<>();

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public void addCompany(Company company){
        companies.add(company);
        companyDao.save(company);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
        employeeDao.save(employee);
    }

    public void setCompanyEmployee(Company company, Employee employee){
        company.getEmployees().add(employee);
        employee.getCompanies().add(company);

    }

    public List<Company> retreiveCompaniesBySigns(String signs){
        return companyDao.retrieveCompaniesByFragment(signs);
    }

    public List<Employee> retreiveEmployeesBySigns(String signs){
        return employeeDao.retrieveEmployeesByFragment(signs);
    }

    public void cleanCompanyEmployee(){
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }


}
