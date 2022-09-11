package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
	       this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement MyAccount;
	
	public WebElement MyAcc()
	{
		return MyAccount;
	}
	
	By login = By.xpath("//a[contains(text(),'Login')]");
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	By register=By.xpath("//a[contains(text(),'Register')]");
	public WebElement register()
	{
		return driver.findElement(register);
	}
	
	@FindBy (xpath="//a[contains(text(),'Specials')]")
	WebElement special;
	public WebElement special()
	{
		return special;
	}
	
	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement desktops;
	public WebElement desktop()
	{
		return desktops;
	}
	
	@FindBy(xpath="//a[contains(text(),'Mac (1)')]")
	WebElement mac;
	public WebElement product1()
	{
		return mac;
	}
	
	@FindBy(xpath="//a[contains(text(),'iMac')]")
	WebElement product1click;
	public WebElement mac()
	{
		return product1click;
	}
	
	@FindBy(xpath="(//*[@title=\"iMac\"])[1]")
	WebElement verify;
	public WebElement verify()
	{
		return verify;
	}

}
