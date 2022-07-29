package TestCases;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObject.productPageMac;
import Resources.Base;


public class productTest extends Base {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception
	{
		driver = initiateDriver();
		driver.get(prop.getProperty("url"));
		// driver.get("http://www.tutorialsninja.com/demo/");
	}
	
	@Test
	public void ProductTest() throws InterruptedException
	{
		productPageMac obj = new productPageMac(driver);
		obj.laptop().click();
		Thread.sleep(3000);
	    //Select sel = new Select(obj.laptop());
	    //sel.selectByVisibleText("mac(1)");
	    Assert.assertTrue(false);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
