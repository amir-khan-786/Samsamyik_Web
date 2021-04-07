package Sam_Samayik.scripts;

import Sam_Samayik.generics.BaseTest;

import Sam_Samayik.generics.FWUtils;
import Sam_Samayik.pages.HomePage;
import Sam_Samayik.pages.LoginPage;
import Sam_Samayik.pages.MyProfilePage;

public class TestMyProfile extends BaseTest {
	
	
    public static void main(String[] args) throws InterruptedException {
	

	openBrowser("chrome");
	
	HomePage home= new HomePage(driver);
	home.Sign_IN();

	LoginPage lp = new LoginPage(driver);
	lp.EnteruserName("9971808064");
	lp.enterPassword("12345678");
	lp.clickOnContinueBTN();
	
	FWUtils.verifyURL(driver, URL,"URl of the Page After Login ");
	home.clickONGuestName();
		
	MyProfilePage my = new MyProfilePage(driver);
	my.myProfile();
	FWUtils.verifyURL(driver,"http://65.0.58.104:8777/index.php/web_new/home/profile/95" , "URl of the My Profile Page ");
	my.clear_All();
	my.enterUnTb("Amir");
	my.enterMobileNumber("9971808064");
	my.enterEmail("amirpathan8080@gmail.com");
	my.clickOnUpdateBTN();
	Thread.sleep(500);

	driver.switchTo().alert().accept();
	Thread.sleep(500);
	System.out.println("My profile Test Case is pass ");
     driver.close();

}
}