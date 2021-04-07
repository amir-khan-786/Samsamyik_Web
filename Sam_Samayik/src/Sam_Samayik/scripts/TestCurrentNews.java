package Sam_Samayik.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.generics.Scroll;
import Sam_Samayik.pages.CurrentNewsFilterPage;
import Sam_Samayik.pages.CurrentNewsPage;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;

public class TestCurrentNews extends BaseTest {
	@Test
	public static void test_Current_News() throws InterruptedException {
		
		openBrowser("chrome");
		 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		HomePage home= new HomePage(driver);
		home.Sign_IN();
		
		
		
		LoginPage lp = new LoginPage(driver);

		lp.EnteruserName("9971808064");
		Thread.sleep(500);
		lp.enterPassword("12345678");
		lp.clickOnContinueBTN();
		

		FWUtils.verifyURL(driver, URL,"URl of the Page After Login ");
		Thread.sleep(500);
        CurrentNewsPage c_News= new  CurrentNewsPage(driver);
        

    		
    		JavascriptExecutor jse = (JavascriptExecutor)driver;

    		Thread.sleep(500);
    		
    		WebElement cNews = driver.findElement(By.xpath("//h1[text()='Current News']"));
    		
    		int yaxis = cNews.getLocation().getY();
    		Thread.sleep(500);

    		jse.executeScript("window.scrollBy(0,"+yaxis+")");
    
    		
    		Thread.sleep(100);
    		c_News.clickOnViewAll();
    		
    		
     		
    		
    		FWUtils.verifyURL(driver,"http://65.0.58.104:8777/index.php/web_new/home/get_all_data/95/7/1/11", " In Current News When we Click on View All ");
             
    		
            scrollDownByAxies("window.scrollBy(0,1000)");
            Thread.sleep(100);
            c_News.clickOnCurrentLive();
            
            Thread.sleep(100);
            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/8/11", "URl of the Current Live News");
            scrollDownByAxies("window.scrollBy(0,500)");
            
            c_News.write_Comment("Current Live News is Good");
            c_News.clickOn_addComment_Send();
            
            driver.navigate().back();
            Thread.sleep(100);
            c_News.clickOnElectricCurrent_Course();
            
            
            Thread.sleep(100);
            
            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/14/11", "URl of the Electric Current News ");
            scrollDownByAxies("window.scrollBy(0,500)");
            
            c_News.write_Comment("Electric Current News is Good");
            c_News.clickOn_addComment_Send();
            
            
            driver.navigate().back();
            
            
            
            c_News.clickOnRealmiX7Pro();
            Thread.sleep(100);
            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/15/11", "URl of Realmi X7 Pro  News ");
            c_News.write_Comment("Realmi X7 Pro News is Good");
            c_News.clickOn_addComment_Send();
            
            
            
            
            driver.navigate().back();
            
            c_News.clickOnPatrika();
            Thread.sleep(100);
            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/16/11", "URl of Patrika  News ");
            c_News.write_Comment("Patrika News is Good");
            c_News.clickOn_addComment_Send();
            
            
            driver.navigate().back();
            
            
            c_News.clickOnScienceDaily();
            Thread.sleep(100);
            FWUtils.verifyURL(driver, "http://65.0.58.104:8777/index.php/web_new/home/product_detail/95/7/19/11", "URl of ScienceDaily  News ");
            c_News.write_Comment("Daily Science News is Good");
            c_News.clickOn_addComment_Send();
            
            
            driver.navigate().back();
            
            scrollDownByAxies("window.scrollBy(0,-1000)");
            Thread.sleep(1000);
            c_News.clickOnListView();
            Thread.sleep(2000);

            c_News.clickONGridView();
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

