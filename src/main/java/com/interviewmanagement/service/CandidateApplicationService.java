package com.interviewmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmanagement.dao.ApplicationDao;
import com.interviewmanagement.dao.CandiateDao;
import com.interviewmanagement.dao.JobPostingDao;
import com.interviewmanagement.dto.ApplicationFormDto;
import com.interviewmanagement.entity.Application;
import com.interviewmanagement.entity.Candidate;
import com.interviewmanagement.entity.JobPosting;


@Service
public class CandidateApplicationService {

	@Autowired
	private CandiateDao candiateDao;
	
	@Autowired
	private ApplicationDao applicationDao;
	
	@Autowired
	private JobPostingDao jobPostingDao;
	
	public Candidate registerCandidate(Candidate candidate) {
		candidate.setCandidateId(null);
		return this.candiateDao.saveAndFlush(candidate);
		
	}

	public Application applicationForm(ApplicationFormDto applicationFormDto) {
		// TODO Auto-generated method stub
		Application application= new Application();
		Optional<Candidate> findById = this.candiateDao.findById(applicationFormDto.getCandidate());
		application.setCandidate(findById.get());
		Optional<JobPosting> findById2 = this.jobPostingDao.findById(applicationFormDto.getJobPosting());
		application.setJobPosting(findById2.get());
		application.setApplicationId(null);
		application.setCoverLetterText(applicationFormDto.getCoverLetterText());
		application.setStatus(applicationFormDto.getStatus());
		application.setStatusDate(applicationFormDto.getStatusDate());
		application.setSubmissionDate(applicationFormDto.getSubmissionDate());
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
