package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class VerifyLogin {
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=User%3AAnusuyaNathan");
		LoginPage login = new LoginPage(driver);
		login.clickLoginLink();
		login.Username();
		login.typePassword();
		login.clickLoginButton();
		
	}
	

}
