package dateandcalender;

import java.text.DateFormatSymbols;

public class Listofmonths {
	/*1. create dateformat symbols object
	 *2. call getMonths() using DateFormatsymbols object
	 *3.Loop through string[] to disply LIST OF  months 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateFormatSymbols df=new DateFormatSymbols();
		String months[]=df.getMonths();
		
	for(String str:months)
	{
		System.out.println(str);
	}

	}

}
