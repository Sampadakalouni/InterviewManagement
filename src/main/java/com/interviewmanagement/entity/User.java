package com.interviewmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int user_Id;
	 private String username;
	 private String password;
	 private String role;
	 private String name;
	 private String email;
	 private long phone;
	 private String address;
	 private String active;
	 private String lastLogin;
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}
	@Override
	public String toString() {
		return "User [user_Id=" + user_Id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", active="
				+ active + ", lastLogin=" + lastLogin + ", getUser_Id()=" + getUser_Id() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole() + ", getName()="
				+ getName() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone() + ", getAddress()="
				+ getAddress() + ", getActive()=" + getActive() + ", getLastLogin()=" + getLastLogin() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
	 
	 
}
