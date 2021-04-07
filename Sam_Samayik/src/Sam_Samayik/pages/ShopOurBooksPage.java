package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopOurBooksPage {


	@FindBy(xpath="(//a[text()='View All'])[3]")
	private WebElement viewall;
	
	

	@FindBy(xpath="//a[text()='Software Learning Books']")
	private WebElement SLB;
	
	
	
	
	public ShopOurBooksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnViewAll()
	{
		viewall.click();
	}
	
	public void clickON_Software_Learning_BOOk()
	{

		int h = SLB.getSize().getHeight();
		int w = SLB.getSize().getWidth();
	   System.out.println("hight of the Software Learning Book  Thumbnail is "+h);
		System.out.println("width of the Software Learning Book Thumbnail  is "+w);
		
	
		SLB.click();
	}
}
