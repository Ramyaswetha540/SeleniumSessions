package dateandcalender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//compare dates in java
public class Comapreusingdatemethods {
	
	/*1. create simpledateformat object with required date pattern
	 *2. create a two date objects
	 3. compare dates using before after and equals*/

	public static void main(String[] args) throws Exception {
		
     SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		
		Date date1=sdf.parse("21/02/2020");
		Date date2=sdf.parse("10/02/2020");
		
		if(date1.after(date2))
		{
			System.out.println("date1 is after date2");
		}
		if(date1.before(date2))
		{
			System.out.println("date1 is before date2");
		}
		if(date1.equals(date2))
		{
			System.out.println("both are equal");
		}
		
		
	}

}
