package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//div[contains(text(),' Hello, Sign in')]")
	private WebElement Sign_IN;
	
	

	@FindBy(className ="dropbtn")
	private WebElement GuestName;
	
	
	

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	
	@FindBy(className = "fa fa-shopping-cart top-items")
	private WebElement ADD_TO_CART;
	
	// Mobile menu of the Home Page 
	

	@FindBy(xpath = "(//h6[text()='Books'])[1]")
	private WebElement book;
	

	@FindBy(xpath = "(//h6[text()='E-Books'])[1]")
	private WebElement E_book;
	
	@FindBy(xpath = "(//h6[text()='Daily Quiz'])[1]")
	private WebElement Daily_quiz;
	
	@FindBy(xpath = "(//h6[text()='Online Test'])[1]")
	private WebElement online_Test;
	
	@FindBy(xpath = "(//h6[text()='Video Lectures'])[1]")
	private WebElement video_Lectures;
	
	
	
	// Logo of the Home Page 
	@FindBy(xpath = "(//img[@alt='Logo'])[1]")
	private WebElement GhatnaChaker_logo;
	
	@FindBy(xpath = "(//a[@href='http://65.0.58.104:8777/index.php/web_new/home'])[2]")
	private WebElement homePage_hut_logo;
	
	// click on Cart 
	@FindBy(xpath = "//div[@class='fa fa-shopping-cart top-items']")
	private WebElement cart;
	
	// arrow of the Banner under the Mobile Menu 
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-right'])[2]")
	private WebElement b1right_arrow;
	
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-left'])[2]")
	private WebElement b1_left_arrow;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Sign_IN()
	{
		Sign_IN.click();
	}
	public void clickOnADDTOCART()
	{
		ADD_TO_CART.click();
	}
	
	
	public void clickONGuestName()
	{
		GuestName.click();
	}
	
	public void clickOnLogoutBTN()
	{
		logout.click();
	}
	
	public void clickOnMobile_Menu_Book()
	{
		book.click();
	}
	
	

	public void clickOnMobile_Menu_E_Book()
	{
		E_book.click();
	}
	
	public void clickOnMobile_Menu_Daily_Quiz()
	{
		Daily_quiz.click();
	}
	
	
	public void clickOnMobile_Menu_Online_Test()
	{
		online_Test.click();
	}
	
	
	public void clickOnMobile_Menu_Video_Lecture()
	{
		video_Lectures.click();
	}
	
	public boolean  clickOnGhatnaChakerLogo()
	{
		GhatnaChaker_logo.isDisplayed();
		
		GhatnaChaker_logo.click();
		return true;
		
	}
	
	public boolean  clickOnHomePageHut_Logo()
	{
		homePage_hut_logo.isDisplayed();
		
		
		homePage_hut_logo.click();
		return true;
		
	}
	
	public void clickOn_CartCount_BTN()
	{
		cart.click();
	}
	
	public void clickOn_b1_right_arrow_BTN()
	{
		b1right_arrow.click();
	}
	
	public void clickOn_b1_left_arrow_BTN()
	{
		b1_left_arrow.click();
	}
	
	
}
