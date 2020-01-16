package org.deloitte.schoolmanagement.staffregistration.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Staff_Salary")
public class Staff_Salary {
	@Id
	@Column(length=5)
	private String staff_Id;
	@Column(length=2)
	private int year_Of_Experience;
	@Column(length=10)
	private String highest_Qualification;
	@Column(length=7,precision=2)
	private double salary;
	
	
	public String getStaff_Id() {
		return staff_Id;
	}
	public void setStaff_Id(String staff_Id) {
		this.staff_Id = staff_Id;
	}
	public int getYear_Of_Experience() {
		return year_Of_Experience;
	}
	public void setYear_Of_Experience(int year_Of_Experience) {
		this.year_Of_Experience = year_Of_Experience;
	}
	public String getHighest_Qualification() {
		return highest_Qualification;
	}
	public void setHighest_Qualification(String highest_Qualification) {
		this.highest_Qualification = highest_Qualification;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


}
