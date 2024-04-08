package com.interviewmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewmanagement.dto.InterviewScheduleDto;
import com.interviewmanagement.entity.Interview;
import com.interviewmanagement.entity.InterviewSchedule;
import com.interviewmanagement.service.InterviewScheduleService;

@RestController
@RequestMapping("/interviewscheduleandaddinterviews")
public class InterviewScheduleController {
	
	
	@Autowired
	private InterviewScheduleService scheduleService;
	
	@PostMapping("/scheduleinterviews")
	public InterviewSchedule scheduleInterviews(@RequestBody InterviewSchedule interviewSchedule)
	{
		return this.scheduleService.scheduleInterviews(interviewSchedule);
	}

	@PostMapping("/addinterviews")
	public Interview addInterviews(@RequestBody InterviewScheduleDto interviewScheduleDto )
	{
		return this.scheduleService.addInterviews(interviewScheduleDto);
	}
	
	@GetMapping("/deleteinterviewschedules/{scheduleId}")
	public String deleteInterviewSchedules(@PathVariable("scheduleId") Integer scheduleId)
	{
		return this.scheduleService.deleteInterviewSchedule(scheduleId);
	}
	
	@PostMapping("/updatespecificinterviews")
	public Object updateInterviews(@RequestBody InterviewScheduleDto interviewScheduleDto)
	{
		return this.scheduleService.updateInterviews(interviewScheduleDto);
	}
	
	@GetMapping("/deletespecificinterviews/{interviewScheduleId}/{scheduleId}")
	public String deleteInterviews(@PathVariable("scheduleId") Integer scheduleId,@PathVariable("interviewScheduleId") Integer interviewScheduleId)
	{
		return this.scheduleService.deleteInterviewSchedule(scheduleId,interviewScheduleId);
	}
	
	@GetMapping("/viewindividualinterviewschedules/{scheduleId}")
		public Object viewIndividualInterviews(@PathVariable("scheduleId") Integer scheduleId)
		{
			 return this.scheduleService.viewIndividualInterviews(scheduleId);
		}
	
	@GetMapping("/viewinterviews")
	public List<InterviewSchedule> viewInterviews()
	{
		return this.scheduleService.viewInterviews();
	}
	
	}
	

