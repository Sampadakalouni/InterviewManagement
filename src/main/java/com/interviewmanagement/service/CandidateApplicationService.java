package com.interviewmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmanagement.dao.ApplicationDao;
import com.interviewmanagement.dao.CandiateDao;
import com.interviewmanagement.entity.Application;
import com.interviewmanagement.entity.Candidate;


@Service
public class CandidateApplicationService {

	@Autowired
	private CandiateDao candiateDao;
	
	@Autowired
	private ApplicationDao applicationDao;
	
	public Candidate registerCandidate(Candidate candidate) {
		candidate.setCandidateId(null);
		return this.candiateDao.saveAndFlush(candidate);
		
	}

	public Application applicationForm(Application application) {
		// TODO Auto-generated method stub
		 return this.applicationDao.saveAndFlush(application);
		
	}

	public List<Application> viewApplicationForm(String submisssionDate) {
		// TODO Auto-generated method stub
		List<Application> findBySubmissionDate = this.applicationDao.findBySubmissionDate(submisssionDate);
		return findBySubmissionDate;
	}

	public Object updateCandidate (Candidate candidate) {
		if(candidate.getCandidateId() != null)
		{
			 return this.candiateDao.saveAndFlush(candidate);
		}
		

		else
		{
			return "CandidateId values cannot be null, Please insert valid values";
		}
	}

	public Object updateApplicationForm(Application application) {
		
		if(application.getApplicationId() != null)
		{
			return this.applicationDao.saveAndFlush(application);
		}
		else
		{
			return"Invalid update operation";
		}
	}

	
	
}
