package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentNews_BookmarksPage {



	@FindBy(xpath="(//a[text()='View All'])[2]")
	private WebElement viewall;

	
	@FindBy(xpath ="//div[@id='bookmark_59']")
	private WebElement Ipl;
	
	
	@FindBy(xpath ="//div[@id='bookmark_52']")
	private WebElement UpBoard;
	
	@FindBy(xpath ="//div[@id='bookmark_49']")
	private WebElement gk;
	
	@FindBy(xpath ="//div[@id='bookmark_47']")
	private WebElement IN;
	
	@FindBy(xpath ="//div[@id='bookmark_45']")
	private WebElement ck;
	
	@FindBy(xpath ="//div[@id='bookmark_41']")
	private WebElement Ai;
	
	@FindBy(xpath ="//div[@id='bookmark_19']")
	private WebElement sc;
	
	@FindBy(xpath ="//div[@id='bookmark_39']")
	private WebElement IPL;
	
	@FindBy(xpath ="//div[@id='bookmark_16']")
	private WebElement pk;
	
	@FindBy(xpath="//div[4]/div/div[2]/div/button")
	private WebElement b_Popups;
	
	
	public CurrentNews_BookmarksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickOnViewAll()
	{
		viewall.click();
	}
	
	

	public void clickOnIPl2021_Boookmark()
	{
		Ipl.click();
	}
	
	

	public void clickOn_Boookmark_PopupBTN()
	{
	  b_Popups.click();
	}
	
	public void clickOnUpBoard_Boookmark()
	{
		UpBoard.click();
	}
	
	public void clickOnGernalKnoledge_Boookmark()
	{
		gk.click();
	}
	
	public void clickOnInternationalNews_Boookmark()
	{
		IN.click();
	}
	
	public void clickOnCircketNews_Boookmark()
	{
		ck.click();
	}
	
	public void clickOnAiroIndia_Boookmark()
	{
		Ai.click();
	}
	
	public void clickOnScienceDaily_Boookmark()
	{
		sc.click();
	}
	
	public void clickOnIplnews_Boookmark()
	{
		IPL.click();
	}
	public void clickOnpatrika_Boookmark()
	{
		pk.click();
	}
}
