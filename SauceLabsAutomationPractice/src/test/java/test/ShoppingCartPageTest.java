package test;

import org.testng.annotations.Test;

import pom.ShoppingCartPage;

public class ShoppingCartPageTest extends BaseTest{
	
	
	
	
	
	@Test
	public void menuBtn() {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
	
	shoppingCartPage.menuButton();
	
	}
	
	@Test
	public void appLogo() {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
	
	shoppingCartPage.appLogo();
	
	}
	
	@Test
	public void title() {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
	
	shoppingCartPage.title();
	
	}
	
	@Test
	public void checkoutButton() {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
	
	shoppingCartPage.checkoutButton();
	}
	

}
