package Packagemain;

public class class4 {
	
	
	boolean pallinDrome()
	
	{
		
		String str1="madam";
		StringBuffer str2 = new StringBuffer(str1);
	   String str3 = str2.reverse().toString();
	    if(str1.equals(str3))
	    {
	   	System.out.println("string is pallindrom");
	    return true;
	    }
	    else
	    {
	    	System.out.println("string is not a pallindrome");
	        return false;
	    }
	}
      
}
