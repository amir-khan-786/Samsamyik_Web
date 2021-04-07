package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrentNewsFilterPage {


	@FindBy(xpath = "//a[contains(text(),'Demo 1.0')]")
	private WebElement Demo;
	
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Electronics gadgets')]")
	private WebElement EC;
	
	
	
	
	@FindBy(xpath = "//a[contains(text(),'DailyScience')]")
	private WebElement DS;
	

	@FindBy(xpath = "//a[contains(text(),'Maths')]")
	private WebElement m;
	
	@FindBy(xpath = "//a[contains(text(),'Polity')]")
	private WebElement p;
	
	 
	@FindBy(xpath = "//a[contains(text(),'Circket News')]")
	private WebElement cn;
	 
	 
	@FindBy(xpath = "//a[contains(text(),'National News 2021')]")
	private WebElement national;
	 
	 
	@FindBy(xpath = "//a[contains(text(),'Gk')]")
	private WebElement Gk;
	 
	 
	@FindBy(xpath = "//a[contains(text(),'UP Board')]")
	private WebElement up;
	 
	 
	@FindBy(xpath = "//a[contains(text(),'English')]")
	private WebElement english;
	 
	 
	
	
	public CurrentNewsFilterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	

	public void clickONDemo1_Filter()
	{
		Demo.click();
	}
	

	public void clickONElectronics_gadgets_Filter()
	{
		EC.click();
	}
	
	public void clickONDailyScience_Filter()
	{
		DS.click();
	}
	
	public void clickONMath_Filter()
	{
		m.click();
	}
	
	public void clickON_Polity_Filter()
	{
		p.click();
	}
	
	public void clickON_CurrentNews_Filter()
	{
		cn.click();
	}
	
	
	public void clickON_Nationalnews_Filter()
	{
		national.click();
	}
	
	

	public void clickON_GK_news_Filter()
	{
		Gk.click();
	}

	public void clickON_UP_Board_news_Filter()
	{
		up.click();
	}
	
	public void clickON_English_news_Filter()
	{
		english.click();
	}
}
