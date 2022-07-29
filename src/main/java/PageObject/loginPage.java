package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;
	public loginPage(WebDriver driver)
	{
	       this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By username=By.xpath("//input[@id='input-email']");
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	By password=By.xpath("//input[@id='input-password']");
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	By login=By.xpath("//*[@value='Login']");
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	

}
