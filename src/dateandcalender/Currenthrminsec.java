package dateandcalender;

import java.util.Calendar;

public class Currenthrminsec {
/* 1.create calendar instance
 * 
 */
	public static void main(String[] args) {
		
  Calendar cal=Calendar.getInstance(); 
  
  System.out.println("hour"+cal.get(Calendar.HOUR));
  System.out.println("min"+cal.get(Calendar.MINUTE));
  System.out.println("seconds"+cal.get(Calendar.SECOND));
  
  
System.out.println("year"+cal.get(Calendar.YEAR));
System.out.println("month"+cal.get(Calendar.MONTH));
System.out.println("date"+cal.get(Calendar.DATE));
	}

}
