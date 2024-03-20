package com.interviewmanagement.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.interviewmanagement.entity.JobPosting;
import com.interviewmanagement.service.JobPostingService;

@RestController
@RequestMapping("/jobposting")
public class JobPostingController {

	@Autowired
	private JobPostingService jobPostingService;

	@PostMapping("/savejobs")
	public String savejobs(@RequestBody JobPosting jobPosting) {
		
		return this.jobPostingService.saveJobs(jobPosting);
	}

	@PostMapping("/updatejobs")
	public String updateJobs(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.updateJobs(jobPosting);
	}

	@GetMapping("/deletejobs/{jobId}")
	public String deleteJobs(@PathVariable("jobId") Integer jobId) {
		return this.jobPostingService.deleteJobs(jobId);
	}

	@GetMapping("/viewJobs")
	public List<JobPosting> viewJobs() {
		return this.jobPostingService.viewJobs();
	}
}
