
public class stringbuffer {
	public static void main(String[] args) {
		
		String str1="aditya";
		StringBuffer str2 = new StringBuffer(str1);
	   String str3 = str2.reverse().toString();
	    if(str1.equals(str3))
	    {
	   	System.out.println("string is pallindrom");
	    }
	    else
	    {
	    	System.out.println("string is not a pallindrome");
	    }
	 
	    
	    
	    }

}
