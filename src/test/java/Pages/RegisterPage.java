package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Util.TestBase;

public class RegisterPage extends TestBase{
	
	//Page Factory
	@FindBy(id = "band-cookies-ok")
	WebElement CookiesAcceptClick;
	
	@FindBy(linkText = "Register")
	WebElement RegisterLink;
	
	@FindBy(id = "FirstName")
	WebElement FirstName;
	
	@FindBy(id = "LastName")
	WebElement LastName;

	@FindBy(id = "cuntry")
	WebElement Country;
		
	@FindBy(id = "EmailAddress")
	WebElement EmailAddress;	
	
	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(css = "input[type='button']")
	WebElement RegisterButton;
	
	//Initializing the page objects -->
		public RegisterPage()
		{
			PageFactory.initElements(driver, this);
			
		}
		
	//Actions like sendkeys and click on buttons -->
		
		public void CookiesAcceptClick()
		{
			CookiesAcceptClick.click();

		}
		
		public void RegisterLinkCilck() throws InterruptedException
		{
			Thread.sleep(1000);
			RegisterLink.click();
		}
		
		public void SendFnameLname(String First_Name, String Last_Name)
		{
			FirstName.sendKeys(First_Name);
			LastName.sendKeys(Last_Name);
		}	
		
		Select select;
		public void getSelectedCountry()
		{
			select = new Select(Country);
			select.selectByVisibleText("Belgium");
		}
	
		public void SendEmailPass(String Email_Address, String password)
		{
			EmailAddress.sendKeys(Email_Address);
			Password.sendKeys(password);
		}
		
		public void RegisterButtonCilck()
		{
			RegisterButton.click();
		}
		

}
