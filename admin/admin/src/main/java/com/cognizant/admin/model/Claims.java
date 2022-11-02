package com.cognizant.admin.model;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
@Entity
@Table(name ="Claims")
public class Claims{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int claimsId;
	@NotNull
	@Size(min=5,max=20)
	private String firstName;
	private String middleName;
	@NotNull
	@Size(min=5,max=20)
	private String lastName;
	private int age;
	@JsonFormat(pattern="MM-DD-YYYY")
	private Date dob;
	private String gender;
	private int serviceId;
	private int claimAMount;
	@NotNull
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
	@Column(unique=true)
	private String email;
	private int templateId;
	@NotNull
	private String hospital;
	@NotNull
	private String city;
	@NotNull
	private String state;
	@Size(max=100)
	@NotNull
	private String address;
	
	/*public claims(int claimsId, @NotNull @Size(min = 5, max = 20) String firstName, String middleName,
			@NotNull @Size(min = 5, max = 20) String lastName, int age, Date dob, String gender, int serviceId,
			int claimAMount,
			@NotNull @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}") @UniqueElements String email,
			int templateId, @NotNull String hospital, @NotNull String city, @NotNull String state,
			@Size(max = 100) @NotNull String address) {
		super();
		this.claimsId = claimsId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.dob = dob;
		this.gender = gender;
		this.serviceId = serviceId;
		this.claimAMount = claimAMount;
		this.email = email;
		this.templateId = templateId;
		this.hospital = hospital;
		this.city = city;
		this.state = state;
		this.address = address;
	}*/
	public int getClaimsId() {
		return claimsId;
	}
	public void setClaimsId(int claimsId) {
		this.claimsId = claimsId;
	}
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getClaimAMount() {
		return claimAMount;
	}
	public void setClaimAMount(int claimAMount) {
		this.claimAMount = claimAMount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTemplateId() {
		return templateId;
	}
	public void setTemplateId(int templateId) {
		this.templateId = templateId;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "claims [claimsId=" + claimsId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", age=" + age + ", dob=" + dob + ", gender=" + gender + ", serviceId="
				+ serviceId + ", claimAMount=" + claimAMount + ", email=" + email + ", templateId=" + templateId
				+ ", hospital=" + hospital + ", city=" + city + ", state=" + state + ", address=" + address + "]";
	}
	
	
	
}