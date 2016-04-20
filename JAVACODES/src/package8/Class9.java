package package8;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Class9 {

	public static void main(String[] args) {
		
		FirefoxDriver ff = new FirefoxDriver();
		
		ff.navigate().to("http://erail.in/");
		WebElement f1 = ff.findElement(By.id("txtStationFrom"));
        f1.clear();
		f1.sendKeys("Meerut Cant");	
		WebElement f2 = ff.findElement(By.id("txtStationTo"));
		f2.clear();
		f2.sendKeys("New Delhi");
		ff.findElement(By.id("chkSelectDateOnly")).click();
		Select drop = new Select(ff.findElement(By.id("cmbQuota")));
		drop.selectByVisibleText("Multi Quota");
		WebElement button1 = ff.findElement(By.id("buttonFromTo"));
		button1.click();
		ff.findElement(By.id("chkFirstList")).click();
		
		
	
	}

	
	
}
