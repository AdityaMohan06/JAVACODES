package package9;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Arbitarypath {
	
	public static void main(String[] args) throws IOException {
		
		
		FirefoxProfile f1=new FirefoxProfile();
	      f1.setPreference("browser.download.folderList", 2);
	      f1.setPreference("browser.download.manager.showWhenStarting", false);
	      f1.setPreference("browser.download.dir", "C:\\Users\\Aditya\\Desktop\\Selenium");
	      f1.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/x-gzip");
		  
      FirefoxDriver ff1=new FirefoxDriver(f1);
		ff1.navigate().to("http://www.seleniumhq.org/download/");
		WebElement find = ff1.findElement(By.linkText( "32 bit Windows IE"));
		find.click();
		
		
	
	}

}
