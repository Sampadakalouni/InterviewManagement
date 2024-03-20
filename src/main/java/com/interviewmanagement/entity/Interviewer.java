package com.interviewmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Interviewer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer interviewerId;
	private String name;
	private String email;
	private long phone;
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
	@Override
	public String toString() {
		return "Interviewer [interviewerId=" + interviewerId + ", name=" + name + ", email=" + email + ", phone="
				+ phone + ", getInterviewerId()=" + getInterviewerId() + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
