package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentGateway_PayuMoneyPage {


	@FindBy(id = "cardNumber")
	private WebElement cardNo;
	
	

	@FindBy(id = "cardExp")
	private WebElement cardExpNo;
	
	
	

	@FindBy(id = "cardCvv")
	private WebElement cardCvvNo;
	
	
	

	@FindBy(id = "cardHolder")
	private WebElement cardHolder;
	
	
	

	@FindBy(id = "citrusCardPayButton")
	private WebElement payNowBTN;
	
	
	public PaymentGateway_PayuMoneyPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	


	public void enterCardNo()
	{
	cardNo.sendKeys("5123456789012346");
	}
	
	public void enterCardEXPNo()
	{
	cardExpNo.sendKeys("0521");
	}
	
	
	public void enterCardCvvNo()
	{
	cardCvvNo.sendKeys("123");
	}
	
	
	public void enterCardHolder()
	{
	cardHolder.sendKeys("test");
	}
	
	public void ClickOnPayNowBTN()
	{
	payNowBTN.click();
	}
}


