package test;

import org.testng.annotations.Test;

import pom.ShoppingCartPage;

public class ShoppingCartPageTest extends BaseTest{
	
	
	
	@Test
	public void tc25_title() {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
	
	shoppingCartPage.title();
	
	}
	
	@Test
	public void tc26_appLogo() {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
	
	shoppingCartPage.appLogo();
	
	}
	
	
	@Test
	public void tc27_menuBtn() {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
	
	shoppingCartPage.menuButton();
	
	}
	
	

	
	@Test
	public void tc28_checkoutButton() {
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
	
	shoppingCartPage.checkoutButton();
	}
	

}
