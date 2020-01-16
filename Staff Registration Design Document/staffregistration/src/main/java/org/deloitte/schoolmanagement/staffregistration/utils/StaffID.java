package org.deloitte.schoolmanagement.staffregistration.utils;

import org.deloitte.schoolmanagement.staffregistration.dao.impl.StaffDao;

public class StaffID {
	public static String generateStaffID(){
		String start = "S-";
		StaffDao dao = null;
		@SuppressWarnings("null")
		int maxRegd = dao.getMaxRegNumber();
		maxRegd++;
		String regdno; 
		if(maxRegd<10)
			regdno = start+"00"+maxRegd;
		else if(maxRegd<100)
			regdno = start+"0"+maxRegd;
		else
			regdno = start+maxRegd;
		return regdno;
	}

}
