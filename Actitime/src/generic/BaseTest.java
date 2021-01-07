package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoContext
{
	static
	{
		System.setProperty(chrome_path,chrome_value);
	}
	
	public static WebDriver driver;
	@BeforeMethod
	public void launchBrowser()
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(tim,TimeUnit.SECONDS);
		driver.get(path);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
