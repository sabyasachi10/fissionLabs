package com.fission.lab.bean;

public class EmployeeData implements Comparable<EmployeeData> {
	
	private String firstName;
	
	private String lastName;
	
	private String experience;
	
	private String age;
	
	private String organization;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	@Override
	public int compareTo(EmployeeData empObj) {
		return this.firstName.compareTo(empObj.firstName);
	}

}
