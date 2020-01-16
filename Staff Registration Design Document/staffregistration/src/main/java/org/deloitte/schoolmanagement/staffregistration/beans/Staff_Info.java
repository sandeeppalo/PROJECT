package org.deloitte.schoolmanagement.staffregistration.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Staff_Info")
public class Staff_Info {
	/*@OneToOne(targetEntity=Staff_Salary.class,cascade=CascadeType.ALL)
	@JoinColumn(name="joincol",referencedColumnName="staff_Id")*/
	private String staff_Id;
	@Column(length=25)
	private String staff_Name;
	@Column
	private Date date_Of_Birth;
	@Column(length=50)
	private String address;
	@OneToOne(targetEntity=Country_Info.class,cascade=CascadeType.ALL)
	@JoinColumn(name="joincol",referencedColumnName="country_Id")
	private String country_Id;
	@Column(length=1)
	private String gender;
	@Column(length=7,precision=2)
	private double salary;
	@Column(length=20)
	private String highest_Qualification;
	@Column(length=20)
	private String email_Id;
	@Column(length=10)
	private int contact_Number;
	@Column(length=20)
	private String designation;
	@Column(length=5)
	private int year_Passed_Out;
	@Column(length=2)
	private int experience;
	@Column
	private Date doj;
	
	
	public String getStaff_Id() {
		return staff_Id;
	}
	public void setStaff_Id(String staff_Id) {
		this.staff_Id = staff_Id;
	}
	public String getStaff_Name() {
		return staff_Name;
	}
	public void setStaff_Name(String staff_Name) {
		this.staff_Name = staff_Name;
	}
	public Date getDate_Of_Birth() {
		return date_Of_Birth;
	}
	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(String country_Id) {
		this.country_Id = country_Id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHighest_Qualification() {
		return highest_Qualification;
	}
	public void setHighest_Qualification(String highest_Qualification) {
		this.highest_Qualification = highest_Qualification;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public int getContact_Number() {
		return contact_Number;
	}
	public void setContact_Number(int contact_Number) {
		this.contact_Number = contact_Number;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getYear_Passed_Out() {
		return year_Passed_Out;
	}
	public void setYear_Passed_Out(int year_Passed_Out) {
		this.year_Passed_Out = year_Passed_Out;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}

}
