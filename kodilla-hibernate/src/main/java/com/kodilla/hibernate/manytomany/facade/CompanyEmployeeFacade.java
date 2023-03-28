package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeFacade {

    @Autowired
    public CompanyEmployeeFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;


    public List<Employee> findByNameFragment(String nameFragment) {
        return employeeDao.findByNameFragment(nameFragment);
    }
    public List<Company>retrieveCompaniesByNameFragment(String nameFragment){
        return companyDao.retrieveCompaniesByNameFragment(nameFragment);
    }



}
