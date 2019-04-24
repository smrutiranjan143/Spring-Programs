package com.hc.entities;

import java.io.Serializable;
import java.util.Date;

public class Technician implements Serializable {
	private static final long serialVersionUID = -4134590753890185695L;

	protected int technicianNo;
	protected String technicianName;
	protected int experience;
	protected String mobileNo;
	protected String emailAddress;
	protected String designation;
	protected Date joiningDate;
	protected String skills;

	public int getTechnicianNo() {
		return technicianNo;
	}

	public void setTechnicianNo(int technicianNo) {
		this.technicianNo = technicianNo;
	}

	public String getTechnicianName() {
		return technicianName;
	}

	public void setTechnicianName(String technicianName) {
		this.technicianName = technicianName;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}