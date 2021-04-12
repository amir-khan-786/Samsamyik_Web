package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Order_DetailsPage {


	@FindBy(xpath="///a[text()='PROCEED TO PAY']")
	private WebElement proceedToPay;
	
	
	
	public My_Order_DetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	


	public void clickON_ProceedToPay_BTN()
	{
		proceedToPay.click();
	}
	
	
}
