package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

	private WebDriver driver;
	
	@CacheLookup
	@FindBy(name="finish")
	WebElement finishBtn;
	
	
	
	public CheckoutOverviewPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void finishBtn() {
		
		finishBtn.click();
		
	}
	
	
}
