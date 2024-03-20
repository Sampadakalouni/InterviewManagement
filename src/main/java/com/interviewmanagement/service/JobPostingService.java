package com.interviewmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmanagement.dao.JobPostingDao;
import com.interviewmanagement.entity.JobPosting;

@Service
public class JobPostingService {

	@Autowired
	private JobPostingDao jobPostingDao;

	public String saveJobs(JobPosting jobPosting) {
		jobPosting.setJobId(null);
		this.jobPostingDao.saveAndFlush(jobPosting);

		return "You Have sucessfully added the job in your application.";
	}

	public String updateJobs(JobPosting jobPosting) {

	if(jobPosting.getJobId() != null)
	{
		jobPostingDao.saveAndFlush(jobPosting);
		return "You have sucessfully updated the value which you want to be updated";
	}
	else 
	{
		return "The value of jobId cannot be null";
	}
	}

	public String deleteJobs(Integer jobId) {
		// TODO Auto-generated method stub

		this.jobPostingDao.deleteById(jobId);

		return "You have sucessfully deleted the job";
	}

	public List<JobPosting> viewJobs() {

		List<JobPosting> findAll = this.jobPostingDao.findAll();

		return findAll;
	}

}
