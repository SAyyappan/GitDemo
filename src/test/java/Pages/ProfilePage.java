package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class ProfilePage extends TestBase{
	
	//Page Factory
	
	@FindBy(css = ".right_pannel h1")
	WebElement ProfileTitle;
	
	@FindBy(xpath = "//a[text()='Select Resume']")
	WebElement UploadResume;
	
	@FindBy(xpath = "//*[@id=\"ChoosePicture\"]/div")
	WebElement PortfolioImage;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/nav/ul/li[1]/a")
	WebElement Dashboard;
	
	//Initializing the page objects -->
	public ProfilePage()
	{
		PageFactory.initElements(driver, this);
				
	}
			
	//Actions like sendkeys and click on buttons -->
		
	public String ProfileTitle()
	{
		return ProfileTitle.getText();
			
	}
	
	public void UploadResume() throws AWTException, InterruptedException
	{
		UploadResume.click();
		Thread.sleep(2000);
		
		StringSelection ss = new StringSelection("C:\\BWC\\ShareTask\\BWC_CV_Ayyappan.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//native key strokes for CTRL, V and ENTER keys
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	}
	
	public DashboardPage PortfolioImage() throws AWTException, InterruptedException
	{
		PortfolioImage.click();
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
		
		Dashboard.click();
		return new DashboardPage();
		
	}

}
