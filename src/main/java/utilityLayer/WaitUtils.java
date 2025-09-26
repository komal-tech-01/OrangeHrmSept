package utilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLayer.BaseClass;

public class WaitUtils extends BaseClass{

	
	public static WebElement visibilityOfElement(WebElement wb)
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		//return wait.until(ExpectedConditions.visibilityOf(wb));
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until
				(ExpectedConditions.visibilityOf(wb));
	}
	
	public static List<WebElement>visibilityOfAllElement(List<WebElement>listValues)
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until
				(ExpectedConditions.visibilityOfAllElements(listValues));
	}
	
	public static WebElement clickElement(WebElement wb)
	{
	   return new WebDriverWait(driver,Duration.ofSeconds(30)).until
			   (ExpectedConditions.elementToBeClickable(wb));	
	}
	
	public static Alert alertIsPresent()
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until
				   (ExpectedConditions.alertIsPresent());	 
	}
	
	public static WebDriver frameToBeSwitch(String idOrName)
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until
				   (ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}
	
	public static WebDriver frameToBeSwitch(int index)
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until
				   (ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	
	public static WebDriver frameToBeSwitch(WebElement wb)
	{
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until
				   (ExpectedConditions.frameToBeAvailableAndSwitchToIt(wb));
	}

}
