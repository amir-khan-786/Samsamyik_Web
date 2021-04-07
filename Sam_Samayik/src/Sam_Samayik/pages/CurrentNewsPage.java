package Sam_Samayik.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Sam_Samayik.generics.BaseTest;

public class CurrentNewsPage {

	

	@FindBy(xpath="(//a[text()='View All'])[2]")
	private WebElement viewall;
	
	

	@FindBy(xpath = "//div[text()=' List view']")
	private WebElement ListView;
	
	@FindBy(xpath = "//div[text()=' Grid view']")
	private WebElement gridView;
	
	
	@FindBy(xpath = "//strong[text()='Electrical Current']")
	private WebElement ElectricCurrent;
	
	

	@FindBy(xpath = "//strong[text()='Realme X7 Pro']")
	private WebElement Realme_X7_Pro;
	
	

	@FindBy(xpath = "//strong[text()='ScienceDaily']")
	private WebElement ScienceDaily;
	
	
	

	@FindBy(xpath = "//strong[text()='मासिक पत्रिका जनवरी,2021 पी.डी.एफ']")
	private WebElement patrika;
	
	
	
	
	

	@FindBy(xpath = "//strong[text()='Current Live']")
	private WebElement currentLive;
	

	@FindBy(id = "comment")
	private WebElement C;
	
	@FindBy(id = "addcomment")
	private WebElement add;
	
	
	
	
	public CurrentNewsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnViewAll()
	{
		viewall.click();
	}
	public void clickOnListView()
	{
		ListView.click();
	}
	
	
	public void clickONGridView()
	{
		gridView.click();
	}
	
	public void clickOnElectricCurrent_Course() throws InterruptedException
	{
		int h = ElectricCurrent.getSize().getHeight();
		int w = ElectricCurrent.getSize().getWidth();
	   System.out.println("hight of the ElectricCurrent news Thumbnail is "+h);
		System.out.println("width of the ElectricCurrent news Thumbnail  is "+w);
		Thread.sleep(1000);
		
		ElectricCurrent.click();
	}
	
	public void clickOnRealmiX7Pro() throws InterruptedException
	{
		int h = Realme_X7_Pro.getSize().getHeight();
		int w = Realme_X7_Pro.getSize().getWidth();
	   System.out.println("hight of the Realme_X7_Pro news Thumbnail is "+h);
		System.out.println("width of the Realme_X7_Pro news Thumbnail  is "+w);
		Thread.sleep(1000);

		
		Realme_X7_Pro.click();
	}
	
	public void clickOnScienceDaily() throws InterruptedException
	{
		
		int h = ScienceDaily.getSize().getHeight();
		int w = ScienceDaily.getSize().getWidth();
	   System.out.println("hight of the ScienceDaily news Thumbnail is "+h);
		System.out.println("width of the ScienceDaily news Thumbnail  is "+w);
		Thread.sleep(1000);
		
		ScienceDaily.click();
	}
	
	public void  clickOnPatrika() throws InterruptedException
	{

		int h = patrika.getSize().getHeight();
		int w = patrika.getSize().getWidth();
	   System.out.println("hight of the patrika news Thumbnail is "+h);
		System.out.println("width of the patrika news Thumbnail  is "+w);
		
		Thread.sleep(1000);

		
		patrika.click();
	}
	
	 public void clickOnCurrentLive() throws InterruptedException
	 {
		 int h = currentLive.getSize().getHeight();
			int w = currentLive.getSize().getWidth();
		   System.out.println("hight of thecurrentLive news Thumbnail is "+h);
			System.out.println("width of the currentLive news Thumbnail  is "+w);
			Thread.sleep(1000);


			
		 currentLive.click();
	 }
	 
	 public void write_Comment(String Comment)
	 {
		 C.sendKeys(Comment);
	 }
	 public void clickOn_addComment_Send()
	 {
		 add.click();
	 }
	 
	 
}
