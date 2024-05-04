package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	@FindBy(name= "username" )
	WebElement txt_name;
	
	@FindBy(name= "password" )
	WebElement txt_password;

	@FindBy(xpath=" //button[@type = 'submit and text()='Login ']")
	WebElement btn_login;
	
	//Initialize all page Objects for given driver instance
public LoginPageObjects(WebDriver driver) {
	PageFactory.initElements(driver,this);
}	
 
//login to App
public void login(String username,String password) {
	txt_name.sendKeys(username);
	txt_password.sendKeys(password);
	btn_login.click();
}

}