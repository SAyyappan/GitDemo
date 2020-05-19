package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class PaymentPage extends TestBase{
	
	@FindBy(css = ".right_pannel h1")
	WebElement PaymentTitle;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/nav/ul/li[1]/a")
	WebElement Dashboard;
	
	//Initializing the page objects -->
	
	public PaymentPage()
	{
		PageFactory.initElements(driver, this);
				
	}
	
	public DashboardPage DashPage()
	{
		String msg = PaymentTitle.getText();
		Assert.assertEquals("Payment Methods",msg);
		
		Dashboard.click();
		return new DashboardPage();
	}

}
