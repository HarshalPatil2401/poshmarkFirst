package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.specialsPage;
import Resources.Base;

public class TestSpecialFeature extends Base {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception
	{
		driver=initiateDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void TestFeature() throws Exception
	{
		LandingPage lp = new LandingPage(driver);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", lp.special());
		Thread.sleep(3000);
		lp.special().click();
		specialsPage sp = new specialsPage(driver);
		Thread.sleep(3000);
		Assert.assertTrue(sp.Offer().isDisplayed());
				
				
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
