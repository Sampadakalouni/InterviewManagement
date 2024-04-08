package com.interviewmanagement.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmanagement.dao.InterviewDao;
import com.interviewmanagement.dao.InterviewFeedbackDao;
import com.interviewmanagement.dao.InterviewerDao;
import com.interviewmanagement.dao.RoundDao;
import com.interviewmanagement.dto.InterviewFeedBackDto;
import com.interviewmanagement.entity.Interview;
import com.interviewmanagement.entity.InterviewFeedback;
import com.interviewmanagement.entity.Interviewer;
import com.interviewmanagement.entity.Round;

@Service
public class InterviewFeedbackService {

	
	@Autowired
	private InterviewFeedbackDao feedbackDao;
	
	@Autowired
	private InterviewDao interviewDao;
	
	@Autowired
	private RoundDao roundDao;
	
	@Autowired
	private InterviewerDao interviewerDao;
	
	public InterviewFeedback saveInterviewFeedback(InterviewFeedBackDto interviewFeedBackDto) {
		
		InterviewFeedback feedback = new InterviewFeedback();
		feedback.setFeedback(interviewFeedBackDto.getFeedback());
		feedback.setStrengths(interviewFeedBackDto.getStrengths());
		feedback.setWeaknesses(interviewFeedBackDto.getWeaknesses());
		feedback.setTechnicalSkills(interviewFeedBackDto.getTechnicalSkills());
		feedback.setCommunicationSkills(interviewFeedBackDto.getCommunicationSkills());
		feedback.setOverallEvaluation(interviewFeedBackDto.getOverallEvaluation());
		if(interviewFeedBackDto.getRound() != null)
		{
			Optional<Round> findById = this.roundDao.findById(interviewFeedBackDto.getRound());
			feedback.setRound(findById.get());
		}
		if(interviewFeedBackDto.getInterview() != null)
		{
			Optional<Interview> findById = this.interviewDao.findById(interviewFeedBackDto.getInterview());
			feedback.setInterview(findById.get());
		}
		if(interviewFeedBackDto.getInterviewer() != null) {
			Optional<Interviewer> findById = this.interviewerDao.findById(interviewFeedBackDto.getInterviewer());
			feedback.setInterviewer(findById.get());
		}
		return this.feedbackDao.saveAndFlush(feedback);
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
