package com.interviewmanagement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Interview {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer interviewScheduleId ;
	@ManyToOne(cascade = CascadeType.ALL)
	private Round round;
	private String scheduledDate;
	private String scheduledTime;
	private String location;
	private String status;
	private String round1Feedback;
	private String round1Rating;
	@ManyToOne(cascade = CascadeType.ALL)
	private JobPosting jobPosting;
	@ManyToOne(cascade = CascadeType.ALL)
	private Candidate candidate;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Interviewer> interviewers;
	private String round2Feedback;
	private String round2Rating;
	private String round3Feedback;
	private String round3Rating;
	private String interviewType;
	private String interviewDuration;
	private String interviewResult;
	private String notes;
	
	
	public Integer getInterviewScheduleId() {
		return interviewScheduleId;
	}
	public void setInterviewScheduleId(Integer interviewScheduleId) {
		this.interviewScheduleId = interviewScheduleId;
	}
	
	public Round getRound() {
		return round;
	}
	public void setRound(Round round) {
		this.round = round;
	}
	public String getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(String scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public String getScheduledTime() {
		return scheduledTime;
	}
	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRound1Feedback() {
		return round1Feedback;
	}
	public void setRound1Feedback(String round1Feedback) {
		this.round1Feedback = round1Feedback;
	}
	public String getRound1Rating() {
		return round1Rating;
	}
	public void setRound1Rating(String round1Rating) {
		this.round1Rating = round1Rating;
	}
	public JobPosting getJobPosting() {
		return jobPosting;
	}
	public void setJobPosting(JobPosting jobPosting) {
		this.jobPosting = jobPosting;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public List<Interviewer> getInterviewers() {
		return interviewers;
	}
	public void setInterviewers(List<Interviewer> interviewers) {
		this.interviewers = interviewers;
	}
	public String getRound2Feedback() {
		return round2Feedback;
	}
	public void setRound2Feedback(String round2Feedback) {
		this.round2Feedback = round2Feedback;
	}
	public String getRound2Rating() {
		return round2Rating;
	}
	public void setRound2Rating(String round2Rating) {
		this.round2Rating = round2Rating;
	}
	public String getRound3Feedback() {
		return round3Feedback;
	}
	public void setRound3Feedback(String round3Feedback) {
		this.round3Feedback = round3Feedback;
	}
	public String getRound3Rating() {
		return round3Rating;
	}
	public void setRound3Rating(String round3Rating) {
		this.round3Rating = round3Rating;
	}
	public String getInterviewType() {
		return interviewType;
	}
	public void setInterviewType(String interviewType) {
		this.interviewType = interviewType;
	}
	public String getInterviewDuration() {
		return interviewDuration;
	}
	public void setInterviewDuration(String interviewDuration) {
		this.interviewDuration = interviewDuration;
	}
	public String getInterviewResult() {
		return interviewResult;
	}
	public void setInterviewResult(String interviewResult) {
		this.interviewResult = interviewResult;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Interview [interviewScheduleId=" + interviewScheduleId + ", round=" + round + ", scheduledDate="
				+ scheduledDate + ", scheduledTime=" + scheduledTime + ", location=" + location + ", status=" + status
				+ ", round1Feedback=" + round1Feedback + ", round1Rating=" + round1Rating + ", jobPosting=" + jobPosting
				+ ", candidate=" + candidate + ", interviewers=" + interviewers + ", round2Feedback=" + round2Feedback
				+ ", round2Rating=" + round2Rating + ", round3Feedback=" + round3Feedback + ", round3Rating="
				+ round3Rating + ", interviewType=" + interviewType + ", interviewDuration=" + interviewDuration
				+ ", interviewResult=" + interviewResult + ", notes=" + notes + ", getInterviewScheduleId()="
				+ getInterviewScheduleId() + ", getRound()=" + getRound() + ", getScheduledDate()=" + getScheduledDate()
				+ ", getScheduledTime()=" + getScheduledTime() + ", getLocation()=" + getLocation() + ", getStatus()="
				+ getStatus() + ", getRound1Feedback()=" + getRound1Feedback() + ", getRound1Rating()="
				+ getRound1Rating() + ", getJobPosting()=" + getJobPosting() + ", getCandidate()=" + getCandidate()
				+ ", getInterviewers()=" + getInterviewers() + ", getRound2Feedback()=" + getRound2Feedback()
				+ ", getRound2Rating()=" + getRound2Rating() + ", getRound3Feedback()=" + getRound3Feedback()
				+ ", getRound3Rating()=" + getRound3Rating() + ", getInterviewType()=" + getInterviewType()
				+ ", getInterviewDuration()=" + getInterviewDuration() + ", getInterviewResult()="
				+ getInterviewResult() + ", getNotes()=" + getNotes() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
}
