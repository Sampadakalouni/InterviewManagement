package com.interviewmanagement.dto;

import lombok.NonNull;

public class ApplicationFormDto {

	private  Integer  applicationId;
	private String status;
	private String submissionDate;
	private String coverLetterText;
	private String statusDate;
	@NonNull
	private Integer jobPosting;

	@NonNull
	private Integer candidate;

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
	
	

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	@Override
	public String toString() {
		return "ApplicationFormDto [applicationId=" + applicationId + ", status=" + status + ", submissionDate="
				+ submissionDate + ", coverLetterText=" + coverLetterText + ", statusDate=" + statusDate
				+ ", jobPosting=" + jobPosting + ", candidate=" + candidate + ", getStatus()=" + getStatus()
				+ ", getSubmissionDate()=" + getSubmissionDate() + ", getCoverLetterText()=" + getCoverLetterText()
				+ ", getStatusDate()=" + getStatusDate() + ", getJobPosting()=" + getJobPosting() + ", getCandidate()="
				+ getCandidate() + ", getApplicationId()=" + getApplicationId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
