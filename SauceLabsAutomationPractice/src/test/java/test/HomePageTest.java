package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pom.HomePage;
import utilities.Common;

public class HomePageTest extends BaseTest{
	

	
	@Test
	public void a_loginButton() {
		
		
		
		HomePage homePage = new HomePage(driver);
		homePage.loginButton();
	
	}
	

	
	@Test
	public void a_loginLogo() {
		
		HomePage homePage = new HomePage(driver);
		homePage.loginLogo();
		
		
	}
	
	
	
	
	@Test

	public void a_titleValidation() {
		
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
		Reporter.log("Actual title = " + actualTitle);
		Reporter.log("Expected title = " + expectedTitle);
		
	}
	
	@Test
	public void a_urlVerification() {
		
		Reporter.log(driver.getCurrentUrl());
	}
	
	 
	@Parameters({"username"})
	 @Test
	  public void enterUsername(String username) {
		 
		
		HomePage homePage = new HomePage(driver );
		homePage.enterUsername(username);
		
		
	
	 }
	
	@Parameters({"password"})
	 @Test
	  public void enterPassword(String password) {
		 
		HomePage homePage = new HomePage(driver);
		homePage.enterPassword(password);
		
	}
	
	
	 @Test
	  public void submit() {
		 
		HomePage homePage = new HomePage(driver);
		homePage.submit();
		Reporter.log("Log in button is submitted");
		
	}
	 
}
