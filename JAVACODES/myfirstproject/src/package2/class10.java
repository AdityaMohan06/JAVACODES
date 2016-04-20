package package2;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class10 {
	public static void main(String[] args)throws IOException
	{
		FirefoxDriver browser = new FirefoxDriver();
		browser.navigate().to("http://www.zoomtra.com/");
		/*WebElement dropdown = browser.findElement(By.id("cbAdult"));*/
		Select se = new Select(browser.findElement(By.id("cbAdult")));
	    /*se.selectByVisibleText("3");*/
		/*se.selectByIndex(1);*/
		se.selectByValue("3");
		}
	
}