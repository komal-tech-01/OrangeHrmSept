package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.HandleWebElement;



public class LoginPage extends BaseClass{

	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement login;
	
	
	public LoginPage() 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginPageFunctionality(String userName, String passWord)
	{
		HandleWebElement.sendKeys(username, userName);
		
		HandleWebElement.sendKeys(password, passWord);
		
		HandleWebElement.click(login);
		
	}
}
