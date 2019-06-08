package com.boot.autoconfig.bo;

public class BranchBo {
	protected int branchNo;
	protected String branchName;
	protected String ifscCode;
	protected String addressLine1;
	protected String city;
	protected String state;

	public BranchBo(int branchNo, String branchName, String ifscCode, String addressLine1, String city, String state) {
		super();
		this.branchNo = branchNo;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
	}

	public int getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "BranchBo [branchNo=" + branchNo + ", branchName=" + branchName + ", ifscCode=" + ifscCode
				+ ", addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state + "]";
	}

}
