package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage2 {
	By LoginTab = By.xpath("/html/body/div/div/a");
	By Username = By.xpath("//*[@id=\"login\"]");
	By Password = By.xpath("//*[@id=\"password1\"]");
	By Password2 = By.xpath("//*[@id=\"password2\"]");
	By Login = By.xpath("//*[@id=\"submit\"]");
	public WebDriver driver;
public LoginPage2(WebDriver driver)
{
	this.driver=driver;
}
public void clickLoginLink()
{
	driver.findElement(LoginTab).click();
}
public void Username()
{
	driver.findElement(Username).sendKeys("AnusuyaNathan");
}
public void typePassword()
{
	driver.findElement(Password).sendKeys("Anusuya97");
}
public void typePassword2()
{
	driver.findElement(Password2).sendKeys("Anusuya97");
}
public void clickLoginButton()
{
	driver.findElement(Login).click();
}


}
