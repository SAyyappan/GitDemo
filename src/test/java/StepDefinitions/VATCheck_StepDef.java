/*package StepDefinitions;

import java.awt.AWTException;

import org.junit.Assert;

import Pages.AcceptOfferPage;
import Pages.BidTaskPage;
//import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.PostTaskPage;
import Util.Decryptor;
import Util.ExcelData;
import Util.TestBase;
import cucumber.api.java.en.Given;

public class VATCheck_StepDef extends TestBase{
	
	
	LoginPage loginPage;
	Decryptor decrypt;
	//DashboardPage dashboardPage;
	PostTaskPage postTaskPage;
	BidTaskPage bidTaskPage;
	AcceptOfferPage acceptOfferPage;
	ExcelData excelData;
	
	
	@Given("^Open browser and  enter url$")
	public void open_browser_and_enter_url() {	
		
		//int Counter = 2;		
		//excelData.setExcelCounter(Counter);
		
		TestBase.initialization();
		
	}

	@Given("^perform VAT calculations$")
	public void perform_VAT_calculations() throws InterruptedException, AWTException {
		loginPage = new LoginPage();
		excelData = new ExcelData();	
		
		//for(int Counter = 2; Counter < 4; Counter++) {	
		//excelData.setExcelCounter(Counter);
		
		//*******Click on the login link
		
		loginPage.CookiesAcceptClick();
		loginPage.LoginLinkCilck();
		//******************************
		
		//*******Client Login***********
		decrypt = new Decryptor();
		loginPage.SendUsernamePassword(excelData.Client_Email("Client_Email"),decrypt.decryption("pass"));			
		loginPage.LoginButtonCilck();
		//*******************************
		
		//*******post a task*************
		//dashboardPage.PostTask();
		postTaskPage = new PostTaskPage();
		
		postTaskPage.postTaskButtonclick();
		
		String PostTaskTitle = postTaskPage.PostTaskPageTitle();
		Assert.assertEquals("Post a Task",PostTaskTitle);
		
		postTaskPage.Tasktitle();
		postTaskPage.Describeyourtask();
		postTaskPage.AddPicture();
		postTaskPage.TaskSkills();		
		postTaskPage.FirstContinueClick();
		
		Thread.sleep(2000);
		
		postTaskPage.Tasklocation();
		postTaskPage.ChooseDate();
		postTaskPage.DatePicker();
		postTaskPage.SecondContinueClick();
		
		Thread.sleep(2000);
		
		postTaskPage.NoofWorkers();
		postTaskPage.HourlyRateChoose();
		postTaskPage.SetHourlyRate(excelData.Client_Budget("Client_Budget"));
		postTaskPage.GetQuotesNowButton();
		
		excelData.setActual_Client_Budget(postTaskPage.sendClientBudget("Actual_Client_Budget"));
		excelData.setActual_PlatformFee(postTaskPage.sendClientBudgetPlatformFee("Actual_PlatformFee"));
		excelData.setActual_VAT(postTaskPage.sendClientBudgetVAT("Actual_VAT"));
		excelData.setActual_SP_NetIncome(postTaskPage.sendClientBudgetSPIncome("Actual_SP_NetIncome"));
				
		postTaskPage.DoneButton();	
		//*******************************
		
		//****Client Logout**************
		Thread.sleep(4000);
		loginPage.ToggleMenuClick();
		loginPage.LogoutLinkClick();
		//****Client Logout**************
		
		
		
		//*************SP Login***********
		loginPage.LoginLinkCilck();
		loginPage.SendUsernamePassword(excelData.SP_Email("SP_Email"), decrypt.decryption("pass"));			
		loginPage.LoginButtonCilck();
		Thread.sleep(1000);
		//********************************
		
		//*************SP Bid*************
		bidTaskPage = new BidTaskPage();
		
		bidTaskPage.MakeAnOffer();
		bidTaskPage.WorkerBudget(excelData.SP_OfferAmount("SP_OfferAmount"));
		bidTaskPage.ReasonDes();
		bidTaskPage.Nextbutton();
		
		excelData.setActual_offerTaskBudget(bidTaskPage.sendActual_offerTaskBudget("Actual_offerTaskBudget"));
		excelData.setActual_OfferAmount(bidTaskPage.sendActual_OfferAmount("Actual_OfferAmount"));
		excelData.setActual_SP_VAT(bidTaskPage.sendActual_SP_VAT("Actual_SP_VAT"));
		excelData.setActual_SP_WillGet(bidTaskPage.sendActual_SP_WillGet("Actual_SP_WillGet"));
		
		bidTaskPage.SPOfferDone();
		//********************************
		
		//****SP Logout**************
		Thread.sleep(4000);
		loginPage.ToggleMenuClick();
		loginPage.LogoutLinkClick();
		//****SP Logout**************
			
			
				
		//*******Client Login***********
		loginPage.LoginLinkCilck();
		loginPage.SendUsernamePassword(excelData.Client_Email("Client_Email"), decrypt.decryption("pass"));			
		loginPage.LoginButtonCilck();
		Thread.sleep(1000);
		//*******************************
		
		//*******Client accept offer*****
		acceptOfferPage = new AcceptOfferPage();
		
		loginPage.ToggleMenuClick();
		loginPage.NotificationsClick();
		
		acceptOfferPage.FirstOfferClick();
		acceptOfferPage.ReviewOfferClick();
		Thread.sleep(1000);
		acceptOfferPage.AccpetOfferClick();
		
		excelData.setActual_Bid_Amount(acceptOfferPage.sendActual_Bid_Amount("Actual_Bid_Amount"));
		excelData.setActual_Platform_Fees(acceptOfferPage.sendActual_Platform_Fees("Actual_Platform_Fees"));
		excelData.setActual_SP_offer_amount(acceptOfferPage.sendActual_SP_offer_amount("Actual_SP_offer_amount"));
		excelData.setActaul_Final_VAT(acceptOfferPage.sendActaul_Final_VAT("Actaul_Final_VAT"));
		excelData.setActual_Payable_Amount(acceptOfferPage.sendActual_Payable_Amount("Actual_Payable_Amount"));
		
		acceptOfferPage.AcceptandAssignClick();
		
		//****Client Logout**************
		Thread.sleep(7000);
		loginPage.ToggleMenuClick();
		loginPage.LogoutLinkClick();
		//****Client Logout**************
		}
		driver.quit();
	}

}
*/