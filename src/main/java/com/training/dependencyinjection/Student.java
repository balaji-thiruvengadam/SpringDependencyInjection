package com.training.dependencyinjection;

public class Student {
	private String name;
	private String number;
	private int age;
	private School school;
	
	public Student(){
		System.out.println("Student Constructor");		
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void schoolInfo(){
		
		System.out.println("School Name : "+school.getSchoolName());
		school.addressInfo();
	}

}
