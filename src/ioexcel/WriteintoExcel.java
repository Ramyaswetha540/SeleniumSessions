package ioexcel;

import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteintoExcel {

	public static void main(String[] args) throws Exception {
			
		//1.create workbook
		XSSFWorkbook workbook=new XSSFWorkbook();
		//2.create sheet
		
		XSSFSheet sheet=workbook.createSheet("test");
		
		//3.create row
		
	     XSSFRow row=sheet.createRow(0);//first row
	     XSSFRow row1=sheet.createRow(1);//second row
	     XSSFRow row2=sheet.createRow(2);//third row
		   
		//4.create cell 
		   
         XSSFCell cell=row.createCell(0);//00
         XSSFCell cell1=row.createCell(1);//01
         XSSFCell cell10=row1.createCell(0);//10
         XSSFCell cell11=row1.createCell(1);//11
         XSSFCell cell20=row2.createCell(0);//20
         XSSFCell cell21=row2.createCell(1);//21
         XSSFCell cell03=row.createCell(2);//03
         XSSFCell cell13=row1.createCell(2);//13
         //XSSFCell cell23=row2.createCell(2);//23 r c
         //5.set cell values
         
         
         
           cell.setCellValue("aadya");
           cell1.setCellValue("datar");
           cell10.setCellValue("ayaan");
           cell11.setCellValue("datar");
           cell20.setCellValue("minnie");
           cell21.setCellValue("mouse");
           cell03.setCellValue("NOtcompleted");
           cell13.setCellValue("NOtcompleted");
        // cell23.setCellValue("notcompleted");
              
           
           
           
          //cell.setCellValue("ayaandatar");
          //cell.setCellValue("datar");
         
         
         //6.write  the cell values using fileoutputstream-this create one excel file you need to mention the path where to be downloaded
         
         FileOutputStream fos=new FileOutputStream("C:\\Users\\14388\\Desktop\\selenium\\my folder\\newexcel.xlsx");
         workbook.write(fos);
         
         workbook.close();
         
         
		
		
		
		
		
	}

}
