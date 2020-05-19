package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.TestBase;

public class AcceptOfferPage extends TestBase{
	
	//Page Factory
	
		@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/ul/li[1]/span[1]/a[2]")
		WebElement FirstOffer;
		
		@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/a")
		WebElement ReviewOffer;
		
		@FindBy(css = "a[class='accept']")
		WebElement AcceptOfferButton;
		
		@FindBy(xpath = "//*[@id=\"fund_popup92\"]/div/div/div[2]/div[3]/div[3]/h2")
		WebElement Actual_Bid_Amount_Data;
		
		@FindBy(xpath = "//*[@id=\"fund_popup92\"]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[1]/td")
		WebElement Actual_Platform_Fees_Data;
		
		@FindBy(xpath = "//*[@id=\"fund_popup92\"]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[2]/td")
		WebElement Actual_SP_offer_amount_Data;
		
		@FindBy(xpath = "//*[@id=\"fund_popup92\"]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[3]/td")
		WebElement Actaul_Final_VAT_Data;
		
		@FindBy(xpath = "//*[@id=\"fund_popup92\"]/div/div/div[2]/div[3]/div[4]/table/tbody/tr[4]/td/strong")
		WebElement Actual_Payable_Amount_Data;		
	
		
		@FindBy(css = "input[type='button'][value='Accept and assign']")
		WebElement AcceptandAssign;
		
		
		//Initializing the page objects -->
		public AcceptOfferPage()
		{
			PageFactory.initElements(driver, this);
			
		}
		
		//Main methods to click on elements or sendkeys -->
		
		public void FirstOfferClick()
		{
			FirstOffer.click();
		}
		
		public void ReviewOfferClick()
		{
			ReviewOffer.click();
		}
		
		public void AccpetOfferClick()
		{
			AcceptOfferButton.click();
		}
		
		public String sendActual_Bid_Amount(String Actual_Bid_Amount)
		{
			Actual_Bid_Amount = Actual_Bid_Amount_Data.getText();
			System.out.println("Actual_Bid_Amount: "+Actual_Bid_Amount);
			return Actual_Bid_Amount;
		}
		
		public String sendActual_Platform_Fees(String Actual_Platform_Fees)
		{
			Actual_Platform_Fees = Actual_Platform_Fees_Data.getText();
			System.out.println("Actual_Platform_Fees: "+Actual_Platform_Fees);
			return Actual_Platform_Fees;
		}
		
		public String sendActual_SP_offer_amount(String Actual_SP_offer_amount)
		{
			Actual_SP_offer_amount = Actual_SP_offer_amount_Data.getText();
			System.out.println("Actual_SP_offer_amount: "+Actual_SP_offer_amount);
			return Actual_SP_offer_amount;
		}
		
		public String sendActaul_Final_VAT(String Actaul_Final_VAT)
		{
			Actaul_Final_VAT = Actaul_Final_VAT_Data.getText();
			System.out.println("Actaul_Final_VAT: "+Actaul_Final_VAT);
			return Actaul_Final_VAT;
		}
		
		public String sendActual_Payable_Amount(String Actual_Payable_Amount)
		{
			Actual_Payable_Amount = Actual_Payable_Amount_Data.getText();
			System.out.println("Actual_Payable_Amount: "+Actual_Payable_Amount);
			return Actual_Payable_Amount;
		}
		
		public void AcceptandAssignClick()
		{
			AcceptandAssign.click();
		}

}
