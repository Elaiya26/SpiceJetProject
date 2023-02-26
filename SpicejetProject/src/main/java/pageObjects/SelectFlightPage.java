package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SelectFlightPage extends Utility{
public  WebDriver driver;
	
	public SelectFlightPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
      }
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement Continue;
	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement fiandmidname;
	
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement contactnumber;
	
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement emailid;
	
	@FindBy (xpath="//input[@data-testid='city-inputbox-contact-details']")
	WebElement townorcity;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[5]")
	WebElement primarypassenger;
	
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement continuebutton;
	
	@FindBy(xpath="(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement continuepaybutton;
	
	public void Continue() {
		Continue.click();
	}
	
	public void FandMname(String FirstName) {
		fiandmidname.sendKeys(FirstName);                         
	}
	
	public void LastName(String Lastname) {
		lastname.sendKeys(Lastname);
	}
	
	public void ContactNumber(String MobileNumber) {
		contactnumber.sendKeys(MobileNumber);
	}
	
	public void EmaiId(String Email) {
		emailid.sendKeys(Email);
	}
	
	public void TownorCity(String City) {
		townorcity.sendKeys(City);
	}
	
	public void CheckPassenger() {
		primarypassenger.click();
	}
	
	public void ContinueButton() {
		continuebutton.click();
	}
	
	public void ContinueButton2() {
		continuepaybutton.click();
	}

}
