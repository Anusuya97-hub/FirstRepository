package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.LoginPage2;


public class VerifyLogin2 {
	@Test
	public void loginTest2()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://thawing-shelf-73260.herokuapp.com/index.jsp");
		LoginPage2 login = new LoginPage2(driver);
		login.clickLoginLink();
		login.Username();
		login.typePassword();
		login.typePassword2();
		login.clickLoginButton();
		
	}

}
