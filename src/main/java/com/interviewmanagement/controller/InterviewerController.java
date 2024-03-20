package com.interviewmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.interviewmanagement.entity.Interviewer;
import com.interviewmanagement.service.InterviewerService;

@RestController
public class InterviewerController {

	@Autowired
	private InterviewerService interviewerService;
	
	@PostMapping("/saveinterviewerdetails")
	public Interviewer saveInterviewerDetails(@RequestBody Interviewer interviewer)
	{
		return this.interviewerService.saveInterviewDetails(interviewer);
	}
	@GetMapping("/deleteInterviewer/{interviewerId}")
	public String deleteInterviewerDetails(@PathVariable("interviewerId") Integer interviewerId)
	{
		return this.interviewerService.deleteinterviewerDetails(interviewerId);
	}
	@PostMapping("/updateinterviewerdetails")
	public Object updateInterviewerDetails(@RequestBody Interviewer interviewer)
	{
		return this.interviewerService.updateInterviewerDetails(interviewer);
	}
	
}
