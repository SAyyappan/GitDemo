package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class BidTaskPage extends TestBase{
	
	//Page Factory
	
	@FindBy(xpath = "//*[@id=\"navbar-scroll\"]/ul[1]/li[1]/a")
	WebElement BrowseTaskLink;
	
	@FindBy(xpath = "//*[@id=\"all_tasks_div\"]/ul/li[1]/a/div[3]/h3")
	WebElement EarnClick;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/a")
	WebElement MakeanOfferClick;
	
	@FindBy(id = "WorkarBudget")
	WebElement WorkerBudget;
	
	@FindBy(id = "ReasonDes")
	WebElement ReasonDes;
	
	@FindBy(css = "input[type='button'][value='Next']")
	WebElement NextButton;
	
	@FindBy(xpath = "//*[@id=\"get-quote\"]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]")
	WebElement ClientBudget;
	
	@FindBy(xpath = "//*[@id=\"get-quote\"]/div/div/div[2]/div[1]/table/tbody/tr[2]/td[2]")
	WebElement SPOffer;
	
	@FindBy(xpath = "//*[@id=\"get-quote\"]/div/div/div[2]/div[1]/table/tbody/tr[3]/td[2]")
	WebElement SPVAT;
	
	@FindBy(xpath = "//*[@id=\"get-quote\"]/div/div/div[2]/div[1]/table/tbody/tr[4]/td[2]/span")
	WebElement SPBudgetAmount;
	
	@FindBy(xpath = "//*[@id=\"get-quote\"]/div/div/div[2]/a")
	WebElement DoneButton;	
	
	
	//Initializing the page objects -->
	public BidTaskPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void MakeAnOffer()
	{
		BrowseTaskLink.click();
		EarnClick.click();
		MakeanOfferClick.click();		
	}
	
	public void WorkerBudget(String SP_OfferAmount)	
	{
		WorkerBudget.clear();
		WorkerBudget.sendKeys(SP_OfferAmount);
	}
	
	public void ReasonDes()
	{
		ReasonDes.sendKeys("The heater is not being used for 10 years hence need to check thoroughly and will take good amount of time and efforts");
	}
	
	public void Nextbutton()
	{
		NextButton.click();
	}
	
	public String sendActual_offerTaskBudget(String Actual_offerTaskBudget)
	{
		Actual_offerTaskBudget = ClientBudget.getText();
		System.out.println("Actual_offerTaskBudget: "+Actual_offerTaskBudget);
		return Actual_offerTaskBudget;
	}
	
	public String sendActual_OfferAmount(String Actual_OfferAmount)
	{
		Actual_OfferAmount = SPOffer.getText();
		System.out.println("Actual_OfferAmount: "+Actual_OfferAmount);
		return Actual_OfferAmount;
	}
	
	public String sendActual_SP_VAT(String Actual_SP_VAT)
	{
		Actual_SP_VAT = SPVAT.getText();
		System.out.println("Actual_SP_VAT: "+Actual_SP_VAT);
		return Actual_SP_VAT;
	}
	
	public String sendActual_SP_WillGet(String Actual_SP_WillGet)
	{
		Actual_SP_WillGet = SPBudgetAmount.getText();
		System.out.println("Actual_SP_WillGet: "+Actual_SP_WillGet);
		return Actual_SP_WillGet;
	}
	
	public void SPOfferDone()
	{
		DoneButton.click();
	}

}
