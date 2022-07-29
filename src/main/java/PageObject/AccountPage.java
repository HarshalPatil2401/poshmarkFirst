package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	WebDriver driver;
	public AccountPage(WebDriver driver)
	{
	       this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
    By info=By.xpath("//a[contains(text(),'Edit your account information')]");
    public WebElement info()
    {
    	return driver.findElement(info);
    }
	

}
