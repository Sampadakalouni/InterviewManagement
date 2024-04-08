package com.interviewmanagement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Interviewer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer interviewerId;
	private String name;
	private String email;
	private long phone;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Interview>  interview;
	
	@OneToMany(mappedBy = "interviewer",cascade = CascadeType.REMOVE)
	private List<InterviewFeedback> interviewFeedbacks;
	
	public List<InterviewFeedback> getInterviewFeedbacks() {
		return interviewFeedbacks;
	}
	public void setInterviewFeedbacks(List<InterviewFeedback> interviewFeedbacks) {
		this.interviewFeedbacks = interviewFeedbacks;
	}
	public Integer getInterviewerId() {
		return interviewerId;
	}
	public void setInterviewerId(Integer interviewerId) {
		this.interviewerId = interviewerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	public List<Interview> getInterview() {
		return interview;
	}
	public void setInterview(List<Interview> interview) {
		this.interview = interview;
	}
	@Override
	public String toString() {
		return "Interviewer [interviewerId=" + interviewerId + ", name=" + name + ", email=" + email + ", phone="
				+ phone + ", getInterviewerId()=" + getInterviewerId() + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
