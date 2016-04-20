package Task;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceltotxt {
	
	
	public static void main(String[] args) throws IOException {
		excel ex = new excel();
		String xlpath="F:\\Book1.xlsx";
		String sheetname = "Sheet1";
		
		
		
		
		int rowCountExcel = ex.getRowCountExcel(xlpath, sheetname);
		for(int rw =0; rw <rowCountExcel+1; rw = rw +1){
			
			int cellCountExcel = ex.getCellCountExcel(xlpath, sheetname, rw);
			
			for(int cl = 0; cl < cellCountExcel ; cl = cl +1){
				String cellValue = ex.readData(xlpath, sheetname, rw, cl);
				
				System.out.print(cellValue + "     ");
			}
			System.out.println();
		}
		File file = new File("C:\\Users\\Aditya\\Desktop\\ouput.txt"); //Your file
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println("This goes to out.txt");
		}
		
		//String Data = ex.readData(xlpath, sheetName, 3, 1);
	//System.out.println(Data);
	
	}


	class excel{
		
		String readData(String xlpath,String sheetname,int rownum,int colno) throws IOException{
			File f=new File(xlpath);
			InputStream ip=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(ip);
			XSSFSheet sh=wb.getSheet(sheetname);
			XSSFRow rw=sh.getRow(rownum);
			XSSFCell cell = rw.getCell(colno);
			
			
			if(cell== null){
				return "cell null"; 
			}
			
			String stringCellValue = cell.getStringCellValue();
			
			stringCellValue = ( stringCellValue == null) ? "null" : stringCellValue;
			
			
			ip.close();
			return stringCellValue;
		}
		
		
		int getRowCountExcel(String xlpath, String sheetname) throws IOException{
			
			File f = new File(xlpath);
			InputStream is = new FileInputStream(f);
			
			XSSFWorkbook wb = new XSSFWorkbook(is);
			XSSFSheet sheet = wb.getSheet(sheetname);
			//int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
			
			int lastRowNum = sheet.getLastRowNum();
			is.close();
			return lastRowNum;
		}
		int getCellCountExcel(String xlpath, String sheetname, int rownum) throws IOException{
			
			File f = new File(xlpath);
			InputStream is = new FileInputStream(f);
			
			XSSFWorkbook wb = new XSSFWorkbook(is);
			XSSFSheet sheet = wb.getSheet(sheetname);
			XSSFRow row = sheet.getRow(rownum);
			if(row==null){
				return -1;
			}
			short lastCellNum = row.getLastCellNum();
			
			is.close();
			return lastCellNum;
		
		}	
		
	}
	
	


