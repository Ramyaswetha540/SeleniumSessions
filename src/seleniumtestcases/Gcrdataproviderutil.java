package seleniumtestcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Gcrdataproviderutil {
	
	static Workbook book;
	static Sheet sheet;
	
	public static String Sheet_path="C:\\Users\\14388\\eclipse-workspace\\SeleniumSessions\\src\\seleniumtestcases\\addnum.xlsx";
	
	public static Object[][] gettestdata(String sheetname)
	{
		
		FileInputStream file=null;
		try {
			file=new FileInputStream(Sheet_path);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			book=WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet=book.getSheet(sheetname);
		 
		 Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}

			
		
		return data;
		
	}

}
