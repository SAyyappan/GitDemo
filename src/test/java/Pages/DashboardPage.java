package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class DashboardPage extends TestBase{
	
	//Page Factory
	
	@FindBy(css = ".right_pannel h1")
	WebElement DashboardTitle;
	
	@FindBy(xpath = "//a[text()='Account']")
	WebElement Account;
	
	@FindBy(xpath = "//a[text()='Profile']")
	WebElement Profile;
	
	@FindBy(xpath = "//a[text()='Skills']")
	WebElement Skills;
	
	@FindBy(xpath = "//a[text()='Verification']")
	WebElement Verification;
	
	@FindBy(xpath = "//a[text()='Payment']")
	WebElement Payment;
	
	@FindBy(xpath = "//*[@id=\"navbar-scroll\"]/ul[2]/li[2]/a")
	WebElement PostTask;
	
	//Initializing the page objects -->
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
			
	}
		
	//Actions like sendkeys and click on buttons -->
	
	public String DashboardTitle()
	{
		return DashboardTitle.getText();
	}
	
	public AccountPage Account()
	{
		Account.click();
		return new AccountPage();
	}
	
	public ProfilePage Profile()
	{
		Profile.click();
		return new ProfilePage();
	}
	
	public SkillsPage Skills()
	{
		Skills.click();
		return new SkillsPage();
	}
	
	public VerificationPage Verification()
	{
		Verification.click();
		return new VerificationPage();
	}
	
	public PaymentPage Payment()
	{
		Payment.click();
		return new PaymentPage();
	}
	
	public PostTaskPage PostTask()
	{
		PostTask.click();
		return new PostTaskPage();
	}
	
}
