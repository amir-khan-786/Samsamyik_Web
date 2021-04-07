package Sam_Samayik.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

public class Scroll {

	public  static WebDriver driver;

	public static void scrollDownByAxies( String location ) throws InterruptedException
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		Thread.sleep(2000);
		jse.executeScript(location);

	
	}
	
	
	public static void scrollDownByElementLocation( String cNewsLocation) throws InterruptedException
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		Thread.sleep(500);
		
		WebElement cNews = driver.findElement(By.xpath(cNewsLocation));
		
		int yaxis = cNews.getLocation().getY();
		Thread.sleep(500);

		jse.executeScript("window.scrollBy(0,"+yaxis+")");

	}


	
}
