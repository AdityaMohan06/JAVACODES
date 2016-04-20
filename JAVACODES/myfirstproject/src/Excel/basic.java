package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class basic {
	
	public static void main(String[] args) throws IOException {
        learn l=new learn();
        
		String path="F:\\Book1.xlsx";
		String sheet="Sheet1";
		System.out.println(l.getRowcount(path,sheet));	
		l.setCellvalue(path, sheet, 21, 45, "Hello");
	}
}
	
	class learn
	{
		int getRowcount(String excelpath,String Sheetname) throws IOException
		{
			File f=new File(excelpath);
			InputStream is=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(is);
			XSSFSheet sh = wb.getSheet(Sheetname);
		    int last = sh.getLastRowNum();
			return last;
		}
		
		void setCellvalue(String excelpath,String Sheetname,int rowno,int colno,String celltext  ) throws IOException{
			File f=new File(excelpath);
			InputStream ip=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(ip);
			XSSFSheet sh=wb.getSheet(Sheetname);
			XSSFRow row = sh.getRow(rowno);
			if(row==null){
				row=sh.createRow(rowno);
			}
			XSSFCell cell=row.getCell(colno);
			if(cell==null){
				cell=row.createCell(colno);
			}
		      cell.setCellValue(celltext);
		      ip.close();
		      OutputStream os=new FileOutputStream(f);
		      wb.write(os);
		      os.close();
		
		}
		
		
		
		
		
			
		}
		
			
		
	


