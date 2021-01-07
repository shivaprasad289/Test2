package Test;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import POM.LoginPage;
import generic.BaseTest;
import generic.MethodDriven;

@Listeners(generic.TestListener.class)
public class TestloginPage extends BaseTest
{
	@Test
	public void Login() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		String username = MethodDriven.getDataFromExcel(1,0);
		String pwd = MethodDriven.getDataFromExcel(1,1);
		String expectedtitle = MethodDriven.getDataFromExcel(1,2);
		String expectedtitle1 = MethodDriven.getDataFromExcel(2,2);
		LoginPage l = new LoginPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(expectedtitle));
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle,expectedtitle);
		l.setUsername(username);
		l.setPwd(pwd);
		l.setLgnbtn();
		wait.until(ExpectedConditions.titleContains(expectedtitle1));
		String actualtitle1 = driver.getTitle();
		Assert.assertEquals(actualtitle1,expectedtitle1);
	}
	
	
	@Test
	public void Login1() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		String username = MethodDriven.getDataFromExcel(1,0);
		String pwd = MethodDriven.getDataFromExcel(1,1);
		String expectedtitle = MethodDriven.getDataFromExcel(1,2);
		String expectedtitle1 = MethodDriven.getDataFromExcel(2,2);
		LoginPage l = new LoginPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains(expectedtitle));
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle,expectedtitle);
		l.setUsername(username);
		l.setPwd(pwd);
		l.setLgnbtn();
		wait.until(ExpectedConditions.titleContains(expectedtitle1));
		String actualtitle1 = driver.getTitle();
		Assert.assertEquals(actualtitle1,expectedtitle1);
	}
}
