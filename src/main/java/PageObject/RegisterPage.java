package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	By firstName=By.xpath("//input[@id='input-firstname']");
	public WebElement FirstName()
	{
		return driver.findElement(firstName);
	}
	
	By lastName =By.xpath("//input[@id='input-lastname']");
	public WebElement lastName()
	{
		return driver.findElement(lastName);
	}
	
	By email =By.xpath("//input[@id='input-email']");
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	By telephone =By.xpath("//input[@id='input-telephone']");
	public WebElement telephone()
	{
		return driver.findElement(telephone);
	}
	
	By pasword=By.xpath("//input[@id='input-password']");
	public WebElement password()
	{
		return driver.findElement(pasword);
	}
	
	By cnfpass=By.xpath("//input[@id='input-confirm']");
	public WebElement confirmPass ()
	{
		return driver.findElement(cnfpass);
	}
	
	By oktick =By.xpath("//*[@name='agree']");
	public WebElement okTick()
	{
		return driver.findElement(oktick);
	}
	
	By continues =By.xpath("//*[@value='Continue']");
	public WebElement continued()
	{
		return driver.findElement(continues);
	}
	
			
	

}
