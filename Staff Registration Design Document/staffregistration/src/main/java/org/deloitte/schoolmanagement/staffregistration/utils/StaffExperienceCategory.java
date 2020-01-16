package org.deloitte.schoolmanagement.staffregistration.utils;

import java.util.Calendar;
import java.util.Date;

public class StaffExperienceCategory {



	public static int getExperienceCategory(Date doj,String highest_Qualification ) {
		// TODO Auto-generated method stub
		int years = 0;
		int sal = 0;


		//create calendar object for birth day
		Calendar joining = Calendar.getInstance();
		joining.setTimeInMillis(doj.getTime());

		//create calendar object for current day
		long currentTime = System.currentTimeMillis();
		Calendar now = Calendar.getInstance();
		now.setTimeInMillis(currentTime);

		//Get difference between years
		years = now.get(Calendar.YEAR) - joining.get(Calendar.YEAR);



		if (highest_Qualification=="UG" ){
			switch(years){

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				sal=20000;
				break;


			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				sal=25000;
				break;

			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				sal=30000;
				break;

			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				sal=35000;
				break;

			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
				sal=40000;
				break;

			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
				sal=45000;
				break;

			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
				sal=50000;
				break;
			default:
				System.out.println("Experience date not valid for UG");
				break;
			}
		}
		else if(highest_Qualification=="PG"){
			switch(years){

			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				sal=26000;
				break;


			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				sal=31000;
				break;

			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				sal=36000;
				break;

			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				sal=41000;
				break;

			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
				sal=46000;
				break;

			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
				sal=51000;
				break;

			case 31:
			case 32:
			case 33:
			case 34:

				sal=56000;
				break;
			default:
				System.out.println("Experience not valid for PG");
				break;
			}

		}
		return sal;	

	}





}




