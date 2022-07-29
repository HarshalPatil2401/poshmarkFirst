package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class productPageMac {
	
	WebDriver driver;
	public productPageMac(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By laptop=By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]");
	public WebElement laptop()
	{
		return driver.findElement(laptop);
	}
	
	

}
