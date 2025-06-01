package qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest{
	
	ElementFetch ele=new ElementFetch();
	HomePageEvents homePage=new HomePageEvents();
	LoginPageEvents loginPage=new LoginPageEvents();
	
	@Test
	public void methodForEnteringCredentials() {
		homePage.signInButton();
		loginPage.verifyLoginPageIsLoaded();
		loginPage.enterCredentials();
		Assert.fail("This test is intentionally failed");
	}
}
