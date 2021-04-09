package Sam_Samayik.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.Create_accountPage;
import Sam_Samayik.pages.CurrentNewsFilterPage;
import Sam_Samayik.pages.CurrentNewsPage;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;
import Sam_Samayik.pages.MyProfilePage;

public class TestAll extends BaseTest {
	@Test
public static void all() throws InterruptedException, IOException {
		
		
		
	//InvalidUserLogin
		
		openBrowser("chrome");
		Thread.sleep(1000);
		FWUtils.verifyURL(driver, URL,"URl of the Page Before Login ");
		
		HomePage home= new HomePage(driver);
		home.Sign_IN();

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(500);
		lp.clickOnContinueBTN();
	   
		Thread.sleep(500);


		lp.EnteruserName("987180806");
		lp.clickOnContinueBTN();
		Thread.sleep(500);

		lp.clearusernameandpassword();
		System.out.println("Invalid username and id ");
		
		Thread.sleep(500);

		

		lp.EnteruserName("9871808064");
		lp.enterPassword("123456789");
		lp.clickOnContinueBTN();
		Thread.sleep(500);

		lp.clickONOKBTN();
		lp.clearusernameandpassword();

		System.out.println("Invalid username and id ");
		
		
		
		Thread.sleep(500);

		lp.EnteruserName("997808064");
		lp.enterPassword("12345678");
		lp.clickOnContinueBTN();
		Thread.sleep(500);

		lp.clickONOKBTN();
		lp.clearusernameandpassword();

		System.out.println("Invalid username and id ");
		
		
		Thread.sleep(500);

		lp.EnteruserName("Amir");
		lp.enterPassword("12345678");
		lp.clickOnContinueBTN();
		Thread.sleep(500);

		lp.clickONOKBTN();
		lp.clearusernameandpassword();

		System.out.println("Invalid username and id ");
		
		Thread.sleep(500);


		lp.EnteruserName(" Amir");
		lp.enterPassword(" Amir");
		lp.clickOnContinueBTN();
		Thread.sleep(500);

		lp.clickONOKBTN();
		lp.clearusernameandpassword();
		Thread.sleep(500);

		System.out.println("Invalid username and id ");
		

		lp.EnteruserName("12345678");
		lp.enterPassword("9971808064");
		lp.clickOnContinueBTN();
		Thread.sleep(500);

		lp.clickONOKBTN();
		lp.clearusernameandpassword();

		System.out.println("Invalid username and id ");
		
		
		Thread.sleep(500);

		FWUtils.verifyURL(driver, URL,"URl of the Page  Before  Login ");
	 Thread.sleep(500);
	 
		
		System.out.println("Test case is Pass ");
		
	    System.out.println("Please Create Account First ");
		Thread.sleep(500);

		driver.close();
		
		
//Create  User Account 
		

		openBrowser("chrome");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FWUtils.verifyURL(driver, URL,"URl of the Page Before Login ");
		
		HomePage home1= new HomePage(driver);
		home1.Sign_IN();
		

		LoginPage lp1 = new LoginPage(driver);
		Thread.sleep(1000);
		lp1.clickOnCreateAccountBTN();
		
		Create_accountPage ca = new Create_accountPage(driver);
		
		
		ca.ClickOnContinueBTN();
		
		ca.enterUserName();
		ca.SizeOF_userNameTextBox();
		ca.ClickOnContinueBTN();
		
		ca.enterUserName();
		ca.enterMobileNumber();
		ca.SizeOF_MobileTextBox();
		ca.ClickOnContinueBTN();
		
		ca.enterUserName();
		ca.enterMobileNumber();
		ca.enterEmail();
		ca.SizeOF_emailTextBox();
		ca.ClickOnContinueBTN();
		
		ca.enterUserName();
		ca.enterMobileNumber();
		ca.enterPassword();
		ca.SizeOF_passwordTextBox();
		ca.ClickOnContinueBTN();
		
		ca.enterUserName();
		ca.enterMobileNumber();
		
		ca.enterPassword();
		ca.acceptTermandCondition();
		ca.SizeOF_continueBTN();
		ca.ClickOnContinueBTN();
		
		
       Thread.sleep(1000);
		ca.clickOnMoileAlreadyExistPopUPs();
		
		
		
	     System.out.println("Test case is Pass ");
	     
	    driver.close();
		
	    // Valid User login 
	    

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
		  home2.clickONGuestName();
		  Thread.sleep(500);
		  home2.clickOnLogoutBTN();
		
		  System.out.println("Test Case is Pass Enjoy");
		  Thread.sleep(500);

			FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home","URl of the Home Page  After Logout");
			
			  Thread.sleep(500);

		  closeBrowser();
		 
	    // My Profile Page 
		  

			openBrowser("chrome");
			
			HomePage home3= new HomePage(driver);
			home3.Sign_IN();

			LoginPage lp3 = new LoginPage(driver);
			lp3.EnteruserName("9971808064");
			lp3.enterPassword("12345678");
			lp3.clickOnContinueBTN();
			
			FWUtils.verifyURL(driver, URL,"URl of the Page After Login ");
			home3.clickONGuestName();
				
			MyProfilePage my3 = new MyProfilePage(driver);
			my3.myProfile();
			FWUtils.verifyURL(driver,"http://65.0.58.104:8777/index.php/web_new/home/profile/95" , "URl of the My Profile Page ");
			my3.clear_All();
			my3.enterUnTb("Amir");
			my3.enterMobileNumber("9971808064");
			my3.enterEmail("amirpathan8080@gmail.com");
			my3.clickOnUpdateBTN();
			Thread.sleep(500);

			driver.switchTo().alert().accept();
			Thread.sleep(500);
			System.out.println("My profile Test Case is pass ");
		     driver.close();
		     
		     
		     // All Module of the My Profile Page 
		     

		 	openBrowser("chrome");
		 	
		 	HomePage home4= new HomePage(driver);
		 	home4.Sign_IN();

		 	LoginPage lp4 = new LoginPage(driver);
		 	lp4.EnteruserName("9971808064");
		 	lp4.enterPassword("12345678");
		 	lp4.clickOnContinueBTN();
		 	System.out.println("Title of Login Page ");
		 	
		 	home4.clickONGuestName();
		 		
		 	MyProfilePage my4 = new MyProfilePage(driver);
		 	my4.myProfile();
		 	my4.clear_All();
		 	my4.enterUnTb("Amir");
		 	my4.enterMobileNumber("9971808064");
		 	my4.enterEmail("amir@gmail.com");
		 	Thread.sleep(1000);
		 	 my4.clickOnUpdateBTN();
		 	 Thread.sleep(1000);
		 	 
		 	driver.switchTo().alert().accept();
		 	my4.clickOnMembership();
		 	my4.clickOnMYWishlist();
		 	my4.clickONBookmark();
		 	my4.clickOnMy_Oder();
		 	my4.clickONMy_Purchage();
		 	my4.clickOnEarnPoint();
		 	my4.clickOnNotification();
		 	my4.clickOnCustomerSupport();
		 	my4.clickOnLogoutBTN();
		 	
		 	driver.close();
		 	
		 	// Current News  
		 	openBrowser("chrome");
			 
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			HomePage home5= new HomePage(driver);
			home5.Sign_IN();
			
			
			
			LoginPage lp5 = new LoginPage(driver);

			lp5.EnteruserName("9971808064");
			Thread.sleep(500);
			lp5.enterPassword("12345678");
			lp5.clickOnContinueBTN();
			

			FWUtils.verifyURL(driver, URL,"URl of the Page After Login ");
			Thread.sleep(500);
	        CurrentNewsPage c_News5= new  CurrentNewsPage(driver);
	        

	    		
	    		JavascriptExecutor jse = (JavascriptExecutor)driver;

	    		Thread.sleep(500);
	    		
	    		WebElement cNews5 = driver.findElement(By.xpath("//h1[text()='Current News']"));
	    		
	    		int yaxis = cNews5.getLocation().getY();
	    		Thread.sleep(500);

	    		jse.executeScript("window.scrollBy(0,"+yaxis+")");
	    
	    		
	    		Thread.sleep(100);
	    		c_News5.clickOnViewAll();
	    		
	    		
	     		
	    		
	    		FWUtils.verifyURL(driver,"http://65.0.58.104:8777/index.php/web_new/home/get_all_data/95/7/1/11", " In Current News When we Click on View All ");
	             
	    		
	            scrollDownByAxies("window.scrollBy(0,1000)");
	            Thread.sleep(100);
	            c_News5.clickOnCurrentLive();
	            
	            Thread.sleep(100);
	            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/8/11", "URl of the Current Live News");
	            scrollDownByAxies("window.scrollBy(0,500)");
	            
	            c_News5.write_Comment("Current Live News is Good");
	            c_News5.clickOn_addComment_Send();
	            
	            driver.navigate().back();
	            Thread.sleep(100);
	            c_News5.clickOnElectricCurrent_Course();
	            
	            
	            Thread.sleep(100);
	            
	            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/14/11", "URl of the Electric Current News ");
	            scrollDownByAxies("window.scrollBy(0,500)");
	            
	            c_News5.write_Comment("Electric Current News is Good");
	            c_News5.clickOn_addComment_Send();
	            
	            
	            driver.navigate().back();
	            
	            
	            
	            c_News5.clickOnRealmiX7Pro();
	            Thread.sleep(100);
	            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/15/11", "URl of Realmi X7 Pro  News ");
	            c_News5.write_Comment("Realmi X7 Pro News is Good");
	            c_News5.clickOn_addComment_Send();
	            
	            
	            
	            
	            driver.navigate().back();
	            
	            c_News5.clickOnPatrika();
	            Thread.sleep(100);
	            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/16/11", "URl of Patrika  News ");
	            c_News5.write_Comment("Patrika News is Good");
	            c_News5.clickOn_addComment_Send();
	            
	            
	            driver.navigate().back();
	            
	            
	            c_News5.clickOnScienceDaily();
	            Thread.sleep(100);
	            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/19/11", "URl of ScienceDaily  News ");
	            c_News5.write_Comment("Daily Science News is Good");
	            c_News5.clickOn_addComment_Send();
	            
	            
	            driver.navigate().back();
	            
	            scrollDownByAxies("window.scrollBy(0,-1000)");
	            Thread.sleep(1000);
	            c_News5.clickOnListView();
	            Thread.sleep(2000);

	            c_News5.clickONGridView();
	            Thread.sleep(2000);
	  
	            //Current news Filter Page code 
	            scrollDownByAxies("window.scrollBy(0,100)");
	           
	        CurrentNewsFilterPage cf = new CurrentNewsFilterPage(driver);
	        cf.clickONDemo1_Filter();
	        Thread.sleep(500);
	        cf.clickONElectronics_gadgets_Filter();
	        Thread.sleep(500);
	        cf.clickONDailyScience_Filter();
	        Thread.sleep(500);
	       cf.clickONMath_Filter();
	       Thread.sleep(500);
	       cf.clickON_Polity_Filter();
	       Thread.sleep(500);
	       cf.clickON_CurrentNews_Filter();
	       Thread.sleep(500);
	       cf.clickON_Nationalnews_Filter();
	       Thread.sleep(500);
	       cf.clickON_GK_news_Filter();
	       Thread.sleep(500);
	       cf.clickON_UP_Board_news_Filter();
	       Thread.sleep(500);
	       cf.clickON_English_news_Filter();

	       driver.close();


	        
	        
		     
	}
}
