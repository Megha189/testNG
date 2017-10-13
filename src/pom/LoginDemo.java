package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.LoginTest;

public class LoginDemo  extends LoginTest{
	@FindBy(name="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement passTB;
	private WebElement loginTB;
	public LoginDemo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		passTB.sendKeys(pw);
	}

}
