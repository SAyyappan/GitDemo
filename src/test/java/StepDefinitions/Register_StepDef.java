package StepDefinitions;

import org.junit.Assert;

import Pages.LoginPage;
import Pages.RegisterPage;
import Util.Decryptor;
import Util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_StepDef extends TestBase{
	
	RegisterPage registerPage;
	LoginPage loginPage;
	Decryptor decrypt;
	
	@Given("^Open the browser and enter url$")
	public void open_the_browser_and_enter_url() {
		
		TestBase.initialization();
		
	}

	@When("^click on register link$")
	public void click_on_register_link() throws InterruptedException {
		registerPage = new RegisterPage();
		
		registerPage.CookiesAcceptClick();
		registerPage.RegisterLinkCilck();

	}

	@Then("^New page is dispalyed for registration$")
	public void new_page_is_dispalyed_for_registration() {
		
		Assert.assertEquals(driver.getTitle(),"Sharetask: Getting work done");

	}

	@Then("^Enter the details of user$")
	public void enter_the_details_of_user() {
		decrypt = new Decryptor();		
		registerPage.SendFnameLname(excelData.First_Name("First_Name"), excelData.Last_Name("Last_Name"));
		registerPage.getSelectedCountry();
		//registerPage.SendEmailPass(prop.getProperty("Email_Address"), decrypt.decryption("pass"));
		registerPage.SendEmailPass(excelData.Email_Address("Email_Address"), decrypt.decryption("pass"));
		
		
	}

	@Then("^Click on Register button$")
	public void click_on_Register_button() {
		
		registerPage.RegisterButtonCilck();

	}

	@When("^Successfull registration message displayed$")
	public void successfull_registration_message_displayed() {
		
		
	}

	@Then("^Click on OK button$")
	public void click_on_OK_button() {
		

	}

	@Then("^user should be able to see HomePage$")
	public void user_should_be_able_to_see_HomePage() {
		Assert.assertEquals(driver.getTitle(),"Sharetask: Getting work done");

	}
	@Then("^click on logout button$")
	public void click_on_logout_button() {
		loginPage = new LoginPage();
		
		loginPage.ToggleMenuClick();
		loginPage.LogoutLinkClick();
		
	}
	
	@Then("^Close the browser window$")
	public void close_the_browser_window() {
		driver.quit();
	}


}
