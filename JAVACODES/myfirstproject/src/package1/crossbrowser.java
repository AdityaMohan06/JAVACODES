package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class crossbrowser {
	
	public static void main(String[] args) {
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("internet explorer"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\myworkspace\\myfirstproject\\driver\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
		    InternetExplorerDriver Driver = new InternetExplorerDriver();    
		}else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\myworkspace\\myfirstproject\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		    ChromeDriver Driver = new ChromeDriver();
		}else
		{
			FirefoxDriver Driver =new FirefoxDriver();
		}
	
		
	}

}
