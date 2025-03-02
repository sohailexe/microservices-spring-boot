package com.test.myproject.Company;

import com.test.myproject.Job.Job;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();
    void createCompany( Company company );
    boolean deleteCompany(Long id);
    Company getCompanyById(Long id);
}
