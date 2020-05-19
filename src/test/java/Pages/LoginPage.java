package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory
	
//	@FindBy(id = "band-cookies-ok")
//	WebElement CookiesAcceptClick;
	
	@FindBy(linkText = "Login")
	WebElement LoginLink;
	
	@FindBy(id = "email_id")
	WebElement Username;
	
	@FindBy(id = "pwd")
	WebElement Password;
	
	@FindBy(xpath = "//div[@id='sign_in']//input[@id='lgenter']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//a[@id='tgl_menu']")
	WebElement ToggleMenu;
	
	@FindBy(linkText = "Notifications")
	WebElement Notifications;
	
	@FindBy(linkText = "Logout")
	WebElement LogoutLink;
	
	@FindBy(xpath = "//div[@class='toggle_div']//a[contains(text(),'Dashboard')]")
	WebElement DashboardMenu;
	
	@FindBy(xpath = "//div[@class='landing-text wow fadeInUp animated']/p")
	WebElement HomepageTitle;

	
	//Initializing the page objects -->
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions like sendkeys and click on buttons -->
	
//	public void CookiesAcceptClick()
//	{
//		CookiesAcceptClick.click();
//	}
	
	public void LoginLinkCilck() throws InterruptedException
	{
		Thread.sleep(2000);
		LoginLink.click();
	}
	
	public void SendUsernamePassword(String username, String password)
	{
		Username.sendKeys(username);
		System.out.print(password);
		Password.sendKeys(password);	
	}
	
	public HomePage LoginButtonCilck() throws InterruptedException
	{
		LoginButton.click();
		Thread.sleep(3000);
		return new HomePage();
	}
	
	public void ToggleMenuClick()
	{
			ToggleMenu.click();
	}
	
	public void NotificationsClick()
	{
		Notifications.click();
	}
	
	public void LogoutLinkClick()
	{
		LogoutLink.click();
	}
	
	public void DashboardMenuClick()
	{
		DashboardMenu.click();
	}
	
	public String HomepageTitle()
	{
		return HomepageTitle.getText();
	}
}
