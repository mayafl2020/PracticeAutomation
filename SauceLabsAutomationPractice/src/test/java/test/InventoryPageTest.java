package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.InventoryPage;

public class InventoryPageTest extends BaseTest {
	
	
	 @Test
  public void a_openMenu() {
	  
	 InventoryPage inventory = new InventoryPage(driver);
     inventory.openMenu();
     
	 }
	  
	  
	  @Test
	  
	  public void allItems() {
		
		  InventoryPage inventory = new InventoryPage(driver);
		  inventory.allItems();
		  Reporter.log("All items text is displayed");
		  
	  }
	  
	  @Test
	  
	  public void about () {
		
		  InventoryPage inventory = new InventoryPage(driver);
		  inventory.about();
		  Reporter.log("About text is displayed");
		  
	  }
	  
	  @Test
	  
	  public void logout() {
		
		  InventoryPage inventory = new InventoryPage(driver);
		  inventory.logout();
		  Reporter.log("Logout text is displayed");
		  
	  }
	  
	  @Test
	  
	  public void resetApp() {
		
		  InventoryPage inventory = new InventoryPage(driver);
		  inventory.reset();
		  Reporter.log("Reset app state text is displayed");
		  
	  }

//	  @Test
//	  
//	  public void z_clickAboutPage() {
//		  
//		  InventoryPage inventory = new InventoryPage(driver);
//		  inventory.clickAbout();
//	  }
	  

	  @Test
	  
	  public void closeMenu() {
		  
		  InventoryPage inventory = new InventoryPage(driver);
		  inventory.closeMenu();
	  }
	  
	  @Test
	  public void z_sauceLabsBackpack() {
		  
		  InventoryPage inventory = new InventoryPage(driver);
		  inventory.sauceLabsBackpack();
	  }
  }

