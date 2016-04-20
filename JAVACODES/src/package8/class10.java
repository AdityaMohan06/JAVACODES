package package8;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class class10 {
  
	
	public static void main(String[] args) throws IOException  { 
		
		String filepath="F:\\Practise\\Text5.txt";
		File file=new File(filepath);
		FileReader f= new  FileReader(file);
		BufferedReader br=new BufferedReader(f);
        String Line = br.readLine();
        while(Line!=null){
        	System.out.println(Line);
        	Line=br.readLine();
        	br.close();        	
        }
        }
		
		
}
	
	
	

		
		
		
	

