package StepDefinitions;

import java.awt.AWTException;

import org.junit.Assert;
import Pages.LoginPage;
import Util.TestBase;
import Util.Decryptor;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDef extends TestBase{
	
	LoginPage loginPage;
	Decryptor decrypt;	
	
	
	@Given("^Open chrome browser$")
	public void open_chrome_browser() {
		
		TestBase.initialization();
		
	}
	
	@When("^click on LOGIN link$")
	public void click_on_LOGIN_link() throws InterruptedException {
		loginPage = new LoginPage();
		
		//loginPage.CookiesAcceptClick();
		loginPage.LoginLinkCilck();
		
	}

	@Then("^New login page should be displayed$")
	public void new_login_page_should_be_displayed() {
		
		Assert.assertEquals(driver.getTitle(),"Sharetask: Getting work done");
	}
	
	@Given("^Enter username and password$")
	public void enter_username_and_password(){
		decrypt = new Decryptor();
		loginPage.SendUsernamePassword(excelData.username("username"), decrypt.decryption("pass"));
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws InterruptedException, AWTException {
		loginPage.LoginButtonCilck();
		
	}

	@Then("^User should face home page$")
	public void user_should_face_home_page() throws InterruptedException {
		Assert.assertEquals(driver.getTitle(),"Sharetask: Getting work done");
	}
	
	@Then("^click on logout$")
	public void click_on_logout() {
	  loginPage.ToggleMenuClick();
	  loginPage.LogoutLinkClick();
		
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}