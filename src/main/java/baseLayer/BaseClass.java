package baseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import utilityLayer.DriverFactory;



public class BaseClass {

protected static WebDriver driver;
	
	public static void initialization(String driverName)
	{
		driver = DriverFactory.getDriver(driverName);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

}

	
}
