package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage {

	
	@FindBy(xpath="//a[text()='Select Address ']")
	private WebElement selectaddress;
	
	
	
	public MyCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	


	public void clickON_SelectAddres_BTN()
	{
		selectaddress.click();
	}
	
	
	
	
}
