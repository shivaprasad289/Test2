package generic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot extends BaseTest
{
	public static void getScreenShot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File(ScreenShot_path+name+".png");
		FileUtils.copyFile(src, desc);
	}
}
