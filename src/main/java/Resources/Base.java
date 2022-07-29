package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initiateDriver() throws Exception
	{
		
	    prop = new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/Harshal/eclipse-workspace/poshMark/src/main/java/Resources/data.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"));
		{
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public static void takesScreenShot(String testMethodName)
	{
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   try {
		FileHandler.copy(src, new File("C:/Users/Harshal/eclipse-workspace/poshMark/src/main/"+testMethodName+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}
	
	
	
	

}
