package org.deloitte.schoolmanagement.staffregistration.controller;

import org.deloitte.schoolmanagement.staffregistration.beans.Staff_Info;
import org.deloitte.schoolmanagement.staffregistration.dao.impl.StaffDao;
import org.deloitte.schoolmanagement.staffregistration.utils.BusinessException;
import org.deloitte.schoolmanagement.staffregistration.utils.RegistrationBO;
import org.deloitte.schoolmanagement.staffregistration.utils.StaffCountryID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StaffController {
	@Autowired
	StaffDao dao;
	
	@RequestMapping(value="/addstaff", method=RequestMethod.GET)
	public String ShowRegdStaffForm(){
		return "StaffRegistrationForm";
	}
	@RequestMapping(value="/addstaff", method=RequestMethod.POST)
	public ModelAndView registerStaff(@ModelAttribute("staff") Staff_Info staff, 
			@RequestParam("date_Of_Joining") String date_Of_Joining,
			@RequestParam("Country") String country,
			@RequestParam("State") String state){
		ModelAndView mav = new ModelAndView();
		try{
			if(!RegistrationBO.registerStaffVDOB(staff.getDate_Of_Birth()))
				throw new BusinessException("ERROR CODE 504:Invalid DOB");
			if(!RegistrationBO.registerStaffVDOJ(staff.getDoj()))
				throw new BusinessException("ERROR CODE 505:Invalid DOJ");
			
		}
		catch(BusinessException e){
			System.out.println(e.getMessage());
			mav.setViewName("redirect:addstaff");
		}
		staff.setCountry_Id(StaffCountryID.getCountryID(country, state));
		dao.registerStaffDetails(staff);
		System.out.println("Completed");
		return mav;
	}

}
