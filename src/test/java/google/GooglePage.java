package google;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GooglePage {
	public WebDriver wd;
	@Test
	public void openpage()
	{
		wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
		
	}
	@AfterMethod
	public void screenshot() throws IOException
	{
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	org.apache.commons.io.FileUtils.copyFile(src, new File("D:\\WORKSPACE\\google-test\\Screen\\test.jpeg"));	
	}

}
