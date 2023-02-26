package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class RoundTripPage extends Utility {
	public  WebDriver driver;
    public RoundTripPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
      }
	@FindBy(xpath="//div[contains(text(),'round trip')]")
	WebElement roundtripbutton;
	
	@FindBy(xpath="//div[contains(text(),'From')]")
	WebElement boardingfrom;
	
	@FindBy(xpath="//div[contains(text(),'To')]")
	WebElement destination;
	
	@FindBy(xpath="//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")
	WebElement depaturedate;

	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")
	WebElement returndate;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement searchflight;
	
	public void RoundTripButton() {
		roundtripbutton.click();
	}
	public void Onboarding(String Boarding) {
		boardingfrom.sendKeys(Boarding);
	}
	public void DestinationTo(String Destination) {
		destination.sendKeys(Destination);
	}
	public void DepatureDate() {
		depaturedate.click();
	}
	public void ReturnDate() {
		returndate.click();
	}
	public void SearchFlight() {
		searchflight.click();
	}

}
