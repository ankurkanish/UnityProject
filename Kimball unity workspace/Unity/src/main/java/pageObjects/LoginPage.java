package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	public WebDriver driver;
	
	By UserName= By.id("i0116");
	By UserPassword= By.id("i0118");
	By NextButton= By.id("idSIButton9");
	By SignInButton= By.id("idSIButton9");
	By ConfirmationNext= By.id("idSIButton9");
	By CaseList= By.xpath("//*[@class='k-grid-table']//td[1]");
	
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getUserName()
	{
		return driver.findElement(UserName);
	}
	public WebElement getNextButton()
	{
		return driver.findElement(NextButton);
	}
	public WebElement getUserPassword()
	{
		return driver.findElement(UserPassword);
	}
	public WebElement getSignInButton()
	{
		return driver.findElement(SignInButton);
	}
	public WebElement getConfirmationNext()
	{
		return driver.findElement(ConfirmationNext);
	}
	public List<WebElement> getCaseList()
	{
		return driver.findElements(CaseList);
	}
	

	
}
