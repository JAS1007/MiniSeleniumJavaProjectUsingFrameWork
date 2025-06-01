package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
     
	ElementFetch ele=new ElementFetch();
	
	public void verifyLoginPageIsLoaded() {
		Assert.assertTrue(ele.getWebElement("XPATH", LoginPageElements.logInButton).isDisplayed(), "Element not found");
	}
	
	public void enterCredentials() {
		ele.getWebElement("XPATH", LoginPageElements.emailTextBox).sendKeys("arjun@gmail.com");
		ele.getWebElement("XPATH", LoginPageElements.pwdTextBox).sendKeys("arjun@gmail.com");
	}
}
