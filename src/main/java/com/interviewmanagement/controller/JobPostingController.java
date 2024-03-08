package com.interviewmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.interviewmanagement.dto.UpdateJobsDto;
import com.interviewmanagement.entity.JobPosting;
import com.interviewmanagement.service.JobPostingService;


@RestController
public class JobPostingController {


	@Autowired
	private JobPostingService jobPostingService;
	
	@PostMapping("/savejobs")
	public String  savejobs(@RequestBody JobPosting jobPosting)
	{
		return this.jobPostingService.saveJobs(jobPosting);
	}
	
	@PostMapping("/updatejobs")
	public String updateJobs(@RequestBody UpdateJobsDto updateJobsDto )
	{
		this.jobPostingService.updateJobs(updateJobsDto);
	}
	
}
