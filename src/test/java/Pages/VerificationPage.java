package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Util.TestBase;

public class VerificationPage extends TestBase{
	
	//Page Factory
	
	//**************************Add Mobile Number****************************
	@FindBy(css = ".right_pannel h1")
	WebElement VerficTitle;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/ul/li[1]/div/a")
	WebElement AddMobile;
	
	@FindBy(id = "Cell")
	WebElement CellNumber;
	
	@FindBy(xpath = "//button[@onclick='send_otp();']")
	WebElement SendOTPButton;
	
	@FindBy(xpath = "//div[@id='Verification']/div/div/div[1]/button[@class='close']")
	WebElement VerMsgClose;
	
	@FindBy(id = "OTP")
	WebElement EnterOTP;
	
	@FindBy(xpath = "//button[@onclick='verify_otp();']")
	WebElement VerifyPhoneButton;
	
	@FindBy(xpath = "//div[@id='Verification']/div/div/div[2]/h1")
	WebElement PhoneVerSuccMsg;
	
	//@FindBy(xpath = "//*[@id=\"Verification\"]/div/div/div[1]/button")
	//WebElement VerPhoneMsg;
	//**********************************************************************
	
	//**************************Add Credit card*****************************	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/ul/li[2]/div/a")
	WebElement AddCreditCard;
	
	@FindBy(id = "CCNumber")
	WebElement CreditCardNumber;
	
	@FindBy(id = "ExpMonth")
	WebElement ExpMonth;
	
	@FindBy(id = "ExpYear")
	WebElement ExpYear;
	
	@FindBy(id = "CVC")
	WebElement CVC;
	
	@FindBy(id = "add_creditcard")
	WebElement AddCreditCardButton;
	
	@FindBy(xpath = "//*[@id=\"ccsucc\"]")
	WebElement CCSaveSuccMsg;
	//**********************************************************************
	
	//**************************Receive Payment*****************************	
	@FindBy(xpath = "//a[text()='Receive Payment']")
	WebElement ReceivePayment;
	
	@FindBy(xpath = "//*[@id=\"autocomplete\"]")
	WebElement autocomplete;
	
	@FindBy(id = "locality")
	WebElement Locality;
	
	@FindBy(id = "postal_code")
	WebElement PostCode;
	
	@FindBy(id = "administrative_area_level_1")
	WebElement State;
	
	@FindBy(id = "add_billingaddress")
	WebElement SaveBillAddress;
	
	@FindBy(id = "AccName")
	WebElement AccName;
	
	@FindBy(id = "AccNumber")
	WebElement AccNumber;
	
	@FindBy(id = "AccType")
	WebElement AccType;
	
	@FindBy(id = "DateofBirth")
	WebElement DateOfBirth;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	WebElement Year;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	WebElement Month;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")
	WebElement Date;
	
	@FindBy(id = "Line1")
	WebElement Line1;
	
	@FindBy(id = "City")
	WebElement City;
	
	@FindBy(id = "PostalCode")
	WebElement PostalCode;
	
	@FindBy(id = "administrative_area_level_1")
	WebElement StateName;
	
	
	@FindBy(id = "PersonalId")
	WebElement PersonalId;
	
	@FindBy(id = "TaxId")
	WebElement TaxId;
	
	@FindBy(id = "TOSAcceptance")
	WebElement TOSAcceptance;
	
	@FindBy(xpath = "//input[@id='uploaded-file']")
	WebElement UploadFile;
	
	@FindBy(id = "add_bankdetails")
	WebElement AddBankDetails;
	
	@FindBy(id = "bdsucc")
	WebElement BankDetailSaveMsg;
	
	@FindBy(id = "bderror")
	WebElement BankDetailsErrorMsg;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[3]/ul/li[2]/div/div/a")
	WebElement AddLinkedIn;
	
	@FindBy(id = "LinkedinVerified")
	WebElement LinkedinVerified;
	
	@FindBy(xpath = "//input[@onclick='socialLinkedin();']")
	WebElement SubmitLinkedInButton;
	
	@FindBy(id = "regsuccLinkedin")
	WebElement LinkedInSuccMsg;
	
	@FindBy(xpath = "//*[@id=\"social-linkedin\"]/div/div/div[1]/button")
	WebElement LinkedInMsgClose;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[1]/nav/ul/li[1]/a")
	WebElement Dashboard;
	
	//**********************************************************************	
	
	//Initializing the page objects -->
	public VerificationPage()
	{
		PageFactory.initElements(driver, this);
			
	}
	
	//Actions like sendkeys and click on buttons -->
	
	public String VerficTitle()
	{
		return VerficTitle.getText();		
	}
	
	public void AddMobile()
	{
		AddMobile.click();
	}
	
	public void CellNumber(String MobileNo)
	{
		CellNumber.clear();
		System.out.println(MobileNo);

		CellNumber.sendKeys("465105521");
	}
	
	public void SendOTPBtnClick()
	{
		SendOTPButton.click();
	}
	
	public void VerMsgClose() throws InterruptedException
	{
		Thread.sleep(2000);
		VerMsgClose.click();
	}
	
	public void EnterOTP(String OTP) throws InterruptedException
	{		
		EnterOTP.clear();
		//Thread.sleep(20000);
		EnterOTP.sendKeys(OTP);
		Thread.sleep(1000);
	}
	
	public void VerifyPhoneButton()
	{
		VerifyPhoneButton.click();
	}
	
	public void PhoneVerSuccMsg() throws InterruptedException
	{
		
		Thread.sleep(2000);
		String msg = PhoneVerSuccMsg.getText();
		Assert.assertEquals("Phone Verification Error",msg);
		
		VerMsgClose.click();
		
		driver.navigate().back();
	}
	
	//**********************Add credit card details*********************
	public void AddCreditCard()
	{
		AddCreditCard.click();
	}
	
	public void CreditCardNumber(String Credit_Card_Number)
	{
		CreditCardNumber.clear();
		CreditCardNumber.sendKeys(Credit_Card_Number);
	}
	
	public void ExpMonth(String Exp_Month)
	{
		ExpMonth.clear();
		ExpMonth.sendKeys(Exp_Month);
	}
	
	public void ExpYear(String Exp_Year)
	{
		ExpYear.clear();
		ExpYear.sendKeys(Exp_Year);
	}
	
	public void CVC(String CVCNo)
	{
		CVC.clear();
		CVC.sendKeys(CVCNo);
	}
	
	public void AddCreditCardButton()
	{
		AddCreditCardButton.click();
	}
	
	public void CCSaveSuccMsg() throws InterruptedException
	{
		Thread.sleep(8000);
		String CCmsg = CCSaveSuccMsg.getText();
		Assert.assertEquals("Credit card successfully saved.",CCmsg);
	}
	
	//**********************Receive payments*********************
	
	public void ReceivePayment()
	{
		ReceivePayment.click();
	}
	
	public void Locality(String city)
	{
		autocomplete.click();
		Locality.clear();
		Locality.sendKeys(city);
	}
	
	public void PostalCode(String Post_Code)
	{
		PostalCode.clear();
		PostalCode.sendKeys(Post_Code);
	}
	
	public void StateName(String State)
	{
		StateName.clear();
		StateName.sendKeys(State);
	}
	
	public void SaveBillAddress() throws InterruptedException
	{
		Thread.sleep(1000);
		SaveBillAddress.click();
	}
	
	public void AccName(String Acc_Name) throws InterruptedException
	{
		Thread.sleep(1000);
		AccName.clear();
		AccName.sendKeys(Acc_Name);
	}
	
	public void AccNumber(String IBAN)
	{
		AccNumber.clear();
		AccNumber.sendKeys(IBAN);
	}
	
	public void AccType(String Acc_Type)
	{
		Select select;
		select = new Select(AccType);
		select.selectByVisibleText(Acc_Type);
	}
	
	public void DateOfBirth()
	{
		DateOfBirth.click();
		
		Select selectYY;
		selectYY = new Select(Year);
		selectYY.selectByVisibleText("1988");
		
		Select selectMM;
		selectMM = new Select(Month);
		selectMM.selectByVisibleText("Jul");
		
		Date.click();
	}
	
	public void Address(String Address_First_Line, String city, String Post_Code)
	{
		Line1.clear();
		Line1.sendKeys(Address_First_Line);
		City.clear();
		City.sendKeys(city);
		PostalCode.clear();
		PostalCode.sendKeys(Post_Code);
		
	}
	
	public void PersonalId_TaxId(String National_Reg_No, String VAT_TVA_No)
	{
		PersonalId.clear();
		PersonalId.sendKeys(National_Reg_No);
		TaxId.clear();
		TaxId.sendKeys(VAT_TVA_No);
		
	}
	
	public void TOSAcceptance() throws InterruptedException
	{
		Thread.sleep(1000);
		if(TOSAcceptance.isSelected())
		{
			System.out.println("Terms Accepted");
		}
		else
		{
		TOSAcceptance.click();
		}
	}
	
	public void UploadFile() throws InterruptedException, AWTException
	{
		UploadFile.click();
		Thread.sleep(2000);
		
		StringSelection ss1 = new StringSelection("C:\\BWC\\ShareTask\\Portfolio.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		
		//native key strokes for CTRL, V and ENTER keys
		Robot robot2 = new Robot();

		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);		
	
	}
	
	public void AddBankDetails() throws InterruptedException 
	{
		AddBankDetails.click();
		Thread.sleep(17000);
		String bdmsg = BankDetailSaveMsg.getText();
		String bderrmsg = BankDetailsErrorMsg.getText();
		if(bderrmsg.length() > 0)
		{
			
			Assert.assertEquals("Please upload your legal document.",bderrmsg);
			
		/*	Assert.assertEquals("You cannot change `legal_entity[verification][document]` "
					+ "via API if an account is verified. Please contact support@stripe.com "
					+ "if you need to change the legal entity "
					+ "information associated with this account.",bderrmsg); */
		}
		else
		{
			Assert.assertEquals("Bank details successfully saved.",bdmsg);
		}
		driver.navigate().back();
	}
	
	public DashboardPage AddLinkedIn(String LinkedIn) throws InterruptedException
	{
		AddLinkedIn.click();	
		Thread.sleep(1000);
		LinkedinVerified.clear();
		LinkedinVerified.sendKeys(LinkedIn);
		SubmitLinkedInButton.click();
		
		/*String Lkmsg = LinkedInSuccMsg.getText();
		Assert.assertEquals("Update Successful",Lkmsg);
		
		LinkedInMsgClose.click();*/
		Thread.sleep(5000);
		Dashboard.click();
		return new DashboardPage();
		
	}
	
	
}
