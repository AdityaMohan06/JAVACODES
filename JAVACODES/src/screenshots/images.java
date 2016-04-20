package screenshots;

/*import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;*/

import java.io.File;


import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
public class images {
	
	public static void main(String[] args) throws IOException {
		int stepCount = 0;
		FirefoxDriver ff=new FirefoxDriver();
		TakesScreenshot ts=(TakesScreenshot)ff;
		   
		ff.navigate().to("https://www.google.co.in/#gfe_rd=cr&gws_rd=ssl");
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs, new File("F:\\Images\\" +stepCount+".jpg"));
		
		
	
	}

}
