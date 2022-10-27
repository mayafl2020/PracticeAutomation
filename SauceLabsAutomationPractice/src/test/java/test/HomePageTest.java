package test;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pom.HomePage;
import utilities.Common;

public class HomePageTest extends BaseTest {

	@Test

	public void tc1_titleValidation() {

		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();

		assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
		Reporter.log("Actual title = " + actualTitle);
		Reporter.log("Expected title = " + expectedTitle);

	}

	@Test
	public void tc2_urlVerification() {

		Reporter.log(driver.getCurrentUrl());
	}

	@Test
	public void tc3_loginButton() {

		HomePage homePage = new HomePage(driver);
		homePage.loginButton();

	}

	@Test
	public void tc4_loginLogo() {

		HomePage homePage = new HomePage(driver);
		homePage.loginLogo();

	}

	@Test
	public void tc5_usernamePasswordTextBoxInfo() {

		HomePage homePage = new HomePage(driver);
		homePage.usernameAndPasswordTextBox();

	}
	
	  @Parameters({"invalidUsername","invalidPassword"})
	     @Test
	     public void tc6_InvalidUsernameInvalidPassword(String invalidUsername, String invalidPassword) {
	    	 
	    	 
	    	 HomePage homePage = new HomePage(driver);
	    	 homePage.enterInvalidUsernameInvalidPassword(invalidUsername, invalidPassword);
	     }

	@Parameters({ "validUsername", "validPassword" })
	@Test
	public void tc7_ValidUsernameValidPassword(String validUsername, String validPassword) {

		HomePage homePage = new HomePage(driver);
		homePage.enterValidUsernameValidPassword(validUsername, validPassword);

	}

   

	@Test
	public void tc8_submit() {

		HomePage homePage = new HomePage(driver);
		homePage.submit();
		Reporter.log("Log in button is submitted");

	}

}
