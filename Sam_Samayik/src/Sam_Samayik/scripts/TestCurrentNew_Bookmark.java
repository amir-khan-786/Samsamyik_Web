package Sam_Samayik.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.CurrentNews_BookmarksPage;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;
import Sam_Samayik.pages.MyProfilePage;

public class TestCurrentNew_Bookmark extends BaseTest {

	@Test
	public static void bookmarks() throws InterruptedException, IOException {
		

		openBrowser("chrome");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home","URl of the Home Page Before Login ");
		screenShot("./photo/homePage.png");
		scrollDownByAxies("window.scrollBy(0,9000);");
		
		scrollDownByAxies("window.scrollBy(0,-9000);");
		
		
		  
		  HomePage home= new HomePage(driver); 
		  home.Sign_IN();
		  
		  
		  
		  LoginPage lp = new LoginPage(driver);
		  
			screenShot("./photo/LoginPage.png");

		  
		  lp.EnteruserName("9971808064"); 
		  lp.enterPassword("12345678");
		  Thread.sleep(1000);
		  lp.clickOnContinueBTN(); 
		  Thread.sleep(500);
		  FWUtils.verifyLogin(driver, "Amir");
		

			
			CurrentNews_BookmarksPage c_b = new CurrentNews_BookmarksPage(driver);
			scrollDownByAxies("window.scrollBy(0,1200)");
		   Thread.sleep(500);
		   c_b.clickOnViewAll();
		   Thread.sleep(500);
		   c_b.clickOnIPl2021_Boookmark();
		   c_b.clickOn_Boookmark_PopupBTN();
		   
		   Thread.sleep(500);
		   c_b.clickOnUpBoard_Boookmark();
		   c_b.clickOn_Boookmark_PopupBTN();
		   Thread.sleep(500);

		   c_b.clickOnGernalKnoledge_Boookmark();
		   c_b.clickOn_Boookmark_PopupBTN();
		   Thread.sleep(1000);

			scrollDownByAxies("window.scrollBy(0,100)");

			/*
			 * Thread.sleep(1000); c_b.clickOnInternationalNews_Boookmark();
			 * Thread.sleep(500); c_b.clickOn_Boookmark_PopupBTN(); Thread.sleep(1000);
			 */

			
			  c_b.clickOnCircketNews_Boookmark(); c_b.clickOn_Boookmark_PopupBTN();
			  Thread.sleep(1000);
			  
			  c_b.clickOnAiroIndia_Boookmark(); c_b.clickOn_Boookmark_PopupBTN();
			  
			  Thread.sleep(1000);
			  
			  scrollDownByAxies("window.scrollBy(0,200)");
			  
			  c_b.clickOnIplnews_Boookmark(); c_b.clickOn_Boookmark_PopupBTN();
			  Thread.sleep(1000);
			  
			  c_b.clickOnScienceDaily_Boookmark(); c_b.clickOn_Boookmark_PopupBTN();
			  Thread.sleep(1000);
			  
			  c_b.clickOnpatrika_Boookmark(); c_b.clickOn_Boookmark_PopupBTN();
			  Thread.sleep(1000);
			  
			  Thread.sleep(1000); home.Sign_IN(); home.clickONGuestName();
			  Thread.sleep(1000);
			 
		   
		  MyProfilePage p = new MyProfilePage(driver);
		  p.clickONBookmark();
		  
}
}

