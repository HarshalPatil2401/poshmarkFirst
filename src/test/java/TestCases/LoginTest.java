package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.AccountPage;
import PageObject.LandingPage;
import PageObject.loginPage;
import Resources.Base;

public class LoginTest extends Base {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws Exception
	{
		driver = initiateDriver();
		driver.get(prop.getProperty("url"));
		// driver.get("http://www.tutorialsninja.com/demo/");
	}

	@Test(dataProvider = "loginData",priority=1)
	public void login(String usrname, String Password, String Expectedresult) throws Exception {
		
		LandingPage obj = new LandingPage(driver);
		obj.MyAcc().click();
		obj.login().click();

		Thread.sleep(1000);

		loginPage obj1 = new loginPage(driver);
		obj1.username().sendKeys(usrname);
		obj1.password().sendKeys(Password);
//		obj1.username().sendKeys(prop.getProperty("username"));    this is taken from data properties file
//		obj1.password().sendKeys(prop.getProperty("password"));
		obj1.login().click();

		AccountPage obj2 = new AccountPage(driver);

		String Actualresult;
		try 
		{
			Assert.assertTrue(obj2.info().isDisplayed());
			Actualresult="succesfull";
		} 
		catch (Exception e) 
		{
			Actualresult="failure";
		}
		
		Assert.assertEquals(Actualresult, Expectedresult);
		Thread.sleep(1000);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@DataProvider
	public Object[][] loginData() {

		Object[][] data = { { "arun.selenium@gmail.com", "Second@123", "succesfull" },
				{ "dummy@gmail.com", "dummy", "failure" } };
		return data;

	}

}
