package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class specialsPage {
	WebDriver driver;
	public specialsPage(WebDriver driver)
	{
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h2[contains(text(),'Special Offers')]")
	WebElement spoffer;
	public WebElement Offer()
	{
		return spoffer;
	}

}
