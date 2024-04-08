package com.interviewmanagement.entity;

import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class InterviewFeedback {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer feedback_Id;
	private String feedback;
	private String strengths;
	private String weaknesses;
	private String technicalSkills;
	private String communicationSkills;
	private String overallEvaluation;
    @ManyToOne
    @JoinColumn(name = "interviewerId")
	private Interviewer interviewer;
	@OneToOne
	@JoinColumn(name = "roundId")
	private Round round;
	@ManyToOne
	@JoinColumn(name = "interviewId", referencedColumnName = "interviewScheduleId")
	private Interview interview;
	
	public Integer getFeedback_Id() {
		return feedback_Id;
	}
	public void setFeedback_Id(Integer feedback_Id) {
		this.feedback_Id = feedback_Id;
	}
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
	public Interviewer getInterviewer() {
		return interviewer;
	}
	public void setInterviewer(Interviewer interviewer) {
		this.interviewer = interviewer;
	}
	public Round getRound() {
		return round;
	}
	public void setRound(Round round) {
		this.round = round;
	}
	public Interview getInterview() {
		return interview;
	}
	public void setInterview(Interview interview) {
		this.interview = interview;
	}
	@Override
	public String toString() {
		return "InterviewFeedback [feedback_Id=" + feedback_Id + ", feedback=" + feedback + ", strengths=" + strengths
				+ ", weaknesses=" + weaknesses + ", technicalSkills=" + technicalSkills + ", communicationSkills="
				+ communicationSkills + ", overallEvaluation=" + overallEvaluation + ", interviewer=" + interviewer
				+ ", round=" + round + ", interview=" + interview + ", getFeedback_Id()=" + getFeedback_Id()
				+ ", getFeedback()=" + getFeedback() + ", getStrengths()=" + getStrengths() + ", getWeaknesses()="
				+ getWeaknesses() + ", getTechnicalSkills()=" + getTechnicalSkills() + ", getCommunicationSkills()="
				+ getCommunicationSkills() + ", getOverallEvaluation()=" + getOverallEvaluation()
				+ ", getInterviewer()=" + getInterviewer() + ", getRound()=" + getRound() + ", getInterview()="
				+ getInterview() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
