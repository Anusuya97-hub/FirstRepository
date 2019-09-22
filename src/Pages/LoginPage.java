package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	By LoginTab = By.xpath("/html/body/div[5]/div[1]/div[1]/ul/li[5]/a");
	By Username = By.xpath("//*[@id=\"wpName1\"]");
	By Password = By.xpath("//*[@id=\"wpPassword1\"]");
	By Login = By.xpath("//*[@id=\"wpLoginAttempt\"]");
	public WebDriver driver;
public LoginPage(WebDriver driver)
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
public void clickLoginButton()
{
	driver.findElement(Login).click();
}
}
