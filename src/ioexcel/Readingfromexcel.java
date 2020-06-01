package ioexcel;

import java.io.FileInputStream;




//FOS-write-creating new excel workbook





import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingfromexcel {

	public static void main(String[] args) throws Exception {
	
		//1.fileinputstreamconnection
	FileInputStream fis=new FileInputStream("C:\\Users\\14388\\Desktop\\selenium\\logindata.xlsx");	
		 //2.create workbook XSSFWORKBOOK -CLASS
	
	       XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		 //3.get the sheet
		
		  //  XSSFSheet sheet=workbook.getSheet("sheet1");// get sheet by name
	       XSSFSheet sheet=workbook.getSheetAt(0);//get sheet by index 
		     
		   //4. get the row count
		     
		    int row=sheet.getLastRowNum();//returns row count present in excel
		    
		    //5.get column count
		    
               int coulmncount=sheet.getRow(0).getLastCellNum();//  no of last cell values
               
               
            // 6.read the  values from excel  sheet using for loop
               
               for(int i=0;i<row;i++)

               {
            XSSFRow currentrow=sheet.getRow(i);//focus on current row stored in row type variable
            	   
            	   for(int j=0;j<coulmncount;j++)
            	   {
            		             String cellvalue=currentrow.getCell(j).toString();
            		             System.out.print(" "+cellvalue);
            	   }
            	   
            	   System.out.println();
            	   
               }
            	   
	}

}
