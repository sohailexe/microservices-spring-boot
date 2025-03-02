package com.test.myproject.Job.impl;

import com.test.myproject.Job.Job;
import com.test.myproject.Job.JobRepositry;
import com.test.myproject.Job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImplementation implements JobService {
    JobRepositry jobRepositry;

    public JobServiceImplementation(JobRepositry jobRepositry) {
        this.jobRepositry = jobRepositry;
    }

    @Override
    public List<Job> findAll() {
        return jobRepositry.findAll();
    }

    @Override
    public void createJob( Job job) {
        jobRepositry.save(job);
    }

    public Job  getJobById(Long id){
        return  jobRepositry.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJob(Long id) {
        try {
            jobRepositry.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
