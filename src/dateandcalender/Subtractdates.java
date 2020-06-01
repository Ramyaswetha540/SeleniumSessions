package dateandcalender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Subtractdates {
	/*   1. create  simpledate format object with required  date pattern
	 *   2. create a calender object with day,month,year
	 *   3.call add method to add numbe rof days
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy MMM dd");
		
		
		Calendar cal=new GregorianCalendar(2020,2,10);
		
		System.out.println("printing date before subtracting="+sdf.format(cal.getTime()));
		
		cal.add(Calendar.DAY_OF_WEEK,-5);
		System.out.println("printing date before subtracting="+sdf.format(cal.getTime()));
		cal.add(Calendar.DAY_OF_WEEK, 10);
		
		System.out.println("printing date before subtracting="+sdf.format(cal.getTime()));
	}

}
