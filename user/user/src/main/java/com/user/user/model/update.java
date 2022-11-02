package com.user.user.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class update {
	@NotNull
	@Size(min=5,max=20)
	private String firstName;
	private String middleName;
	@NotNull
	@Size(min=5,max=20)
	private String lastName;
	private int age;
	private int claimAMount;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getClaimAMount() {
		return claimAMount;
	}
	public void setClaimAMount(int claimAMount) {
		this.claimAMount = claimAMount;
	}
	
}
