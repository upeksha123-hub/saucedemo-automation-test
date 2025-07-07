package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	WebDriver driver;
	
	//Locators
	
	
		
	By username  = By.xpath("//*[@id=\"user-name\"]");
	By password  = By.xpath("//*[@id=\"password\"]");
	By loginButton = By.xpath("//*[@id=\"login-button\"]");
	
		
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver =driver;
	}
	
	//Actions
	
	public void Login(String user , String Pass)
	{
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(Pass);
		driver.findElement(loginButton).click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
