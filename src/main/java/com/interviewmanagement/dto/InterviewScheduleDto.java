package com.interviewmanagement.dto;

import java.util.List;

import lombok.NonNull;

public class InterviewScheduleDto {

	@NonNull
	private Integer interviewScheduleId;
	private String scheduledDate;
	private String scheduledTime;
	private String location;
	private String status;
	@NonNull
	private Integer jobPosting;
	@NonNull
	private Integer candidate;
	@NonNull
	private List<Integer> interviewers;
	private String interviewType;
	private String interviewDuration;
	private String notes;
	private Integer round;
	
	
	public Integer getRound() {
		return round;
	}
	public void setRound(Integer round) {
		this.round = round;
	}
	public Integer getInterviewScheduleId() {
		return interviewScheduleId;
	}
	public void setInterviewScheduleId(Integer interviewScheduleId) {
		this.interviewScheduleId = interviewScheduleId;
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
	public Integer getJobPosting() {
		return jobPosting;
	}
	public void setJobPosting(Integer jobPosting) {
		this.jobPosting = jobPosting;
	}
	public Integer getCandidate() {
		return candidate;
	}
	public void setCandidate(Integer candidate) {
		this.candidate = candidate;
	}
	public List<Integer> getInterviewers() {
		return interviewers;
	}
	public void setInterviewers(List<Integer> interviewers) {
		this.interviewers = interviewers;
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
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "InterviewScheduleDto [interviewScheduleId=" + interviewScheduleId + ", scheduledDate=" + scheduledDate
				+ ", scheduledTime=" + scheduledTime + ", location=" + location + ", status=" + status + ", jobPosting="
				+ jobPosting + ", candidate=" + candidate + ", interviewers=" + interviewers + ", interviewType="
				+ interviewType + ", interviewDuration=" + interviewDuration + ", notes=" + notes
				+ ", getInterviewScheduleId()=" + getInterviewScheduleId() + ", getScheduledDate()="
				+ getScheduledDate() + ", getScheduledTime()=" + getScheduledTime() + ", getLocation()=" + getLocation()
				+ ", getStatus()=" + getStatus() + ", getJobPosting()=" + getJobPosting() + ", getCandidate()="
				+ getCandidate() + ", getInterviewers()=" + getInterviewers() + ", getInterviewType()="
				+ getInterviewType() + ", getInterviewDuration()=" + getInterviewDuration() + ", getNotes()="
				+ getNotes() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
