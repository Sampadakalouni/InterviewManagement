package com.interviewmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmanagement.dao.InterviewDao;
import com.interviewmanagement.dao.InterviewFeedbackDao;
import com.interviewmanagement.dto.InterviewFeedbackDto;
import com.interviewmanagement.entity.Interview;
import com.interviewmanagement.entity.InterviewFeedback;

@Service
public class InterviewFeedbackService {

	
	@Autowired
	private InterviewFeedbackDao feedbackDao;
	
	@Autowired
	private InterviewDao interviewDao;
	
	public InterviewFeedback saveInterviewFeedback(InterviewFeedback interviewFeedback) {
		
		return this.feedbackDao.saveAndFlush(interviewFeedback);
	}
	public String deleteInterviewFeedback(Integer feedbackId) {
		// TODO Auto-generated method stub
		this.feedbackDao.deleteById(feedbackId);
		return "You have sucessfully deleted the given feedback";
	}
    public  List<InterviewFeedback> viewInterviewFeedback() {
		// TODO Auto-generated method stub
		return this.feedbackDao.findAll();
	}
//    public  List<InterviewFeedback> viewinterviewFeedbackWithInterviewId(Integer interviewScheduleId) {
//		// TODO Auto-generated method stub
//		return this.feedbackDao.findByInterview(interviewScheduleId) ;
//	}
//	
	public List<InterviewFeedback> viewInterviewFeedbackWithInterviewId(Integer interviewScheduleId) {
		// TODO Auto-generated method stub
		 Optional<Interview> findById = this.interviewDao.findById(interviewScheduleId);
		 Interview interview = findById.get();
		 return this.feedbackDao.findByInterview(interview);
		 
	}

}
