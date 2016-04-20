import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAttribute;


public class myfirstclass {
	
	 public static void main(String[] args) {
		FirefoxDriver browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.navigate().to("http://www.zoomtra.com/");
		WebElement Fromtextbox = browser.findElement(By.id("ddlFrom"));
		Fromtextbox.sendKeys("Delhi");
	    WebElement fromtextbox1 = browser.findElement(By.name("ddlTo"));
	    fromtextbox1.sendKeys("Agra");
	    WebElement rdb = browser.findElement(By.id("rdbRound"));
	    boolean select = rdb.isSelected();
	    if(select==true){
	    	System.out.println("it is already selected");
	    }
	    else{
	    	rdb.click();
	    }
	WebElement checkbox = browser.findElement(By.id("chkYatra"));
	boolean select1 = checkbox.isSelected();
	if(select1==true){
		checkbox.click();
		System.out.println("unselected");
	}
	else
	{
	System.out.println("selected");
	}
	WebElement link = browser.findElement(By.linkText("hotel bookings"));
	link.click();
	 
	 }
	 
}
