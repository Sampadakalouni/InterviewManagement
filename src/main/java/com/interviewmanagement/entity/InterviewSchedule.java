package com.interviewmanagement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class InterviewSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer scheduleId; 
	private String scheduledDate;
	private String scheduledTime;
	private String location;
	private boolean status;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "interviewSchedule")
	private List<Interview> interview;
	
	public Integer getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Integer scheduleId) {
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
	public List<Interview> getInterview() {
		return interview;
	}
	public void setInterview(List<Interview> interview) {
		this.interview = interview;
	}
	@Override
	public String toString() {
		return "InterviewSchedule [scheduleId=" + scheduleId + ", scheduledDate=" + scheduledDate + ", scheduledTime="
				+ scheduledTime + ", location=" + location + ", status=" + status + ", interview=" + interview
				+ ", getScheduleId()=" + getScheduleId() + ", getScheduledDate()=" + getScheduledDate()
				+ ", getScheduledTime()=" + getScheduledTime() + ", getLocation()=" + getLocation() + ", isStatus()="
				+ isStatus() + ", getInterview()=" + getInterview() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
