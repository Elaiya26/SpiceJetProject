package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class ValidateBookingPage extends Utility {
	public WebDriver driver;

	public ValidateBookingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[contains(text(),'check-in')])[1]")
	WebElement checkin;
	
	@FindBy(xpath = "//div[contains(text(),'flight status')]")
	WebElement Flightstatus;

	@FindBy(xpath = "//div[contains(text(),'manage booking')]")
	WebElement ManageBooking;

	public boolean ValidateCheckIn() {

		return checkin.isDisplayed();
	}

	public boolean ValidateFlightStatus() {

		return Flightstatus.isDisplayed();
	}

	public boolean ValidateManageBooking() {

		return ManageBooking.isDisplayed();
	}

}
