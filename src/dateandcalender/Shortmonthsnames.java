package dateandcalender;
//first 3 char of months
import java.text.DateFormatSymbols;

public class Shortmonthsnames {
	/*1. create dateformat symbols object
	 *2. call getshortmonths() using DateFormatsymbols object
	 *3.Loop through string[] to disply each short months 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormatSymbols df=new DateFormatSymbols();
		String months[]=df.getShortMonths();
		for(String str:months)
		{
			System.out.println(str);
		}
	}

}
