package com.interviewmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Round {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roundId;
	private int roundNumber;
	private String name;
	private String description;
	public int getRoundId() {
		return roundId;
	}
	public void setRoundId(int roundId) {
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
