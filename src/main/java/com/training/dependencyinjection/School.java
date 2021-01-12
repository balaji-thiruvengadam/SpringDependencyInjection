package com.training.dependencyinjection;

public class School {
	private String schoolName;
	private Address address;

	public School() {
		System.out.println("School Constructor");
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void addressInfo(){
		System.out.println("Address Info : "+address.getCity()+" "+address.getState());
	}
}
