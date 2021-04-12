package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HDFC_SIMULATOR_Page {


	@FindBy(id = "password")
	private WebElement textBox;
	

	@FindBy(id = "submitBtn")
	private WebElement submitBtn;
	
	
	@FindBy(xpath = "//button[text()='Send anyway']")
	private WebElement sendanyway;
	
	public HDFC_SIMULATOR_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	


	public void enterOTP()
	{
	    textBox.sendKeys("123456");
	}
	

	public void clickONSubmitBTN()
	{
	    submitBtn.click();
	}
	
	public void clickON_sendanywayBTN()
	{
	    sendanyway.click();
	}
}
