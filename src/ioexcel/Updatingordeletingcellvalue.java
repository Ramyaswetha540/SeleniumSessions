package ioexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Updatingordeletingcellvalue {

	public static void main(String[] args) throws Exception {
		
   FileInputStream fis=new FileInputStream("C:\\Users\\14388\\Desktop\\selenium\\logindata.xlsx");
   
   XSSFWorkbook wb=new XSSFWorkbook(fis);
   XSSFSheet sheet=wb.getSheet("sheet1");
   
     int row=sheet.getLastRowNum();
     int cell=sheet.getRow(0).getLastCellNum();
     
           
     for(int i=0;i<row;i++)
     {
    	     XSSFRow rows=sheet.getRow(i);
    	   
    	     for(int j=0;j<cell;j++)
    	     {
    	    	 String cells=rows.getCell(j).toString();
    	 
    	     }
    	     
    	     for(int j=0;j<cell;j++)
    	     {
    	    	      	    		 
    	    	    String cells=rows.getCell(j).toString();
    	    	  rows.getCell(j).removeCellComment();
    	          System.out.print(" "+cells);
        	       System.out.println();
    	     }
   


     }
	}
}


