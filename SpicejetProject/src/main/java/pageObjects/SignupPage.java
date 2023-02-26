package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SignupPage extends Utility{
	
	public  WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
      }
	  @FindBy (xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
	  WebElement signup;
	  
	  @FindBy (xpath="//option[@value='MR']")
	  WebElement title;
	  

	  @FindBy (xpath="//input[@id='first_name']")
	  WebElement firstname;
	  
	  @FindBy (xpath="//input[@id='last_name']")
	  WebElement lastname;
	
	  @FindBy (xpath="//select[@class='form-control form-select']")
	  WebElement country;
	
	  @FindBy (xpath="//input[@id='dobDate']")
	  WebElement dateofbirth;
	  
	  @FindBy (xpath="//input[@placeholder='+91 01234 56789']")
	  WebElement mobilenumber;
	  
	  @FindBy (xpath="//input[@id='email_id']")
	  WebElement email;
	  
	  @FindBy (xpath="//input[@id='new-password']")
	  WebElement password;
	  
	  @FindBy (xpath="//input[@id='c-password']")
	  WebElement confpassword;
	  
	  public void SignUp() {
		  signup.click();
	  }
	  public void SelectTitle() {
		  title.click();
	  }
	  public void Firstname(String FirstName) {
		  firstname.sendKeys(FirstName);
	  }
	  public void Lastname(String LastName) {
		  lastname.sendKeys(LastName);
	  }
	  public void EnterCountry(String Country) {
		  country.sendKeys(Country);
	  }
	  public void DateOfBirth (String DOB){
		 dateofbirth.sendKeys(DOB);
	  }
	  public void Mobilenumber(String MobileNumber) {
		  mobilenumber.sendKeys(MobileNumber);
	  }
	  public void Emailid(String Email) {
		  email.sendKeys(Email);
	  }
	  public void EnterPassword(String Password) {
		  password.sendKeys(Password);
	  }
	  public void ConfirmPass(String Confirmpassword) {
		  confpassword.sendKeys(Confirmpassword);
	  }

}
