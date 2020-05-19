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
import org.openqa.selenium.support.ui.Select;

import Util.TestBase;

public class AccountPage extends TestBase{
	
	//Page Factory
	
	@FindBy(xpath = "//a[text()='Account']")
	WebElement Account;
	
	@FindBy(css = ".right_pannel h1")
	WebElement AccountTitle;
	
	@FindBy(xpath = "//input[@id='upload-images']")
	WebElement UploadImage;
	
	@FindBy(id = "upload-images-banner")
	WebElement UploadBanner;
	
	@FindBy(id = "Tagline")
	WebElement Tagline;
	
	@FindBy(id = "Address")
	WebElement Location;
	
	@FindBy(id = "DateOfBirth")
	WebElement DateOfBirth;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement Year;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement Month;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")
	WebElement Date;
	
	@FindBy(id = "email_id3")
	WebElement Email_id;
	
	@FindBy(id = "RegistrationVAT")
	WebElement RegistrationVAT;
	
	@FindBy(id = "PostTasks")
	WebElement PostTasksChkBox;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[5]/form/ul/li[9]/label[2]/div")
	WebElement PostTasks;
	
	@FindBy(id = "RunTasks")
	WebElement RunTasksChkBox;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[5]/form/ul/li[9]/label[3]/div")
	WebElement RunTasks;
	
	@FindBy(id = "HourlyRate")
	WebElement HourlyRate;
	
	@FindBy(id = "Description")
	WebElement Description;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/nav/ul/li[1]/a")
	WebElement Dashboard;
	
	@FindBy(css = "input[type='button'][value='Save profile']")
	WebElement SaveProfile;
	
	
	//Initializing the page objects -->
	public AccountPage()
	{
		PageFactory.initElements(driver, this);
			
	}
		
	//Actions like sendkeys and click on buttons -->

	/*public void Account()
	{
		Account.click();
	}*/
	
	public String AccountTitle()
	{
		return AccountTitle.getText();
		
	}
	
	public void UploadImage() throws AWTException, InterruptedException
	{
		UploadImage.click();
		Thread.sleep(2000);
		
		StringSelection UpIm = new StringSelection("C:\\BWC\\ShareTask\\Smily_photo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(UpIm, null);
		
		//native key strokes for CTRL, V and ENTER keys
		Robot robotUpIm = new Robot();

		robotUpIm.keyPress(KeyEvent.VK_CONTROL);
		robotUpIm.keyPress(KeyEvent.VK_V);
		robotUpIm.keyRelease(KeyEvent.VK_V);
		robotUpIm.keyRelease(KeyEvent.VK_CONTROL);
		robotUpIm.keyPress(KeyEvent.VK_ENTER);
		robotUpIm.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	public void UploadBanner() throws InterruptedException, AWTException
	{
		UploadBanner.click();
		Thread.sleep(2000);
		
		StringSelection UpBn = new StringSelection("C:\\BWC\\ShareTask\\Smily_photo.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(UpBn, null);
		
		//native key strokes for CTRL, V and ENTER keys
		Robot robotUpBn = new Robot();

		robotUpBn.keyPress(KeyEvent.VK_CONTROL);
		robotUpBn.keyPress(KeyEvent.VK_V);
		robotUpBn.keyRelease(KeyEvent.VK_V);
		robotUpBn.keyRelease(KeyEvent.VK_CONTROL);
		robotUpBn.keyPress(KeyEvent.VK_ENTER);
		robotUpBn.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	public void SendTagLocDOBReg(String Tag_line, String Loc, String DoB, String RegVAT)
	{
		System.out.println(Tag_line);
		System.out.println(Loc);
		System.out.println(DoB);
		System.out.println(RegVAT);
		
		Tagline.clear();
		Tagline.sendKeys(Tag_line);
		Location.clear();
		Location.sendKeys(Loc);
		Email_id.click();
		DateOfBirth.clear();
		DateOfBirth.click();
/*		
		Select selectY;
		selectY = new Select(Year);
		selectY.selectByVisibleText("1988");
		
		Select selectM;
		selectM = new Select(Month);
		selectM.selectByVisibleText("Jul");
		
		Date.click();
*/		
		DateOfBirth.sendKeys("12/05/1983");
		
		DateOfBirth.sendKeys(Keys.TAB);
		RegistrationVAT.clear();
		RegistrationVAT.sendKeys(RegVAT);
		
	}	
	
	public void PostTasks()
	{	
		if(PostTasksChkBox.isSelected())
		{
			System.out.println("Post Task Selected");
		}
		else
		{
			PostTasks.click();
		}
	}
	
	public void RunTasks()
	{
		if(RunTasksChkBox.isSelected())
		{
			System.out.println("Run Task Selected");
		}
		else
		{
			RunTasks.click();
		}
	}
	
	public void SendHourlyDescription(String Hourly_Rate,  String Descript)
	{
		HourlyRate.clear();
		HourlyRate.sendKeys(Hourly_Rate);
		Description.clear();
		Description.sendKeys(Descript);
	}
	
	public DashboardPage SaveProfile() throws InterruptedException
	{
		SaveProfile.click();
		Thread.sleep(3000);
		Dashboard.click();
		return new DashboardPage();
	}

}