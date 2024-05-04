package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
    
    // Create WebDriver object
    public WebDriver createBrowserInstance(String browser) {
        
        WebDriver driver = null;
        
        if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions eOptions = new EdgeOptions();
            eOptions.setCapability("ms:inPrivate", true); // Start in private mode
            driver = new EdgeDriver(eOptions);
        

            
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            InternetExplorerOptions ieOptions = new InternetExplorerOptions();
            ieOptions.addCommandSwitches("-private"); // Start in private mode
            driver = new InternetExplorerDriver(ieOptions);
            
        }
        
        return driver;
        
    }

}
