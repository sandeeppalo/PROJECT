package org.deloitte.schoolmanagement.staffregistration.dao.impl;

import org.deloitte.schoolmanagement.staffregistration.beans.Staff_Info;
import org.deloitte.schoolmanagement.staffregistration.beans.Staff_Salary;

public interface StaffDao {
	public int getMaxRegNumber();
	public void registerStaffDetails(Staff_Info staff);
	public Staff_Salary retrieveSalary(int experience);        
    public boolean checkEmailId(String email_ID);

}
