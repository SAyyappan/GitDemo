package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.google.common.base.Splitter;

import Util.TestBase;

public class SkillsPage extends TestBase{
	
	//Page Factory
	
	@FindBy(css = ".right_pannel h1")
	WebElement SkillsTitle;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[1]/div/div[1]/input")
	WebElement specialities;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[1]/div/div[2]/div[3]/span[1]")
	WebElement ACrepair;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[1]/div/div[2]/div[3]/span[3]")
	WebElement Electrician;
	
	@FindBy(xpath = "//input[@name='Transportation[]'][@value='Bicycle']")
	WebElement BicycleChkBox;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[2]/label[2]/div")
	WebElement Bicycle;
	
	@FindBy(xpath = "//input[@name='Transportation[]'][@value='Car']")
	WebElement CarChkBox;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[2]/label[3]/div")
	WebElement Car;
	
	@FindBy(xpath = "//input[@name='Transportation[]'][@value='Online']")
	WebElement OnlineChkBox;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[2]/label[4]/div")
	WebElement Online;
	
	@FindBy(xpath = "//input[@name='Transportation[]'][@value='Scooter']")
	WebElement ScooterChkBox;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[2]/label[5]/div")
	WebElement Scooter;
	
	@FindBy(xpath = "//input[@name='Transportation[]'][@value='Truck']")
	WebElement TruckChkBox;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[2]/label[6]/div")
	WebElement Truck;
	
	@FindBy(xpath = "//input[@name='Transportation[]'][@value='Walk']")
	WebElement WalkChkBox;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[2]/label[7]/div")
	WebElement Walk;
	
	@FindBy(xpath = "//input[@name='Languages']")
	WebElement Lang;
	
	@FindBy(xpath = "//input[@name='Education']")
	WebElement Edu;
	
	@FindBy(xpath = "//input[@name='WorkExperience']")
	WebElement WorkExp;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/nav/ul/li[1]/a")
	WebElement Dashboard;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement SaveSkills;
	
	//Initializing the page objects -->
		public SkillsPage()
		{
			PageFactory.initElements(driver, this);
					
		}
				
		//Actions like sendkeys and click on buttons -->
			
		public String SkillsTitle()
		{
			return SkillsTitle.getText();
				
		}
		
		public void Specialities(String Specialities)
		{
			//Select select;
			//select = new Select(specialities);
			
			specialities.clear();
			specialities.click();
			ACrepair.click();
			Electrician.click();
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[1]/label")).click();
			
			/*List<WebElement> splts= driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li[1]/div/select"));
			for(WebElement Opt : splts)
			{
				System.out.println(Opt.getText());
			}
			
			String value = Specialities;
			List<String> list = Splitter.on('-').splitToList(value);
			
			for(String element : list)
			{			
			select.selectByVisibleText(element);
			}*/
		}
		
		public void Transportation(String Transportation)
		{
			String value = Transportation;
			List<String> list = Splitter.on('-').splitToList(value);
			
			for(String element : list)
			{	
				//System.out.println(element);
				if(element.equals("Bicycle"))
				{
					if(BicycleChkBox.isSelected())
					{
						System.out.println("Bicycle is selected");
					}
					else
					{
						Bicycle.click();
					}
				}
				else if(element.equals("Car"))
				{
					if(CarChkBox.isSelected())
					{
						System.out.println("Car is selected");
					}
					else
					{
						Car.click();
					}
				}
				else if(element.equals("Online"))
				{
					if(OnlineChkBox.isSelected())
					{
						System.out.println("Online is selected");
					}
					else
					{
						Online.click();
					}
				}
				else if(element.equals("Scooter"))
				{
					if(ScooterChkBox.isSelected())
					{
						System.out.println("Scooter is selected");
					}
					else
					{
						Scooter.click();
					}
				}
				else if (element.equals("Truck"))
				{
					if(TruckChkBox.isSelected())
					{
						System.out.println("Truck is selected");
					}
					else
					{
						Truck.click();
					}
				}
				else if (element.equals("Walk"))
				{
					if(WalkChkBox.isSelected())
					{
						System.out.println("Walk is selected");
					}
					else
					{
						Walk.click();
					}
				}			
				
			}
			
		}
		
		public void Languages(String Languages)
		{
			Lang.clear();
			Lang.sendKeys(Languages);
		}
		
		public void Education(String Education)
		{
			Edu.clear();
			Edu.sendKeys(Education);
		}
		
		public void WorkExperience(String WorkExperience)
		{
			WorkExp.clear();
			WorkExp.sendKeys(WorkExperience);
		}
		
		public DashboardPage SaveSkills() throws InterruptedException
		{
			SaveSkills.click();
			Thread.sleep(2000);
			Dashboard.click();
			return new DashboardPage();
		}
		
	
}
