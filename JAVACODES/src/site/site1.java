package site;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class site1 {

	public static void main(String[] args) throws WebDriverException ,IOException, InterruptedException{
		
		
		FirefoxDriver ff=new FirefoxDriver();
		ff.manage().window().maximize();
		ff.navigate().to("http://rnb4u.in/download.php");
		WebElement f = ff.findElement(By.linkText("Ariana Grande - Be Alright"));
		Thread.sleep(2000);
		f.click();
		Thread.sleep(1000);
		WebElement find = ff.findElement(By.id("cboxIframe"));
        ff.switchTo().frame(find);
        ff.findElement(By.id("RnB4U-in-load7")).click();
         String win = ff.getWindowHandle();
         ff.switchTo().window(win);
     WebElement link = ff.findElement(By.linkText("Download"));
			link.click();
			 
			 
		}
	}

