package utilityLayer;

import org.openqa.selenium.WebElement;



public class HandleWebElement {

	public static void sendKeys(WebElement wb, String expectedValue)
	{    
		//WebElement wb = driver.findElement(By.name(""));
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(expectedValue);;
		
	     WaitUtils.visibilityOfElement(wb).sendKeys(expectedValue);	
	}
	
	public static void click(WebElement wb)
	{
		WaitUtils.clickElement(wb).click();
	}
	
	public static String getText(WebElement wb)
	{
		return WaitUtils.visibilityOfElement(wb).getText();
	}
}
