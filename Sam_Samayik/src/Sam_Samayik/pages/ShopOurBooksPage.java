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
	
	@FindBy(xpath = "(//ul[@class='list-unstyled ratings mb-1'])[1]")
	private WebElement R_SLB;
	
	@FindBy(xpath = "(//a[@class='add-to-btn'])[1]")
	private WebElement C_SLB;
	
	@FindBy(xpath = "(//p[@class='fee_code'])[1]")
	private WebElement P_SLB;
	
	
	
	
	
	@FindBy(xpath="//a[text()='Budget 2021']")
	private WebElement budget;
	
	@FindBy(xpath = "(//ul[@class='list-unstyled ratings mb-1'])[2]")
	private WebElement R_budget;

	@FindBy(xpath = "(//p[@class='fee_code'])[2]")
	private WebElement P_budget;
	
	@FindBy(xpath = "(//a[@class='add-to-btn'])[2]")
	private WebElement C_budget;
	
	
	
	@FindBy(xpath="//a[text()='Project Management']")
	private WebElement pm;
	
	@FindBy(xpath = "(//ul[@class='list-unstyled ratings mb-1'])[3]")
	private WebElement R_pm;
	
	@FindBy(xpath = "(//p[@class='fee_code'])[3]")
	private WebElement P_pm;
	
	@FindBy(xpath = "(//a[@class='add-to-btn'])[3]")
	private WebElement C_pm;
	

	
	@FindBy(xpath="//a[text()='Electric Current ']")
	private WebElement ec;
	 
	@FindBy(xpath = "(//ul[@class='list-unstyled ratings mb-1'])[4]")
	private WebElement R_ec;
	
	@FindBy(xpath = "(//p[@class='fee_code'])[4]")
	private WebElement P_ec;
	
	@FindBy(xpath = "(//a[@class='add-to-btn'])[4]")
	private WebElement C_ec;
	
	
	
	@FindBy(xpath="//a[text()='BPSC 2020 Software']")
	private WebElement bp;
	 
	@FindBy(xpath = "(//ul[@class='list-unstyled ratings mb-1'])[5]")
	private WebElement R_bp;
	
	@FindBy(xpath = "(//p[@class='fee_code'])[5]")
	private WebElement P_bp;
	
	@FindBy(xpath = "(//a[@class='add-to-btn'])[5]")
	private WebElement C_bp;
	
	
	
	
	@FindBy(xpath="//a[text()='Budget 2020']")
	private WebElement bud;
	 
	@FindBy(xpath = "(//ul[@class='list-unstyled ratings mb-1'])[7]")
	private WebElement R_bud;
	
	@FindBy(xpath = "(//p[@class='fee_code'])[7]")
	private WebElement P_bud;
	
	@FindBy(xpath = "(//a[@class='add-to-btn'])[7]")
	private WebElement C_bud;
	
	
	
	
	@FindBy(xpath="//a[text()='Cricket Book']")
	private WebElement cb;
	
	@FindBy(xpath = "(//ul[@class='list-unstyled ratings mb-1'])[8]")
	private WebElement R_cb;
	
	@FindBy(xpath = "(//p[@class='fee_code'])[8]")
	private WebElement P_cb;
	
	@FindBy(xpath = "(//a[@class='add-to-btn'])[8]")
	private WebElement C_cb;
	
	
	
	
	@FindBy(xpath="//div[@class='list-view-button']")
	private WebElement listView;
	
	@FindBy(xpath="//div[@class='grid-view-button']")
	private WebElement GridView;
	
	
	//filter of the  Shop Our Book 
	
	@FindBy(xpath="//a[contains(text(),'Circket News')]")
	private WebElement circket_news;
	

	@FindBy(xpath="//a[contains(text(),'भारतीय इतिहास')]")
	private WebElement bhartya_itihas;
	

	@FindBy(xpath="(//a[contains(text(),'Physics')])[1]")
	private WebElement physics;
	

	@FindBy(xpath="//a[contains(text(),'Polity')]")
	private WebElement polity;
	

	@FindBy(xpath="//a[contains(text(),'Maths')]")
	private WebElement maths;
	

	@FindBy(xpath="//a[contains(text(),'All Category')]")
	private WebElement All_Category;
	
	
	
	public ShopOurBooksPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnViewAll()
	{
		viewall.click();
	}
	
	public void detail_OF_Software_Learning_BOOk()
	{
		 if( SLB.isDisplayed())
		 {
			 System.out.println("SoftwareLearning Book is Display ");
			 
				int h = SLB.getSize().getHeight();
				int w = SLB.getSize().getWidth();
			   System.out.println("hight of the Software Learning Book  Thumbnail is "+h);
			   System.out.println("width of the Software Learning Book Thumbnail  is "+w);
			   
			   R_SLB.isDisplayed();
			    System.out.println( "Review ratting is display ");
			    
			    P_SLB.isDisplayed();
			    System.out.println("Price is Display ");
			   
			    
			   
			   
			  SLB.click();
			  
			  
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
		

	
	}
	
	
	public void detail_OF_Budget_BOOk() throws InterruptedException
	{
		 if( budget.isDisplayed())
		 {
			 System.out.println("Budget Book is Display ");
			 
				int h = budget.getSize().getHeight();
				int w = budget.getSize().getWidth();
			   System.out.println("hight of the Budget Book  Thumbnail is "+h);
			   System.out.println("width of the BudgetLearning Book Thumbnail  is "+w);
				  Thread.sleep(500);
				  R_budget.isDisplayed();
				    System.out.println( "Review ratting is display ");
				    
				    
				    
				    P_budget.isDisplayed();
				    System.out.println("Price is Display ");
				   
				    

			  budget.click();
			  
			  Thread.sleep(500);
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
		

	
	}
	
	

	public void detail_OF_Project_Management_BOOk()
	{
		 if( pm.isDisplayed())
		 {
			 System.out.println("Project _Management Book is Display ");
			 
				int h = pm.getSize().getHeight();
				int w = pm.getSize().getWidth();
			   System.out.println("hight of the Project_ManagementThumbnail is "+h);
			   System.out.println("width of the Project_Management Book Thumbnail  is "+w);
			   R_pm.isDisplayed();
			    System.out.println( "Review ratting is display ");
			    
			    
			    P_pm.isDisplayed();
			    System.out.println("Price is Display ");
			   
			  

			   
			  pm.click();
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
	}
	
	
	public void detail_OF_ElectricCurrent_BOOk()
	{
		 if( ec.isDisplayed())
		 {
			 System.out.println("ElectricCurrent Book is Display ");
			 
				int h = ec.getSize().getHeight();
				int w = ec.getSize().getWidth();
			   System.out.println("hight of the ElectricCurrentThumbnail is "+h);
			   System.out.println("width of the ElectricCurrent Book Thumbnail  is "+w);
			   R_ec.isDisplayed();
			    System.out.println( "Review ratting is display ");
			   
			    
			    P_ec.isDisplayed();
			    System.out.println("Price is Display ");
			   
			    
			    
			  ec.click();
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
	}
	
	

	public void detail_OF_BPSC_BOOk()
	{
		 if( bp.isDisplayed())
		 {
			 System.out.println("BPSC Book is Display ");
			 
				int h = bp.getSize().getHeight();
				int w = bp.getSize().getWidth();
			   System.out.println("hight of the BPSC Thumbnail is "+h);
			   System.out.println("width of the BPSC Book Thumbnail  is "+w);
			   R_bp.isDisplayed();
			    System.out.println( "Review ratting is display ");
			    
			    P_bp.isDisplayed();
			    System.out.println("Price is Display ");
			   
			    

			    
			  bp.click();
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
	}
	
	public void detail_OF_Budget_2020_BOOk() throws InterruptedException
	{
		 if( bud.isDisplayed())
		 {
			 System.out.println("Budget_2020 Book is Display ");
			 
				int h = bud.getSize().getHeight();
				int w = bud.getSize().getWidth();
			   System.out.println("hight of the Budget_2020  Thumbnail is "+h);
			   System.out.println("width of the Budget_2020 Thumbnail  is "+w);
			   boolean r = R_bud.isDisplayed();
			    System.out.println( "Review ratting is display "+r);
			   
			    Thread.sleep(500);
			   boolean p = P_bud.isDisplayed();
			    System.out.println("Price is Display "+p);
			   
			   
			bud.click();  
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
	}
	
	
	public void detail_OF_circket_BOOk()
	{
		 if( cb.isDisplayed())
		 {
			 System.out.println("circket Book is Display ");
			 
				int h = cb.getSize().getHeight();
				int w = cb.getSize().getWidth();
			   System.out.println("hight of the circket  Thumbnail is "+h);
			   System.out.println("width of the circket Book Thumbnail  is "+w);
			   R_cb.isDisplayed();
			    System.out.println( "Review ratting is display ");
			   
			    
			    P_cb.isDisplayed();
			    System.out.println("Price is Display ");
			   
			      
			   

			   cb.click();
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
	}
	

	public void clickOnListView()
	{
		
		listView.click();
	}
	
	public void clickOnGridView()
	{
		
		GridView.click();
	}
	
	
	public void clickOn_filter_CircketNews()
	{
		
		circket_news.click();
	}
	
	public void clickOn_filter_BhartyaItiash()
	{
		
		bhartya_itihas.click();
	}
	
	public void clickOn_filter_physics()
	{
		
		physics.click();
	}
	
	
	public void clicoOn_filter_polity() {
		
		polity.click();
	}
	public void clickOn_filter_Maths()
	{
		
		maths.click();
	}
	
	
	public void clickOn_filter_AllCategory()
	{
		
		All_Category.click();
	}
	
	
	public void clickOn_AddTOCart_SoftwareLearningBook()
	{
		
		C_SLB.click();
	}
	
}
