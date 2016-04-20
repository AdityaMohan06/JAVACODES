import org.apache.bcel.generic.ICONST;


public class even {
	public static void main(String[] args) {
		int count=0;
		for(int i=10 ; i<=50 ;i=i+1)
		{
		if(i%2==0)
		{
	System.out.println(i);
		count++;}
			}
	System.out.println(count);
	
	}
}

