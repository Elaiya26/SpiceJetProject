package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test(priority=1)
	public void LoginwithValidCredentails() {
		
		LoginPage login = new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.PassWord(prop.getProperty("Password"));
		login.LoginButton();
		
	}
	@Test(priority=2)
	public void LoginwithInvalidCredentials() {
		
		LoginPage login = new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.invaliPassword(prop.getProperty("InvalidPass"));
		login.LoginButton();
	}

}
