package dateandcalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comparedates {
	
	
	/*   1. create  simpledate format object with required  date pattern
	 *   2. create two date objects 
	 *   3. we need to call compare to method on date */
	public static void main(String[] args) throws ParseException
	{
	
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		
		Date date1=sdf.parse("10/02/2020");
		Date date2=sdf.parse("10/02/2020");
		
		if(date1.compareTo(date2)<0)
		{
			System.out.println("date one is less then date2");
		}
		else if(date1.compareTo(date2)>0)
		{
			System.out.println("date1 is greater then date2");
		}
		else if(date1.compareTo(date2)==0)
		{
			System.out.println("both dates are equal");
		}
	}
}
