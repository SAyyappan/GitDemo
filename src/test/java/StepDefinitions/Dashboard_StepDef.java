package StepDefinitions;

import java.awt.AWTException;

import Pages.AcceptOfferPage;
import Pages.AccountPage;
import Pages.BidTaskPage;
import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PaymentPage;
import Pages.PostTaskPage;
import Pages.ProfilePage;
import Pages.SkillsPage;
import Pages.VerificationPage;
import Util.Decryptor;
import Util.ExcelData;
import Util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Dashboard_StepDef extends TestBase{
	
	DashboardPage dashboardPage;
	LoginPage loginPage;
	Decryptor decrypt;
	AccountPage accountPage;
	ProfilePage profilePage;
	SkillsPage skillsPage;
	VerificationPage verificationPage;
	PaymentPage paymentPage;
	PostTaskPage postTaskPage;
	BidTaskPage bidTaskPage;
	AcceptOfferPage acceptOfferPage;
	HomePage homePage;

	@Given("^Login page is displayed$")
	public void login_page_is_displayed() throws InterruptedException {
	
		TestBase.initialization();
		
		loginPage = new LoginPage();
		
	//	loginPage.CookiesAcceptClick();
		loginPage.LoginLinkCilck();
		
	}

	@When("^User logged in into sharetask$")
	public void user_logged_in_into_sharetask() throws InterruptedException, AWTException {
		decrypt = new Decryptor();
		loginPage.SendUsernamePassword(excelData.username("username"), decrypt.decryption("pass"));
	//	loginPage.LoginButtonCilck();
		homePage = new HomePage();
		homePage = loginPage.LoginButtonCilck();
		String HomepageTitle = homePage.HomepageTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("HOME SERVICE EXPERTS",HomepageTitle);

	}

	@Then("^click on Dashboard menu$")
	public void click_on_Dashboard_menu() {
		
		homePage.ToggleMenuClick();
		homePage.DashboardMenuClick();

	}
	
	

	@Then("^Verify Dashboard page is displayed$")
	public void verify_Dashboard_page_is_displayed() {
		dashboardPage = new DashboardPage();
		String DashboardTitle = dashboardPage.DashboardTitle();
		System.out.println(DashboardTitle);
		Assert.assertEquals("Dashboard",DashboardTitle);
		 
	}
	
	@When("^click on Account link$")
	public void click_on_Account_link() {
		dashboardPage.Account();
		accountPage = new AccountPage();
		
	}

	@Then("^Account Page should be displayed$")
	public void account_Page_should_be_displayed() throws InterruptedException, AWTException {
		
		String AccountTitle = accountPage.AccountTitle();
		Assert.assertEquals("Account",AccountTitle);
		System.out.println(AccountTitle);
//		accountPage.UploadImage();
//		accountPage.UploadBanner();		
		accountPage.SendTagLocDOBReg(excelData.Tagline("Tagline"), excelData.Location("Location"), excelData.Birthday("Birthday"), excelData.Registration_VAT_Nr("Registration_VAT_Nr"));
		
		String posttask = excelData.Post_Tasks("Post_Tasks");
		
		if( posttask == "true")
		{
			accountPage.PostTasks();
		}
	
		String runtask = excelData.Run_Tasks("Run_Tasks");
		
		if( runtask == "true")
		{
			accountPage.RunTasks();
		}
		accountPage.SendHourlyDescription(excelData.Hourly_Rate("Hourly_Rate"), excelData.Description("Description"));
		
		dashboardPage = accountPage.SaveProfile();
		
	}

	@When("^click on Profile link$")
	public void click_on_Profile_link() {	
		dashboardPage.Profile();
		profilePage = new ProfilePage();
	
	}

	@Then("^Profile page should be displayed$")
	public void profile_page_should_be_displayed() throws AWTException, InterruptedException {
		
		String ProfileTitle = profilePage.ProfileTitle();
		Assert.assertEquals("Portfolio",ProfileTitle);
		
		profilePage.UploadResume();
		dashboardPage = profilePage.PortfolioImage();
	
	}

	@When("^click on Skills link$")
	public void click_on_Skills_link() {
		dashboardPage.Skills();
		skillsPage = new SkillsPage();
	   
	}

	@Then("^Skills page should be displayed$")
	public void skills_page_should_be_displayed() throws InterruptedException {
		
		String SkillsTitle = skillsPage.SkillsTitle();
		Assert.assertEquals("Skills",SkillsTitle);
		
		skillsPage.Specialities(excelData.Specialities("Specialities"));
		skillsPage.Transportation(excelData.Transportation("Transportation"));
		skillsPage.Languages(excelData.Languages("Languages"));
		skillsPage.Education(excelData.Education("Education"));
		skillsPage.WorkExperience(excelData.WorkExperience("WorkExperience"));
		dashboardPage = skillsPage.SaveSkills();
	 
	}

	@When("^click on Verification link$")
	public void click_on_Verification_link() {		
		dashboardPage.Verification();
		verificationPage = new VerificationPage();
	  
	}

	@Then("^Verification page should be displayed$")
	public void verification_page_should_be_displayed() throws InterruptedException, AWTException {
		
		String VerifyTitle = verificationPage.VerficTitle();
		Assert.assertEquals("Verifications",VerifyTitle);
		
		verificationPage.AddMobile();
		verificationPage.CellNumber(excelData.MobileNo("MobileNo"));
		verificationPage.SendOTPBtnClick();
		verificationPage.VerMsgClose();
		verificationPage.EnterOTP(excelData.EnterOTP("EnterOTP"));
		verificationPage.VerifyPhoneButton();
		verificationPage.PhoneVerSuccMsg();
		
		verificationPage.AddCreditCard();
		verificationPage.CreditCardNumber(excelData.Credit_Card_Number("Credit_Card_Number"));
		verificationPage.ExpMonth(excelData.Exp_Month("Exp_Month"));
		verificationPage.ExpYear(excelData.Exp_Year("Exp_Year"));
		verificationPage.CVC(excelData.CVCNo("CVCNo"));
		verificationPage.AddCreditCardButton();
		verificationPage.CCSaveSuccMsg();
		
		verificationPage.ReceivePayment();
		//verificationPage.Locality(excelData.city("city"));
		//verificationPage.PostalCode(excelData.Post_Code("Post_Code"));
		//verificationPage.StateName(excelData.State("State"));
		verificationPage.SaveBillAddress();
		verificationPage.AccName(excelData.Acc_Name("Acc_Name"));
		verificationPage.AccNumber(excelData.IBAN("IBAN"));
		verificationPage.AccType(excelData.Acc_Type("Acc_Type"));
		verificationPage.DateOfBirth();
		verificationPage.Address(excelData.Address_First_Line("Address_First_Line"), excelData.city("city"), excelData.Post_Code("Post_Code"));
		verificationPage.PersonalId_TaxId(excelData.National_Reg_No("National_Reg_No"), excelData.VAT_TVA_No("VAT_TVA_No"));
		verificationPage.TOSAcceptance();
		//verificationPage.UploadFile();
		verificationPage.AddBankDetails();
		dashboardPage = verificationPage.AddLinkedIn(excelData.LinkedIn("LinkedIn"));
		
	}

	@When("^click on Payment link$")
	public void click_on_Payment_link() {
		dashboardPage.Payment();
		paymentPage = new PaymentPage();
	 
	}

	@Then("^Payment page should be displayed$")
	public void payment_page_should_be_displayed(){
	
		dashboardPage = paymentPage.DashPage();
		
	}
	
	@When("^click on logout button on the dashboardpage$")
	public void click_on_logout_button_on_the_dashboardpage() {
	
	//	  loginPage.ToggleMenuClick();
	//	  loginPage.LogoutLinkClick();
		
		homePage.ToggleMenuClick();
		homePage.LogoutOptionClick();
		  
	}
	
	@Then("^perform VAT calculations$")
	public void perform_VAT_calculations() throws InterruptedException, AWTException {
		loginPage = new LoginPage();
		excelData = new ExcelData();	
		
		//for(int Counter = 2; Counter < 4; Counter++) {	
		//excelData.setExcelCounter(Counter);
		
		//*******Click on the login link
		
	//	loginPage.CookiesAcceptClick();
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

	@When("^Close the current browser session$")
	public void close_the_current_browser_session() {
		
		driver.quit();
	   
	}


}
