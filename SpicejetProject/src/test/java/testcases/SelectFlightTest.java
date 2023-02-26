package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.OnewayTripPage;
import pageObjects.SelectFlightPage;

public class SelectFlightTest extends BaseClass{
	
	@Test
	public void BookFlight() {
		
        OnewayTripPage oneway = new OnewayTripPage(driver);
		
        oneway.OneWay();
		oneway.Onboarding("BLR");
		oneway.DestinationTo("CJB");
		oneway.DepatureDate();
		oneway.ReturnDate();
		oneway.SearchFlight();
		
		SelectFlightPage selectflight = new SelectFlightPage(driver);
		selectflight.Continue();
		selectflight.FandMname(prop.getProperty("FirstName"));
		selectflight.LastName(prop.getProperty("LastName"));
		selectflight.ContactNumber(prop.getProperty("MobileNumber"));
		selectflight.EmaiId(prop.getProperty("Email"));
		selectflight.TownorCity(prop.getProperty("City"));
		selectflight.CheckPassenger();
		selectflight.ContinueButton();
		selectflight.ContinueButton2();
	}

}
