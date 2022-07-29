package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.LandingPage;
import PageObject.RegisterPage;
import Resources.Base;

public class RegisterTest extends Base {
	
	WebDriver driver;
	@BeforeTest
	public void SetUp() throws Exception
	{
		driver=initiateDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(priority=2)
	public void RegisterPage() throws Exception
	{
		LandingPage obj = new LandingPage(driver);
		obj.MyAcc().click();
		obj.register().click();
		
		RegisterPage obj1=new RegisterPage(driver);
		
		obj1.FirstName().sendKeys(prop.getProperty("firstName"));
		//obj1.FirstName().sendKeys("Harshal");
		
		obj1.lastName().sendKeys(prop.getProperty("LastName"));
		obj1.Email().sendKeys(prop.getProperty("Email"));
		obj1.telephone().sendKeys(prop.getProperty("telephone"));
		obj1.password().sendKeys(prop.getProperty("pass"));
		obj1.confirmPass().sendKeys(prop.getProperty("pass"));
		obj1.okTick().click();
		
		Thread.sleep(3000);
		//obj1.continued().click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	

}
