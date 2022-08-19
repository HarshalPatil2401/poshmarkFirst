package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.Base;

public class TestProduct extends Base{
	
	WebDriver driver;
	@BeforeMethod
	public void Stetup() throws Exception
	{
		driver=initiateDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void Testproducts()
	{
		LandingPage lp = new LandingPage(driver);
		lp.desktop().click();
		lp.product1().click();
		lp.mac().click();
		Assert.assertTrue(lp.verify().isDisplayed());
		
	}
	@BeforeMethod
	public void teardown()
	{
		driver.close();
	}
	
	
	

}
