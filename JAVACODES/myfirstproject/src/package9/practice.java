package package9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class practice {
      public static void main(String[] args) throws IOException {
	List<String> com = new ArrayList<String>();
	com.add("C:\\Users\\Aditya\\Desktop\\click.exe");
	ProcessBuilder pb=new ProcessBuilder(com);
	Process a=pb.start();
    System.out.println(a);	
    
    
      }
	
	
}
