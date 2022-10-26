package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.CheckoutPage;
import pom.ShoppingCartPage;

public class CheckoutPageTest extends BaseTest{
	

	@Test
	public void menuBtn() {
	CheckoutPage checkoutPage = new CheckoutPage(driver);
	
	checkoutPage.menuButton();
	
	}
	
	@Test
	public void appLogo() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		
		checkoutPage.appLogo();
	
	}
	
	
	@Test
	public void checkoutForm() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		
		checkoutPage.checkoutForm();
	
	}
	
	@Parameters({"validFirstName","validLastName","validZipCode"})
	@Test
	public void validInformation(String validFirstName ,String validLastName ,String validZipCode) {
		
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.validCheckoutInfo(validFirstName,validLastName,validZipCode);
		
	}
	
	
	

}
