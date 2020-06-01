package dateandcalender;


import java.text.SimpleDateFormat;

public class Stringtodate {
/*1.create  simpledate format object with required  date pattern
 *2.pass the date string to simpledateformat parse method
 */
	public static void main(String[] args) throws Exception {
	
		 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		 String date="21-05-2020 4:03:3";
		 
		 System.out.println(sdf.parse(date));
		 
		 
	}

}
