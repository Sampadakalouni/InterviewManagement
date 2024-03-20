package com.interviewmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewmanagement.dto.ApplicationFormDto;
import com.interviewmanagement.entity.Application;
import com.interviewmanagement.entity.Candidate;
import com.interviewmanagement.service.CandidateApplicationService;

@RestController
@RequestMapping("/candidateregisterandapplication")
public class CandidateApplicationController {
	
	@Autowired
	private CandidateApplicationService candidateApplication;

	@PostMapping("/registercandidate")
	public Candidate registerCandidate(@RequestBody Candidate candidate)
	{
		return this.candidateApplication.registerCandidate(candidate);
	}
	
	@PostMapping("/applicationformsubmit")
	public Application applicationForm(@RequestBody ApplicationFormDto applicationFormDto)
	{
		return this.candidateApplication.applicationForm(applicationFormDto);
	}
	
	@GetMapping("/viewapplicationform/{applicationsubmissiondate}")
	public List<Application> viewApplicationForms(@PathVariable("applicationsubmissiondate") String submisssionDate)
	{
		 return this.candidateApplication.viewApplicationForm(submisssionDate);
		
	}
	
	@PostMapping("/updatecandidatedetails")
	public Object updateCandidate(@RequestBody Candidate candidate)
	{
		return this.candidateApplication.updateCandidate(candidate);
	}
	

	@PostMapping("/updateapplicationform")
	public Object updateApllicationForm(@RequestBody Application application)
	{
		return this.candidateApplication.updateApplicationForm(application);
	}
}