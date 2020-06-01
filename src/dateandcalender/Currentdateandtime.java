package dateandcalender;

import java.text.SimpleDateFormat;
import java.util.Date;
/*1.create  simpledate format object with required  date pattern
 * 2.create date object
 3.pass date object to simple date format*/
public class Currentdateandtime {

	public static void main(String[] args) {
	
		
		 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		 Date date=new Date();
		 System.out.println(sdf.format(date));
		 
		 
		 SimpleDateFormat sdf1=new SimpleDateFormat("dd/mm/yyyy");
		// String date1=sdf1.format(new Date());
		 Date date1=new Date();
	     System.out.println(date1);
		 

	}

}
