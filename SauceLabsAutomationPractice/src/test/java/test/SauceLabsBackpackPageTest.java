package test;

import org.testng.annotations.Test;

import pom.SauceLabsBackpackPage;

public class SauceLabsBackpackPageTest extends BaseTest{
	
	@Test
	public void verifyText() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.verifyText();
	}
	
	@Test
	public void verifyDescription() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.verifyDescription();
		
	}
	
	@Test
	public void itemPrice() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.itemPrice();
	}

	
	@Test
	public void addToCart() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.addToCart();
	}
	

	@Test
	public void z_linkedIn() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.linkedIn();
	}
	
	@Test
	public void z_facebook() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.facebook();
	}
	

	@Test
	public void z_twitter() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.twitter();
	}
	

	@Test
	public void remove() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.remove();
	}
	
	@Test
	public void z_clickCartLink() {
		
		SauceLabsBackpackPage sauceLabs = new SauceLabsBackpackPage(driver);
		sauceLabs.clickCartLink();
	}
	
}
