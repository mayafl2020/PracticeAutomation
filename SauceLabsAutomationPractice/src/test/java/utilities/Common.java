package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Common {
	
WebDriver driver;
	
	
	public void setupBrowser(String browser,String url) {
		
		String currDir = System.getProperty("user.dir");
		System.out.println(currDir);
		String fs = System.getProperty("file.separator");
		String path = currDir + fs + "drivers" + fs;
		
		if(browser.equalsIgnoreCase("chrome")) {
			
		
			System.setProperty("webdriver.chrome.driver", path + "chromedriver");
		        driver = new ChromeDriver();
		}
			
			else if(browser.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
			}
			
			else {
				System.out.println("Valid browser was not provided,hence quitting the automation run");
				System.exit(0);
			}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
			if(url!="")
				driver.get(url);
			else
				driver.get("about:blank");
			
			
	}
		public WebDriver getDriver() {
			
			return driver;
		}
		
		public void closeTab() {
			
			driver.close();
		}

		public void quitBrowser() {
			
			driver.quit();
		}
	


}
