package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.IAutoconst;
import generic.Lib;
import pom.LoginDemo;

public class LoginTest implements IAutoconst {
	
	@Test
	public void test()
	{
		WebDriver driver = new ChromeDriver();
		String url=Lib.getpropety(IAutoconst.CONFIG_PATH,"URL");
		driver.get(url);
		LoginDemo login = new LoginDemo(driver);
		String un=Lib.getcellvalue(IAutoconst.XL_PATH,"Sheet1",1,0);
		login.setUserName(un);
		String pw=Lib.getcellvalue(IAutoconst.XL_PATH,"Sheet1",1,1);
		login.setPassword(pw);
	}
	

}
