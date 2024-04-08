package com.interviewmanagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewmanagement.dto.InterviewFeedBackDto;
import com.interviewmanagement.entity.InterviewFeedback;
import com.interviewmanagement.service.InterviewFeedbackService;

@RestController
@RequestMapping("/interviewsfeedback")
public class InterviewFeedbackController {

	
	@Autowired
	private InterviewFeedbackService feedbackService;
	
	
	@PostMapping("/saveinterviewfeedback")
	public InterviewFeedback saveInterviewFeedback(@RequestBody InterviewFeedBackDto interviewFeedBackDto)
	{
		return this.feedbackService.saveInterviewFeedback(interviewFeedBackDto);
	}
	
	
	@GetMapping("/deleteinterviewfeedback/{feedbackId}")
	public String deleteInterviewFeedback(@PathVariable("feedbackId") Integer feedbackId)
	{
		return this.feedbackService.deleteInterviewFeedback(feedbackId);
	}
	
	
	@GetMapping("/viewinterviewfeedbacks")
	public List<InterviewFeedback> viewInterviewFeedback()
	{ 
		return this.feedbackService.viewInterviewFeedback();
	}
	

	@GetMapping("/viewinterviewfeedbackswithinterviewid/{interviewScheduleId}")
	public List<InterviewFeedback> viewInterviewFeedbackWithInterviewId(@PathVariable("interviewScheduleId") Integer interviewScheduleId)
	{
		return this.feedbackService.viewInterviewFeedbackWithInterviewId(interviewScheduleId);
	}
	
	
	
	
}
 