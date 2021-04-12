package Sam_Samayik.scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Sam_Samayik.generics.BaseTest;
import Sam_Samayik.pages.ShopOurBooksPage;

public class TestPurchase  extends BaseTest{

	
	@Test
	public void shopOurBook() throws InterruptedException, IOException
	{
		TestLoginPage login = new TestLoginPage();
		
		login.test_Login_Page();
		
		
		
		ShopOurBooksPage sp = new ShopOurBooksPage(driver);
		sp.clickOnViewAll();
		Thread.sleep(100);
		
        scrollDownByAxies("window.scrollBy(0,500)");
        
        
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        
        sp.clickOn_AddTOCart_SoftwareLearningBook();
		
	}
}
