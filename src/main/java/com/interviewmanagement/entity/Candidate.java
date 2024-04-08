package com.interviewmanagement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer candidateId;
	private String name;
	private String email;
	private String phone;
	private String coverLetter;
	private String dateOfBirth;
	private String gender;
	private String education;
	private String experience;
	private String resume;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Interview> interviews;
	
	public List<Interview> getInterviews() {
		return interviews;
	}
	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCoverLetter() {
		return coverLetter;
	}
	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", coverLetter=" + coverLetter + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", education=" + education + ", experience=" + experience + ", resume=" + resume
				+ ", getCandidateId()=" + getCandidateId() + ", getName()=" + getName() + ", getEmail()=" + getEmail()
				+ ", getPhone()=" + getPhone() + ", getCoverLetter()=" + getCoverLetter() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getGender()=" + getGender() + ", getEducation()=" + getEducation()
				+ ", getExperience()=" + getExperience() + ", getResume()=" + getResume() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
