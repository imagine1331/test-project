package com.example.test.model;


public class Member {
	
	private String memberNo;
	
	private String emailId;
	
	private String name;
	
	private String password;
	
	

	public String getMemberNo() {
		return memberNo;
	}



	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}



	public String getEmailId() {
		return emailId;
	}



	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", emailId=" + emailId + ", name=" + name + ", password=" + password
				+ "]";
	}
}
