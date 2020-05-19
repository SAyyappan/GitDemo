package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class PostTaskPage extends TestBase{
	
	//Page Factory	
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/div[2]/a")
	WebElement PostTask;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/h1")
	WebElement PostTaskPageTitle;
	
	@FindBy(id = "Tasktitle")
	WebElement Tasktitle;
	
	@FindBy(id = "Describeyourtask")
	WebElement Describeyourtask;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/form/div[3]/div[1]/input")
	WebElement TaskSkillsClick;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/form/div[3]/div[2]/div[3]/span[3]")
	WebElement Electrician;
	
	@FindBy(id = "ChoosePicture")
	WebElement AddPicture;
	
	@FindBy(css = "input[type='button'][value='Continue']")
	WebElement Continue;
	
	@FindBy(id ="Tasklocation")
	WebElement Tasklocation;
	
	@FindBy(id = "showcal")
	WebElement SpecificDateRadioButton;
	
	@FindBy(id = "datepicker")
	WebElement datepicker;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[1]/a")
	WebElement Date;
	
	@FindBy(css = "input[type='button'][value='Continue'][id=\"Continue1\"]")
	WebElement Continue1;
	
	@FindBy(id = "NoofWorkers")
	WebElement NoofWorkers;
	
	@FindBy(css = "input[type='radio'][value='Hourly rate']")
	WebElement HourlyRateRadioBtn;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/form/input[2]")
	WebElement HourlyRate;
	
	@FindBy(id = "FixedHour")
	WebElement FixedHour;
	
	@FindBy(css = "button[type='button'][class='GetQuotesNow']")
	WebElement GetQuotesNowButton;
	
	@FindBy(xpath = "//*[@id=\"get-quote\"]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[2]")
	WebElement Actual_SP_NetIncome_Data;
	
	@FindBy(xpath = "//*[@id=\"platform_amount\"]")
	WebElement Actual_PlatformFee_Data;
	
	@FindBy(xpath = "//*[@id=\"VAT_amount\"]")
	WebElement Actual_VAT_Data;
	
	@FindBy(xpath = "//*[@id=\"get-quote\"]/div/div/div[2]/div[1]/table/tbody/tr[4]/td[2]/span")
	WebElement Actual_Client_Budget_Data;
	
	@FindBy(xpath = "//*[@id=\"get-quote\"]/div/div/div[2]/a")
	WebElement Done;
	
	
	//Initializing the page objects -->
	public PostTaskPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions like sendkeys and click on buttons -->
	
	public void postTaskButtonclick()
	{
		PostTask.click();
	}
	
	public String PostTaskPageTitle()
	{
		return PostTaskPageTitle.getText();
		
	}
	
	public void Tasktitle()
	{
		Tasktitle.sendKeys("Need one person to repair electric heater");
	}
	
	public void Describeyourtask()
	{
		Describeyourtask.sendKeys("Need one person to repair electric heater, the heater is damaged due to moisture on coil for not being used for almost 10 years");
	}
	
	public void TaskSkills()
	{
		TaskSkillsClick.click();
		Electrician.click();
	}
	
	public void AddPicture() throws InterruptedException, AWTException
	{
		AddPicture.click();
		Thread.sleep(2000);
		
		StringSelection ss1 = new StringSelection("C:\\BWC\\ShareTask\\Portfolio.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		
		//native key strokes for CTRL, V and ENTER keys
		Robot robot1 = new Robot();

		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
	}
	
	public void FirstContinueClick()
	{
		Continue.click();
	}
	
	public void Tasklocation() throws InterruptedException
	{
		Tasklocation.sendKeys("Rue Saint Quentin");
		Thread.sleep(1000);
		Tasklocation.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		Tasklocation.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	public void ChooseDate()
	{
		SpecificDateRadioButton.click();
	}
	
	public void DatePicker()
	{
		datepicker.click();
		Date.click();
	}
	
	public void SecondContinueClick()
	{
		Continue1.click();
	}
	
	public void NoofWorkers()
	{
		NoofWorkers.sendKeys("1");
	}
	
	public void HourlyRateChoose()
	{
		HourlyRateRadioBtn.click();
	}
	
	public void SetHourlyRate(String Client_Budget)
	{
		HourlyRate.sendKeys(Client_Budget);
		FixedHour.clear();
		FixedHour.sendKeys("1");		
	}
	
	public void GetQuotesNowButton()
	{
		GetQuotesNowButton.click();
	}
	
	public String sendClientBudgetSPIncome(String Actual_SP_NetIncome)
	{
		Actual_SP_NetIncome = Actual_SP_NetIncome_Data.getText();
		System.out.println("Actual_SP_NetIncome: "+Actual_SP_NetIncome);
		return Actual_SP_NetIncome;
	}
	
	public String sendClientBudgetPlatformFee(String Actual_PlatformFee)
	{
		Actual_PlatformFee = Actual_PlatformFee_Data.getText();
		System.out.println("Actual_PlatformFee: "+Actual_PlatformFee);
		return Actual_PlatformFee;
	}
	
	public String sendClientBudgetVAT(String Actual_VAT)
	{
		Actual_VAT = Actual_VAT_Data.getText();
		System.out.println("Actual_VAT: "+Actual_VAT);
		return Actual_VAT;
	}
	
	public String sendClientBudget(String Actual_Client_Budget)
	{
		Actual_Client_Budget = Actual_Client_Budget_Data.getText();
		System.out.println("Actual_Client_Budget: "+Actual_Client_Budget);
		return Actual_Client_Budget;
	}
	
	public void DoneButton()
	{
		Done.click();
	}
	
}
