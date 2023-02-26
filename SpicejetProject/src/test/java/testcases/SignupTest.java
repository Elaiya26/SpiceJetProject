package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.SignupPage;

public class SignupTest extends BaseClass{
	
@Test
  public void Signup() {
	
	SignupPage signup = new SignupPage(driver);
	signup.SignUp();
	Switchwindow();
	signup.SelectTitle();
	signup.Firstname(prop.getProperty("FirstName"));
	signup.Lastname(prop.getProperty("LastName"));
	signup.EnterCountry(prop.getProperty("Country"));
	signup.DateOfBirth(prop.getProperty("DOB"));
	signup.Mobilenumber(prop.getProperty("MobileNumber"));
	signup.Emailid(prop.getProperty("Email"));
	signup.EnterPassword(prop.getProperty("Password"));
	signup.ConfirmPass(prop.getProperty("Confirmpassword"));
  }


}
   
