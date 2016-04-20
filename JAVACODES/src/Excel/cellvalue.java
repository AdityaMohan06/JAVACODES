package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cellvalue {
	public static void main(String[] args) throws IOException {
		val v=new val();
		String path="F:\\Book1.xlsx";
		String name="Sheet1";
		System.out.println(v.getCellvalue(path,name,1,15));
		
	}
}
  class val{
	  
	 String getCellvalue(String excelpath,String sheetname,int rowno,int colno) throws IOException{
		  
		  
		  File f=new File(excelpath);
		  InputStream ip=new FileInputStream(f);
		  XSSFWorkbook wb=new XSSFWorkbook(ip);
		  XSSFSheet sh=wb.getSheet(sheetname);
		  XSSFRow row = sh.getRow(rowno);
		  XSSFCell cell = row.getCell(colno);
		  if(cell==null){
			 return "null";
		  }
		  
			  String stringCell = cell.getStringCellValue();
			  //stringCell = ( stringCell == null) ? "null" : stringCell;
			  ip.close();
			  return stringCell;
			 
		  
	  }
  
  
  
  }

