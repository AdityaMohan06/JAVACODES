import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class mysecondclass {

	public static void main(String[] args) {
		
		FirefoxDriver browser = new FirefoxDriver();
		browser.navigate().to("https://www.facebook.com/");
		WebElement email = browser.findElement(By.id("email"));
		email.sendKeys("8800228537");
		WebElement password = browser.findElement(By.id("pass"));
		password.sendKeys("9654703159");
		WebElement login = browser.findElement(By.id("u_0_v"));
		login.click();
	}
}
