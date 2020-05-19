package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class HomePage extends TestBase{
	
	//Page Factory
	
	@FindBy(xpath = "//a[@id='tgl_menu']")
	WebElement ToggleMenu;
	
	@FindBy(xpath = "//div[@class='toggle_div']//a[contains(text(),'Dashboard')]")
	WebElement DashboardMenu;
	
	@FindBy(xpath = "//div[@class='landing-text wow fadeInUp animated']/p")
	WebElement HomepageTitle;
	
	@FindBy(xpath = "//div[@class='toggle_div']//a[contains(text(),'Logout')]")
	WebElement LogoutOption;

	

	//Initializing the page objects -->
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}

	//Actions like sendkeys and click on buttons -->
	
	public void ToggleMenuClick()
	{
			ToggleMenu.click();
	}
	
	public void DashboardMenuClick()
	{
		DashboardMenu.click();
	}
	
	public String HomepageTitle()
	{
		return HomepageTitle.getText();
	}
	
	public void LogoutOptionClick()
	{
		LogoutOption.click();
	}
}
