package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
    
    WebDriver driver = null;
    
    @FindBy(xpath = "//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='Dashboard']")
    WebElement sidebarMenu_Dahboard;
    
    @FindBy(xpath = "//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='Projects']")
    WebElement sidebarMenu_project;
    
    @FindBy(xpath = "//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='Task']")
    WebElement sidebarMenu_Tasks;
    
    @FindBy(xpath = "//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='Users']")
    WebElement sidebarMenu_Users;
    
    // Initialize all page Objects for given driver instance
    
    public HomePageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    
    public void clickOnSidesMenu(String menu) {
        String MenuXpath = "//ul[@class='page-sidebar-menu']//i/following-sibling::span[text()='" + menu.trim() + "']";
        driver.findElement(By.xpath(MenuXpath)).click();
    }
}