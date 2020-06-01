package dateandcalender;

import java.util.Calendar;
import java.util.Date;

public class Createdate {

	public static void main(String[] args) {
		

		Calendar cal=Calendar.getInstance(); 
		cal.set(Calendar.YEAR,2020);
		cal.set(Calendar.MONTH,3);
		cal.set(Calendar.DATE,22);
		
		
		Date date=cal.getTime();
		System.out.println(date);
				
	
	
	}

}
