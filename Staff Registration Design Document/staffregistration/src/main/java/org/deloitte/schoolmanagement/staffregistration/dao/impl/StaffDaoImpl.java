package org.deloitte.schoolmanagement.staffregistration.dao.impl;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.deloitte.schoolmanagement.staffregistration.beans.Staff_Info;
import org.deloitte.schoolmanagement.staffregistration.beans.Staff_Salary;
import org.deloitte.schoolmanagement.staffregistration.utils.StaffExperienceCategory;
import org.deloitte.schoolmanagement.staffregistration.utils.StaffID;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class StaffDaoImpl implements StaffDao{
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	public Staff_Salary retrieveSalary(int experience) {
		Session session = sessionFactory.openSession();
		Staff_Salary Staff_Salary = (Staff_Salary) session.get(Staff_Salary.class, experience);
		return Staff_Salary;
	}

	public int getMaxRegNumber() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Staff_Info> staffList = session.createQuery("from Staff_Info").list();
		return staffList.size();
		
	}

	public void registerStaffDetails(Staff_Info staff) {
		Session session=sessionFactory.openSession();
		Transaction tx=(Transaction) session.beginTransaction();
		staff.setStaff_Id(StaffID.generateStaffID());
		staff.setExperience(StaffExperienceCategory.getExperienceCategory(staff.getDoj(),staff.getHighest_Qualification()));
		
		
		session.save(staff);
		try {
			tx.commit();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.close();
	}
      



		public boolean checkEmailId(String email_ID) {
			// TODO Auto-generated method stub
			return false;
		}}
