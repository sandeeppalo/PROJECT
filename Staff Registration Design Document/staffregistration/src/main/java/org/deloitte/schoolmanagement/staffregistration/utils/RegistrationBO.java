package org.deloitte.schoolmanagement.staffregistration.utils;

import java.util.Date;

public class RegistrationBO {
	private RegistrationBO(){

	}
	// Name validation
	public static boolean registerStaffVName(String staff_Name) {
	char tempValue;
	int tempLength=staff_Name.length();
	boolean tempBoolean=true;
	for(int i=0;i<tempLength;i++) {
	tempValue=staff_Name.charAt(i);
	if(!((tempValue>64&&tempValue<91)||(tempValue>96&&tempValue<123)||tempValue==32)){
	tempBoolean=false;
	return tempBoolean;
	}
	}
	return tempBoolean;
	}

	// Email Validation
	public static boolean registerStaffVEmail(String email_Id) {
	char tempValue;
	int tempLength=email_Id.length();
	boolean tempBoollean=false;
	for(int i=0;i<tempLength;i++) {
	tempValue=email_Id.charAt(i);
	if(tempValue==64)
	for(i+=1;i<tempLength;i++) {
	tempValue=email_Id.charAt(i);
	if(tempValue==46) tempBoollean=true;
	}
	}
	return tempBoollean;
	}
	// contact validation
	public static boolean registerStaffVContact(String contact_Number) {
	char tempValue;
	int tempLength=contact_Number.length();
	boolean tempBoollean=true;
	if(tempLength!=10){
	tempBoollean=false;
	return tempBoollean;
	}
	for(int i=0;i<10;i++){
	tempValue=contact_Number.charAt(i);
	if(tempValue<48||tempValue>57){
	tempBoollean=false;
	return tempBoollean;
	}
	}
	return tempBoollean;
	}
	//DOB validation
	public static boolean registerStaffVDOB(Date date_Of_Birth){
	Date currentDate=new Date();
	if(date_Of_Birth.compareTo(currentDate)>0){
	return false;
	}
	return true;
	}
	//DOJ validation
	public static boolean registerStaffVDOJ(Date doj){
	Date currentDate=new Date();
	if(doj.compareTo(currentDate)>=0){
	return true;
	}
	return false;
	}

	//staff experience validation
	public static boolean regiterStaffVexperience(int experience){
	boolean tempvalue=true;
	if(experience>37){
	tempvalue=false;
	return tempvalue;
	}
	return tempvalue;
	}
	    //email exist validation
	    public static boolean registerStaffVEmailExist(String email_Id){
	    return true;
	    }
	}   


