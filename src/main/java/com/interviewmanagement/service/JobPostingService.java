package com.interviewmanagement.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.interviewmanagement.dao.JobPostingDao;
import com.interviewmanagement.dto.UpdateJobsDto;
import com.interviewmanagement.entity.JobPosting;

@Service
public class JobPostingService {
	
	
	private JobPostingDao jobPostingDao;
	public String saveJobs(JobPosting jobPosting)
	{
		this.jobPostingDao.saveAndFlush(jobPosting);
		
		return"You Have sucessfully added the job in your application.";
	}
	public void updateJobs(UpdateJobsDto updateJobsDto) {
	
		// TODO Auto-generated method stub
		Optional<JobPosting> jobs = this.jobPostingDao.findById(updateJobsDto.getJobId());
		
	}

	
}
