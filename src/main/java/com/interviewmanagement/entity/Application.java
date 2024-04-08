package com.interviewmanagement.entity;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer  applicationId;
	
	private String status;
	private String submissionDate;
	private String coverLetterText;
	private String statusDate;
	@ManyToOne(cascade = CascadeType.ALL)
	private JobPosting jobPosting;
	@ManyToOne(cascade = CascadeType.ALL)
	private Candidate candidate;
	
	public Integer getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}
	public String getCoverLetterText() {
		return coverLetterText;
	}
	public void setCoverLetterText(String coverLetterText) {
		this.coverLetterText = coverLetterText;
	}
	public String getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
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
	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", status=" + status + ", submissionDate="
				+ submissionDate + ", coverLetterText=" + coverLetterText + ", statusDate=" + statusDate
				+ ", jobPosting=" + jobPosting + ", candidate=" + candidate + ", getApplicationId()="
				+ getApplicationId() + ", getStatus()=" + getStatus() + ", getSubmissionDate()=" + getSubmissionDate()
				+ ", getCoverLetterText()=" + getCoverLetterText() + ", getStatusDate()=" + getStatusDate()
				+ ", getJobPosting()=" + getJobPosting() + ", getCandidate()=" + getCandidate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
