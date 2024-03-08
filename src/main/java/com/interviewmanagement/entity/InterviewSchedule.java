package com.interviewmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class InterviewSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int scheduleId; 
	private String scheduledDate;
	private String scheduledTime;
	private String location;
	private boolean status;
	@OneToOne
	private Interview interview;
	@ManyToOne
	private Round round;
	@ManyToMany
	private Interviewer interviewer;
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Interview getInterview() {
		return interview;
	}
	public void setInterview(Interview interview) {
		this.interview = interview;
	}
	public Round getRound() {
		return round;
	}
	public void setRound(Round round) {
		this.round = round;
	}
	public Interviewer getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(Interviewer interviewer) {
		this.interviewer = interviewer;
	}
	@Override
	public String toString() {
		return "InterviewSchedule [scheduleId=" + scheduleId + ", scheduledDate=" + scheduledDate + ", scheduledTime="
				+ scheduledTime + ", location=" + location + ", status=" + status + ", interview=" + interview
				+ ", round=" + round + ", interviewer=" + interviewer + ", getScheduleId()=" + getScheduleId()
				+ ", getScheduledDate()=" + getScheduledDate() + ", getScheduledTime()=" + getScheduledTime()
				+ ", getLocation()=" + getLocation() + ", isStatus()=" + isStatus() + ", getInterview()="
				+ getInterview() + ", getRound()=" + getRound() + ", getInterviewer()=" + getInterviewer()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
