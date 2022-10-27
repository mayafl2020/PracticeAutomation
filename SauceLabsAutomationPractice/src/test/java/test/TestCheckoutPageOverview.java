package test;

import org.testng.annotations.Test;

import pom.CheckoutOverviewPage;

public class TestCheckoutPageOverview extends BaseTest{
	
	@Test
	public void tc33_finishBtn() {
		
		CheckoutOverviewPage finish = new CheckoutOverviewPage(driver);
		finish.finishBtn();
	}

}
