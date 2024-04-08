package com.interviewmanagement.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Round {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roundId;
	private int roundNumber;
	private String name;
	private String description;
	
	@OneToMany(mappedBy = "round",cascade = CascadeType.ALL)
	private List<Interview> interviews;
	
	@OneToOne(mappedBy = "round")
	private InterviewFeedback feedback;

	public List<Interview> getInterviews() {
		return interviews;
	}
	public void setInterviews(List<Interview> interviews) {
		this.interviews = interviews;
	}
	public InterviewFeedback getFeedback() {
		return feedback;
	}
	public void setFeedback(InterviewFeedback feedback) {
		this.feedback = feedback;
	}
	public Integer getRoundId() {
		return roundId;
	}
	public void setRoundId(Integer roundId) {
		this.roundId = roundId;
	}
	public int getRoundNumber() {
		return roundNumber;
	}
	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Round [roundId=" + roundId + ", roundNumber=" + roundNumber + ", name=" + name + ", description="
				+ description + ", getRoundId()=" + getRoundId() + ", getRoundNumber()=" + getRoundNumber()
				+ ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
