package com.interviewmanagement.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmanagement.dao.InterviewerDao;

import com.interviewmanagement.entity.Interviewer;

@Service
public class InterviewerService {

	@Autowired 
	private InterviewerDao interviewerDao;
	public Interviewer saveInterviewDetails(Interviewer interviewer) {
	
		interviewer.setInterviewerId(null);
		return this.interviewerDao.saveAndFlush(interviewer);
	}
	public String deleteinterviewerDetails(Integer interviewerId) {
			
//		@Query(value =" DELETE FROM interview_interviewers WHERE interviewers_interviewer_id = :?1" , nativeQuery = true);
//		
		this.interviewerDao.deleteById(interviewerId);
		return "You Have sucessfully deleted the details of the interviwer you wanted to delete";
	}
	public Object updateInterviewerDetails(Interviewer interviewer) {
		
		if(interviewer.getInterviewerId() != null)
		{
			return this.interviewerDao.saveAndFlush(interviewer);
		}
		else
		{
			return "Invalid Update Operation";
		}
	}

	
}
