package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.HandleWebElement;

public class PimPage extends BaseClass{

	
	
	@FindBy(xpath="//span[text()='PIM']")
	WebElement clickPim;
	

	public PimPage() 
	{
		PageFactory.initElements(driver,this);
	}
	

	public void clickOnPimPage()
	{
		HandleWebElement.click(clickPim);
		
		
	}

}
