package com.test.myproject.Company;

import com.test.myproject.Job.Job;
import com.test.myproject.Job.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }


    @GetMapping
    public ResponseEntity<List<Company>> findAll (){
        return new ResponseEntity<>( companyService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Company> findOne (@PathVariable Long id){
        return new ResponseEntity<>( companyService.getCompanyById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity< String> createCompany(@RequestBody Company company){
        companyService.createCompany(company);
        return new ResponseEntity<>("Company added successfully", HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable Long id) {
        // Log the id of the job to be deleted. You can use a logger (e.g., SLF4J) instead of System.out.
        companyService.deleteCompany(id);
        return new ResponseEntity<>("Company deleted successfully", HttpStatus.OK);
    }
}
