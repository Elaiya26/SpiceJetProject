package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.ValidateBookingPage;

public class ValidateBookingTest extends BaseClass {
	
	@Test(priority=1)
	public void ValidationforCheckin() {
		ValidateBookingPage validate =new ValidateBookingPage(driver);
		Assert.assertTrue(validate.ValidateCheckIn());
		
	}
	@Test(priority=2)
	public void ValidationforFlightStatus() {
		ValidateBookingPage validate =new ValidateBookingPage(driver);
		Assert.assertTrue(validate.ValidateFlightStatus());
	}
	@Test(priority=3)
	public void ValidationforManagebooking() {
		ValidateBookingPage validate =new ValidateBookingPage(driver);
		Assert.assertTrue(validate.ValidateManageBooking());
	}
	

}
