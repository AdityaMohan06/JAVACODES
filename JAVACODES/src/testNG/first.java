package testNG;

import org.testng.annotations.*;

public class first {

	@Test (dependsOnMethods={"testB"})
	public void testA()  {
		System.out.println("tell me about testA");
	}
	
	@Test(priority=1)
	public void testB(){
		
		System.out.println("tell me about testB");
	}

	
    
	
}
