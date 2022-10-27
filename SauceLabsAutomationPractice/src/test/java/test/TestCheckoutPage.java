package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.CheckoutPage;
import pom.ShoppingCartPage;

public class TestCheckoutPage extends BaseTest{
	
	@Test
	public void tc29_appLogo() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		
		checkoutPage.appLogo();
	
	}
	

	@Test
	public void tc30_menuBtn() {
	CheckoutPage checkoutPage = new CheckoutPage(driver);
	
	checkoutPage.menuButton();
	
	}
	

	
	
	@Test
	public void tc31_checkoutForm() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		
		checkoutPage.checkoutForm();
	
	}
	
	@Parameters({"validFirstName","validLastName","validZipCode"})
	@Test
	public void tc32_validInformation(String validFirstName ,String validLastName ,String validZipCode) {
		
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.validCheckoutInfo(validFirstName,validLastName,validZipCode);
		
	}
	
	
	

}
