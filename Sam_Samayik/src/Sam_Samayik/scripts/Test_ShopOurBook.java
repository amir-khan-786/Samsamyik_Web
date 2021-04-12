package Sam_Samayik.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
		
		TestLoginPage login = new TestLoginPage();
		login.test_Login_Page();
		
		
		ShopOurBooksPage sp = new ShopOurBooksPage(driver);
		sp.clickOnViewAll();
		Thread.sleep(100);
		
        scrollDownByAxies("window.scrollBy(0,500)");
        
        
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        sp.detail_OF_Software_Learning_BOOk();
        driver.navigate().back();
        
        sp.detail_OF_Budget_BOOk();
        driver.navigate().back();
        
        
		
		  sp.detail_OF_Project_Management_BOOk();
		  driver.navigate().back();
		 
        Thread.sleep(1000);
		  
        sp.detail_OF_ElectricCurrent_BOOk();
        driver.navigate().back();


        Thread.sleep(1000);

        scrollDownByAxies("window.scrollBy(0,100)");

        
        sp.detail_OF_BPSC_BOOk();
        driver.navigate().back();
        Thread.sleep(1000);

        sp.detail_OF_Budget_2020_BOOk();
        driver.navigate().back();
        Thread.sleep(1000);

        sp.detail_OF_circket_BOOk();
        driver.navigate().back();
        Thread.sleep(1000);


       sp.clickOn_filter_CircketNews();
       Thread.sleep(1000);

       sp.clickOn_filter_BhartyaItiash();
       Thread.sleep(1000);

       sp.clickOn_filter_physics();
       Thread.sleep(1000);

       sp.clicoOn_filter_polity();
       Thread.sleep(1000);

       sp.clickOn_filter_Maths();
       Thread.sleep(1000);

       sp.clickOn_filter_AllCategory();
       Thread.sleep(1000);

       sp.clickOnListView();
       Thread.sleep(1000);

       scrollDownByAxies("window.scrollBy(0,1400)");

       scrollDownByAxies("window.scrollBy(0,-1400)");

       sp.clickOnGridView();
       scrollDownByAxies("window.scrollBy(0,1400)");

       scrollDownByAxies("window.scrollBy(0,-1400)");

     Thread.sleep(1000);
     driver.close();
		
	
}
}
