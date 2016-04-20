package package8;

import java.io.File;
;



public class Class8 {

public static void main(String[] args) {
	 
	String filePath = "F:\\Practise";
	File file = new File(filePath);
	File[] l = file.listFiles();

for(int a=0;a<l.length;a=a+1){
	File tempFile = l[a];
	  if(tempFile.getName().endsWith(".txt")){
		  System.out.println(tempFile.getName()+ "  txt   ");
		  
	  }
	  else if(tempFile.getName().endsWith(".xlsx")){
		  System.out.println(tempFile.getName()+   "  XLSX   ");
		  
	  }
	  else
	  {
		  System.out.println(tempFile.getName() +   "   Directory  ");
	  }

}
}
}
