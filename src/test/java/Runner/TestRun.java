package Runner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.TestUtil;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class TestRun {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayyappan\\eclipse-workspace-shrtask\\ExternalJars\\driveFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.sharetask.eu/";
        //String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        driver.manage().window().maximize();

        System.out.println("// 3 | type | id=email_id | ayyappan.sivatharisanam@gmail.com");
        
        
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
	    driver.findElement(By.cssSelector(".nav > li:nth-child(2) img")).click();
	    
        driver.findElement(By.id("email_id")).sendKeys("ayyappan.sivatharisanam@gmail.com");
        System.out.println("// 4 | type | id=pwd | London12345#");
        driver.findElement(By.id("pwd")).sendKeys("London12345#");
        System.out.println("// 5 | click | css=.field-group:nth-child(3) > #lgenter | ");
        driver.findElement(By.cssSelector(".field-group:nth-child(3) > #lgenter")).click();
        System.out.println("// 6 | click | css=.name | ");
        driver.findElement(By.cssSelector(".name")).click();
        System.out.println("// 7 | click | css=.toggle_div li:nth-child(2) > a | ");
        driver.findElement(By.cssSelector(".toggle_div li:nth-child(2) > a")).click();
        System.out.println("// 8 | click | css=.options > li:nth-child(4) > a | ");
        driver.findElement(By.cssSelector(".options > li:nth-child(4) > a")).click();
        System.out.println("// 9 | click | linkText=Add | ");
        driver.findElement(By.linkText("Add")).click();
        System.out.println("// 10 | click | id=Cell | ");
        driver.findElement(By.id("Cell")).click();
        // 11 | click | css=.phn-no:nth-child(2) > button | 
        driver.findElement(By.cssSelector(".phn-no:nth-child(2) > button")).click();
        // 12 | click | linkText=OK | 
        driver.findElement(By.linkText("OK")).click();
        // 13 | click | id=OTP | 
        driver.findElement(By.id("OTP")).click();
        // 14 | type | id=OTP | 957146
        driver.findElement(By.id("OTP")).sendKeys("957146");
        // 15 | click | css=.phn-no:nth-child(1) > button | 
        driver.findElement(By.cssSelector(".phn-no:nth-child(1) > button")).click();
        // 16 | click | linkText=OK | 
        driver.findElement(By.linkText("OK")).click();

        // get the actual value of the title
        //actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        //if (actualTitle.contentEquals(expectedTitle)){
        //    System.out.println("Test Passed!");
        //} else {
        //    System.out.println("Test Failed");
        //}
       
        //close Fire fox
        //driver.close();
       
    }

}