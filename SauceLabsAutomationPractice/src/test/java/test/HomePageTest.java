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
	
	 @Test
	  public void a_usernamePasswordTextBoxInfo() {
		 
		
		HomePage homePage = new HomePage(driver );
	    homePage.usernameAndPasswordTextBox();
		
	 }

	 
	@Parameters({"validUsername","validPassword"})
	 @Test
	  public void tc2(String validUsername,String validPassword) {
		 
		
		HomePage homePage = new HomePage(driver );
		homePage.enterValidUsernameValidPassword(validUsername, validPassword);
		
	 }
	
	 
//     @Parameters({"invalidUsername","invalidPassword"})
//     @Test
//     public void tc1(String invalidUsername, String invalidPassword) {
//    	 
//    	 
//    	 HomePage homePage = new HomePage(driver);
//    	 homePage.enterInvalidUsernameInvalidPassword(invalidUsername, invalidPassword);
//     }
     
	

	
	 @Test
	  public void z_submit() {
		 
		HomePage homePage = new HomePage(driver);
		homePage.submit();
		Reporter.log("Log in button is submitted");
		
	}
	 
}
