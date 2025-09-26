package utilityLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

	  public static WebDriver getDriver(String driverName)
	  {
		  if(driverName.equalsIgnoreCase("Chrome"))
		  {
			 //WebDriver driver = new ChromeDriver();
			 // return driver;
			  return new ChromeDriver();
		  }
		  else if (driverName.equalsIgnoreCase("Edge"))
		  {
			  return new EdgeDriver();
		  }
		  
		  else if(driverName.equalsIgnoreCase("incognito"))
		  {
			 // ChromeOptions opt = new ChromeOptions();
			  //opt.addArguments("--incognito");
			 // WebDriver driver = new ChromeDriver(opt);
			 // return driver;
			  
			  return new ChromeDriver(new ChromeOptions().addArguments("--incognito"));
		  }
		  
		  else if (driverName.equalsIgnoreCase("headless"))
		  {
			  return new ChromeDriver(new ChromeOptions().addArguments("--headless"));
		  }
		  else
		  {
			  System.err.println("Please enter valid driver name.");
			  return null;
		  }

	  }
	
}
