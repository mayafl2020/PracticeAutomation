package test;

import org.testng.annotations.Test;

import pom.CheckoutOverviewPage;

public class CheckoutOverviewPageTest extends BaseTest{
	
	@Test
	public void finishBtn() {
		
		CheckoutOverviewPage finish = new CheckoutOverviewPage(driver);
		finish.finishBtn();
	}

}
