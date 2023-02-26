package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.OnewayTripPage;

public class OnewayTripTest extends BaseClass {
	@Test
	public void SearchFlight() {
		
		OnewayTripPage oneway = new OnewayTripPage(driver);
		
		oneway.OneWay();
		oneway.Onboarding(prop.getProperty("From"));
		oneway.DestinationTo(prop.getProperty("To"));
		oneway.DepatureDate();
		oneway.ReturnDate();
		oneway.SearchFlight();
	}

}
