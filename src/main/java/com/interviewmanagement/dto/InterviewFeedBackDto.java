package com.interviewmanagement.dto;

import lombok.NonNull;

public class InterviewFeedBackDto {

	
	private String feedback;
	private String strengths;
	private String weaknesses;
	private String technicalSkills;
	private String communicationSkills;
	private String overallEvaluation;
    
	@NonNull
	private Integer interviewer;

	@NonNull
	private Integer round;
	@NonNull
	private Integer interview;

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getStrengths() {
		return strengths;
	}

	public void setStrengths(String strengths) {
		this.strengths = strengths;
	}

	public String getWeaknesses() {
		return weaknesses;
	}

	public void setWeaknesses(String weaknesses) {
		this.weaknesses = weaknesses;
	}

	public String getTechnicalSkills() {
		return technicalSkills;
	}

	public void setTechnicalSkills(String technicalSkills) {
		this.technicalSkills = technicalSkills;
	}

	public String getCommunicationSkills() {
		return communicationSkills;
	}

	public void setCommunicationSkills(String communicationSkills) {
		this.communicationSkills = communicationSkills;
	}

	public String getOverallEvaluation() {
		return overallEvaluation;
	}

	public void setOverallEvaluation(String overallEvaluation) {
		this.overallEvaluation = overallEvaluation;
	}

	public Integer getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(Integer interviewer) {
		this.interviewer = interviewer;
	}

	public Integer getRound() {
		return round;
	}

	public void setRound(Integer round) {
		this.round = round;
	}

	public Integer getInterview() {
		return interview;
	}

	public void setInterview(Integer interview) {
		this.interview = interview;
	}

	@Override
	public String toString() {
		return "InterviewFeedBackDto [feedback=" + feedback + ", strengths=" + strengths + ", weaknesses=" + weaknesses
				+ ", technicalSkills=" + technicalSkills + ", communicationSkills=" + communicationSkills
				+ ", overallEvaluation=" + overallEvaluation + ", interviewer=" + interviewer + ", round=" + round
				+ ", interview=" + interview + ", getFeedback()=" + getFeedback() + ", getStrengths()=" + getStrengths()
				+ ", getWeaknesses()=" + getWeaknesses() + ", getTechnicalSkills()=" + getTechnicalSkills()
				+ ", getCommunicationSkills()=" + getCommunicationSkills() + ", getOverallEvaluation()="
				+ getOverallEvaluation() + ", getInterviewer()=" + getInterviewer() + ", getRound()=" + getRound()
				+ ", getInterview()=" + getInterview() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
