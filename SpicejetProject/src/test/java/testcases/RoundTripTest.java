package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.RoundTripPage;

public class RoundTripTest extends BaseClass{
	@Test
	public void SearchFlight() {
		
		RoundTripPage round = new RoundTripPage(driver);
		
		round.RoundTripButton();
		round.Onboarding(prop.getProperty("From"));
		round.DestinationTo(prop.getProperty("To"));
		round.DepatureDate();
		round.ReturnDate();
		round.SearchFlight();
	}

}
