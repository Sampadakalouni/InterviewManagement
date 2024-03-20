package com.interviewmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewmanagement.dao.CandiateDao;
import com.interviewmanagement.dao.InterviewDao;
import com.interviewmanagement.dao.InterviewScheduleDao;
import com.interviewmanagement.dao.InterviewerDao;
import com.interviewmanagement.dao.JobPostingDao;
import com.interviewmanagement.dto.InterviewScheduleDto;
import com.interviewmanagement.entity.Candidate;
import com.interviewmanagement.entity.Interview;
import com.interviewmanagement.entity.InterviewSchedule;
import com.interviewmanagement.entity.Interviewer;
import com.interviewmanagement.entity.JobPosting;

@Service
public class InterviewScheduleService {

	@Autowired
	private InterviewScheduleDao interviewScheduleDao;

	@Autowired
	private InterviewDao dao;

	@Autowired
	private JobPostingDao jobPostingDao;

	@Autowired
	private CandiateDao candiateDao;

	@Autowired
	private InterviewerDao interviewerDao;

	public InterviewSchedule scheduleInterviews(InterviewSchedule interviewSchedule) {

		interviewSchedule.setScheduleId(null);
		return this.interviewScheduleDao.saveAndFlush(interviewSchedule);
	}

	public Interview addInterviews(InterviewScheduleDto interviewScheduleDto) {

		Optional<InterviewSchedule> findById = this.interviewScheduleDao.findById(interviewScheduleDto.getScheduleId());
		Interview interview = new Interview();
		interview.setInterviewScheduleId(interviewScheduleDto.getInterviewScheduleId());
		interview.setScheduledDate(interviewScheduleDto.getScheduledDate());
		interview.setScheduledTime(interviewScheduleDto.getScheduledTime());
		interview.setLocation(interviewScheduleDto.getLocation());
		interview.setStatus(interviewScheduleDto.getStatus());
		if (interviewScheduleDto.getJobPosting() != 0) {
			Optional<JobPosting> findById2 = this.jobPostingDao.findById(interviewScheduleDto.getJobPosting());
			if (!findById2.isEmpty())
				interview.setJobPosting(findById2.get());
		}
		if (interviewScheduleDto.getCandidate() !=0) {
			Optional<Candidate> findById2 = this.candiateDao.findById(interviewScheduleDto.getCandidate());
			if (!findById2.isEmpty())
				interview.setCandidate(findById2.get());
		}
		if (!interviewScheduleDto.getInterviewers().isEmpty()) {
			List<Interviewer> findAllById = this.interviewerDao.findAllById(interviewScheduleDto.getInterviewers());
			if (!findAllById.isEmpty())
				interview.setInterviewers(findAllById);
		}
		interview.setInterviewType(interviewScheduleDto.getInterviewType());
		interview.setInterviewDuration(interviewScheduleDto.getInterviewDuration());
		interview.setNotes(interviewScheduleDto.getNotes());
		InterviewSchedule interviewSchedule = findById.get();
		interviewSchedule.getInterview().add(interview);
		interviewScheduleDao.saveAndFlush(interviewSchedule);
		return interview;
	}

	public String deleteInterviewSchedule(Integer scheduleId) {

		this.interviewScheduleDao.deleteById(scheduleId);
		return "You Have sucessfully deleted the interviewschedules for a candidate";
	}

	public Object updateInterviews(Interview interview) {

		return this.dao.saveAndFlush(interview);
	}

	public String deleteInterviewSchedule(Integer scheduleId, Integer interviewScheduleId) {
		Optional<Interview> findById2 = this.dao.findById(interviewScheduleId);
		Interview interview = findById2.get();
		Optional<InterviewSchedule> findById = this.interviewScheduleDao.findById(scheduleId);
		InterviewSchedule interviewSchedule = findById.get();
		interviewSchedule.getInterview().remove(interview);
		this.dao.deleteById(interviewScheduleId);
		this.interviewScheduleDao.saveAndFlush(interviewSchedule);

		return "You Have sucessfully deleted the mentioned interview details";
	}

	public Object viewIndividualInterviews(Integer scheduleId) {
		if (scheduleId != null) {
			Optional<InterviewSchedule> findById = this.interviewScheduleDao.findById(scheduleId);
			InterviewSchedule interviewSchedule = findById.get();
			return interviewSchedule;

		} else
			return "Invalid operation";
	}

	public List<InterviewSchedule> viewInterviews() {

		return this.interviewScheduleDao.findAll();
	}

}
