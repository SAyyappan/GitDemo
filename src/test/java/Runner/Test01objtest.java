package Runner;

import Pages.HomePage;
import Pages.LoginPage;
import Util.Decryptor;
import Util.TestBase;
import junit.framework.Assert;

public class Test01objtest extends TestBase {


    public static void main(String[] args) throws InterruptedException {
    	
		
//    	TestBase tb = new TestBase();
//    	System.out.println("trace 02 BEFORE initialization");
    	TestBase.initialization();
		
		LoginPage loginPage = new LoginPage();
		
	//	loginPage.CookiesAcceptClick();
		loginPage.LoginLinkCilck();
		Decryptor decrypt = new Decryptor();
		loginPage.SendUsernamePassword(excelData.username("abc"), decrypt.decryption("abc"));
	//	loginPage.LoginButtonCilck();
		HomePage homePage = new HomePage();
		homePage = loginPage.LoginButtonCilck();
		String HomepageTitle = homePage.HomepageTitle();
		System.out.println(HomepageTitle);
		Assert.assertEquals("HOME SERVICE EXPERTS",HomepageTitle);
		
		
		
       
    }

}