package com.test.myproject.Job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
       void createJob( Job job );
       boolean deleteJob(Long id);
       Job getJobById(Long id);

}
