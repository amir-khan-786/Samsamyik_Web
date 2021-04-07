package Sam_Samayik.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FWUtils 
{
	
	
	
	
		
		/**
		 * This Method is used To Verify The URl of the  WebPage 
		 * 
		 */
	

	public static void verifyURL( WebDriver driver,String expectedURL ,String pagename)
	{
		String actualURL = driver.getCurrentUrl();
		if(actualURL.equals(expectedURL))
		{
			System.out.println("Actual page is Display  ,"+pagename+" is --->"+expectedURL);
		}
		else
		{
			System.out.println("Actual page is not Display  ,"+pagename+" is not --->"+actualURL);
		}
	}


	/**
	 * This Method is used To Verify The Login  of the  WebPage 
	 * 
	 */


public static void verifyLogin( WebDriver driver,String expectedname)
{
	WebElement username = driver.findElement(By.id("uname"));
	String actualname = username.getText();
	
	if(actualname.equals(expectedname))
	{
		System.out.println("The Expected Page is Dispalyed--->"+expectedname);
	}
	else
	{
		
		System.out.println("The Expected Page is not Dispalyed--->"+actualname);
	}
}




}

