package Sam_Samayik.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;
import Sam_Samayik.pages.ShopOurBooksPage;

public class Test_ShopOurBook extends BaseTest{

	@Test
public static void shopOurBook() throws IOException, InterruptedException
{
	openBrowser("chrome");
	
	
	FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home","URl of the Home Page Before Login ");
	screenShot("./photo/homePage.png");
	scrollDownByAxies("window.scrollBy(0,9000);");
	
	scrollDownByAxies("window.scrollBy(0,-9000);");
	
	
	  
	  HomePage home2= new HomePage(driver); 
	  home2.Sign_IN();
	  
	  
	  
	  LoginPage lp2 = new LoginPage(driver);
	  
		screenShot("./photo/LoginPage.png");

	  
	  lp2.EnteruserName("9971808064"); 
	  lp2.enterPassword("12345678");
	  Thread.sleep(1000);
	  lp2.clickOnContinueBTN(); 
	  Thread.sleep(500);
	  FWUtils.verifyLogin(driver, "Amir Khan Pathan");
	

		FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home", "URL of the Home Page After Login ");
		
		scrollDownByAxies("window.scrollBy(0,450);");
		
		ShopOurBooksPage sp = new ShopOurBooksPage(driver);
		sp.clickOnViewAll();
		Thread.sleep(100);
		
		
		sp.detail_OF_Software_Learning_BOOk();
		
		driver.navigate().back();
		
        Thread.sleep(5000);

		sp.detail_OF_Budget_BOOk();
		driver.navigate().back();
        Thread.sleep(5000);
		sp.detail_OF_Project_Management_BOOk();
		driver.navigate().back();
        Thread.sleep(5000);

		sp.detail_OF_BPSC_BOOk();
		driver.navigate().back();
        Thread.sleep(5000);

		sp.detail_OF_circket_BOOk();
		driver.navigate().back();
        Thread.sleep(5000);

		sp.detail_OF_ElectricCurrent_BOOk();
		driver.navigate().back();
        Thread.sleep(5000);

		sp.detail_OF_physic_BOOk();
		driver.navigate().back();





		
	
}
}
