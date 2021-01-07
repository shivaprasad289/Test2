package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name = "pwd")
	private WebElement pwd;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgnbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() 
	{
		return username;
	}

	public void setUsername(String un) 
	{
		username.sendKeys(un);
	}

	public WebElement getPwd() 
	{
		return pwd;
	}

	public void setPwd(String pw)
	{
		pwd.sendKeys(pw);
	}

	public void setLgnbtn()
	{
		lgnbtn.click();
	}
}
