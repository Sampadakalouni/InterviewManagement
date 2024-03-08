package com.interviewmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobPosting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String jobId;
	private String title;
	private String description;
	private String department;
	private String skills;
	private String experienceLevel;
	private String location;
	private String salaryRange;
	private String applicationDeadline;
	private String responsibilities;
	private String requirements;
	private String publishedDate;
	private String filled;
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getExperienceLevel() {
		return experienceLevel;
	}
	public void setExperienceLevel(String experienceLevel) {
		this.experienceLevel = experienceLevel;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSalaryRange() {
		return salaryRange;
	}
	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}
	public String getApplicationDeadline() {
		return applicationDeadline;
	}
	public void setApplicationDeadline(String applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	public String getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibilities(String responsibilities) {
		this.responsibilities = responsibilities;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getFilled() {
		return filled;
	}
	public void setFilled(String filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		return "JobPosting [jobId=" + jobId + ", title=" + title + ", description=" + description + ", department="
				+ department + ", skills=" + skills + ", experienceLevel=" + experienceLevel + ", location=" + location
				+ ", salaryRange=" + salaryRange + ", applicationDeadline=" + applicationDeadline
				+ ", responsibilities=" + responsibilities + ", requirements=" + requirements + ", publishedDate="
				+ publishedDate + ", filled=" + filled + ", getJobId()=" + getJobId() + ", getTitle()=" + getTitle()
				+ ", getDescription()=" + getDescription() + ", getDepartment()=" + getDepartment() + ", getSkills()="
				+ getSkills() + ", getExperienceLevel()=" + getExperienceLevel() + ", getLocation()=" + getLocation()
				+ ", getSalaryRange()=" + getSalaryRange() + ", getApplicationDeadline()=" + getApplicationDeadline()
				+ ", getResponsibilities()=" + getResponsibilities() + ", getRequirements()=" + getRequirements()
				+ ", getPublishedDate()=" + getPublishedDate() + ", getFilled()=" + getFilled() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
