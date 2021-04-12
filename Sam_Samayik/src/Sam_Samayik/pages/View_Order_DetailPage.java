package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class View_Order_DetailPage {


	@FindBy(id = "exampleRadios2")
	private WebElement PayViaPauU_Money;
	
	@FindBy(xpath = "//a[text()='PROCEED TO PAY']")
	private WebElement proceedToPay;
	
	
	
	public View_Order_DetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	


	public void clickON_PayUMOney_BTN()
	{
		PayViaPauU_Money.click();
	}
	
	public void clickON_ProceedToPay_BTN()
	{
		proceedToPay.click();
	}
	
}
