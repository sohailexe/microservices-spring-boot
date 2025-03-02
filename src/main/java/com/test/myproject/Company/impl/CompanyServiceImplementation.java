package com.test.myproject.Company.impl;

import com.test.myproject.Company.Company;
import com.test.myproject.Company.CompanyService;
import com.test.myproject.Company.CompnyRepositry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImplementation implements CompanyService {
    CompnyRepositry compnyRepositry;

    public CompanyServiceImplementation(CompnyRepositry compnyRepositry) {
        this.compnyRepositry = compnyRepositry;
    }


    @Override
    public List<Company> findAll() {
        return compnyRepositry.findAll();
    }

    @Override
    public void createCompany(Company company) {
        compnyRepositry.save(company);
    }

    @Override
    public boolean deleteCompany(Long id) {
        try {
            compnyRepositry.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Company getCompanyById(Long id) {
        return  compnyRepositry.findById(id).orElse(null);
    }
}
