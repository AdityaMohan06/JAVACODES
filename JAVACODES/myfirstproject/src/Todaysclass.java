import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Todaysclass {
	public static void main(String[] args) {
		FirefoxDriver browser=new FirefoxDriver();
		browser.navigate().to("http://www.zoomtra.com/");
		WebElement xpath = browser.findElement(By.xpath("//*[@id='ddlFrom']"));
		xpath.sendKeys("Delhi");
		String attribute = xpath.getAttribute("class");
		System.out.println(attribute);
		WebElement classname = browser.findElement(By.className("input-txt"));
		System.out.println(classname.getTagName());
		System.out.println(classname.getAttribute("id"));
		List<WebElement> tagname = browser.findElements(By.tagName("input"));
		System.out.println(tagname.size());
		for(WebElement value:tagname){
			System.out.println(value.getAttribute("id"));
		}
	}

}
