package StepDefinitions;

import Util.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DryTest_StepDef extends TestBase {
	
	@Given("^Inside Nav path Given$")
	public void inside_Nav_path_Given() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Into Given");
	}

	@When("^Inside Nav path When$")
	public void inside_Nav_path_When() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Into When");
	}

	@Then("^Inside Nav path Then$")
	public void inside_Nav_path_Then() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Into Then");
	}
	
	/*
	@Given("^Login page is displayed$")
	public void login_page_is_displayed() throws InterruptedException {

		TestBase.initialization();

		loginPage = new LoginPage();
		loginPage.CookiesAcceptClick();
		loginPage.LoginLinkCilck();
	}
    */
	

}
