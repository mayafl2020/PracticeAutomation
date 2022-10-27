package test;

import org.testng.annotations.Test;

import pom.SauceLabsBackpackPage;

public class SauceLabsBackpackPageTest extends BaseTest{
	
	@Test
	public void tc16_verifyText() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.verifyText();
	}
	
	@Test
	public void tc17_verifyDescription() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.verifyDescription();
		
	}
	
	@Test
	public void tc18_itemPrice() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.itemPrice();
	}

	
	@Test
	public void tc19_addToCart() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.addToCart();
	}
	
	@Test
	public void tc20_remove() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.remove();
	}
	

	@Test
	public void tc21_linkedIn() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.linkedIn();
	}
	
	@Test
	public void tc22_facebook() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.facebook();
	}
	

	@Test
	public void tc23_twitter() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.twitter();
	}
	

	
	
	@Test
	public void tc24_clickCartLink() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.clickCartLink();
	}
	
}
