package seleniumtestcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddNumofExcelFile {
	
	@Test(dataProvider="getdata")
	public void addnum(int val1,int val2,int val3)
	{
//		int a=Integer.parseInt(val1);
//		int b=Integer.parseInt(val2);
//		int c=Integer.parseInt(val3);
		int a=val1;
		int b=val2;
		int c=val3;
		int result=a+b+c;
		
		System.out.println(result);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=Gcrdataproviderutil.gettestdata("sheet1");
		return data;
	}
	

}
