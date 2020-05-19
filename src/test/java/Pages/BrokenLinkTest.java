package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayyappan\\eclipse-workspace-shrtask\\ExternalJars\\driveFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.sharetask.eu");
		
		driver.findElement(By.id("band-cookies-ok")).click();
		
		//Get all the links from page
		@SuppressWarnings("unchecked")
		List<WebElement> linksList = (List<WebElement>) driver.findElement(By.tagName("a"));
		
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		
		
		driver.quit();
	}

}
