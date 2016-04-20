import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAttribute;
   
   public class program1 {
  
	public static void main(String[] args) {
	FirefoxDriver browser = new FirefoxDriver();
	browser.navigate().to("https://www.facebook.com/");
	WebElement email = browser.findElement(By.id("email"));
	email.sendKeys("8800228537");
    String attribute = email.getAttribute("class");
    System.out.println(attribute);
 }
}
