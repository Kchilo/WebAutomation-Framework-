package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import reusableComponents.PropertiesOperations;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;



public class TestBase {
	BrowserFactory bf = new BrowserFactory();
	
	
	
	@BeforeMethod
	public void LaunchApplication() throws Exception {
		String browser = PropertiesOperations.getPropertyValueByKey("browser");
		String url = PropertiesOperations.getPropertyValueByKey("url");
		
		
		DriverFactory.getInstance().setDriver(bf.createBrowserInstance(browser));
		
		WebDriver driver = DriverFactory.getInstance().getDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(url);
		
	}
	
//	@AfterMethod 
	//public void tearDown() {
		//DriverFactory.getInstance().closeBrowser();
	}

//}



