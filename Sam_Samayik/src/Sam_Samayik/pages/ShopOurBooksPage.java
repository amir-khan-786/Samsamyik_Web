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
	
	
	@FindBy(className = "list-unstyled ratings mb-1")
	private WebElement ratting;
	

	@FindBy(className = "fee_code")
	private WebElement price;
	
	
	@FindBy(xpath="//a[text()='Budget 2021']")
	private WebElement budget;
	
	
	@FindBy(xpath="Project Management")
	private WebElement pm;
	

	@FindBy(xpath="Electric Current")
	private WebElement ec;
	 
	@FindBy(xpath="BPSC 2020 Software")
	private WebElement bp;
	 
	@FindBy(xpath="Budget 2020")
	private WebElement bud;
	 
	@FindBy(xpath="Cricket Book")
	private WebElement cb;
	
	
	
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
			  SLB.click();
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
		

	
	}
	
	
	public void detail_OF_Budget_BOOk()
	{
		 if( budget.isDisplayed())
		 {
			 System.out.println("Budget Book is Display ");
			 
				int h = budget.getSize().getHeight();
				int w = budget.getSize().getWidth();
			   System.out.println("hight of the Budget Book  Thumbnail is "+h);
			   System.out.println("width of the BudgetLearning Book Thumbnail  is "+w);
			  budget.click();
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
			  bp.click();
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
	}
	
	public void detail_OF_physic_BOOk()
	{
		 if( bud.isDisplayed())
		 {
			 System.out.println("physic Book is Display ");
			 
				int h = bud.getSize().getHeight();
				int w = bud.getSize().getWidth();
			   System.out.println("hight of the physic  Thumbnail is "+h);
			   System.out.println("width of the physic Book Thumbnail  is "+w);
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
			   cb.click();
		 }
		 
		 else 
		 {
			 System.out.println("Book is not Display ");
		 }
	}
	
	
}
