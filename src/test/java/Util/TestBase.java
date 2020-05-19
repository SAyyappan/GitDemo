package Util;

import java.io.File;
import java.io.IOException;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static WebDriver driver;
	//public static WebDriver wait;
	//public static Properties prop;
	public static ExcelData excelData = new ExcelData();	
	
		
/*	public TestBase()
	{
    	System.out.println("trace 01 Test base start constructor");
		excelData = new ExcelData();	
    	System.out.println("trace 01 Test base end constructor");
	}  */
	public static void initialization()
	{
    	System.out.println("trace 03 Test base start initialization");
		String browserName = excelData.browser();
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayyappan\\eclipse-workspace-shrtask\\ExternalJars\\driveFiles\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Ayyappan\\eclipse-workspace-shrtask\\ExternalJars\\driveFiles\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
    	System.out.println("trace 04 Test base after webdriver initialization");
		driver.get(excelData.url());
		System.out.println("trace 05 Test base after invoking URL");
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));
		
	}
}
