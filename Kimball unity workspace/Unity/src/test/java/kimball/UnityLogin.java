package kimball;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;

public class UnityLogin extends base {
	
	public static Logger log =LogManager.getLogger(UnityLogin.class.getName());
	Properties prop;
	FileInputStream fis;
	int i;
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{
		
		
		prop = new Properties();
		fis= new FileInputStream("D:\\selenium projects\\Kimball unity workspace\\Unity\\src\\main\\java\\kimball\\data.properties");
		prop.load(fis);
		LoginPage l= new LoginPage(driver);
		String User=prop.getProperty("Username");
		l.getUserName().sendKeys(User);
		log.debug("User provides username");
		l.getNextButton().click();
		String Password=prop.getProperty("Userpassword");
		l.getUserPassword().sendKeys(Password);
		log.debug("User provides password to login");
		Thread.sleep(5000);
		l.getSignInButton().click();
		log.debug("User clicks on signin button");
		l.getConfirmationNext().click();
		Thread.sleep(5000);
		for(int j=0;j<4;j++)
		{
		driver.navigate().refresh();
		
		}
		Thread.sleep(10000);
		String ClaimantName="Asnclln282, Asnclfn225";
		for(int i=0;i<=l.getCaseList().size();i++)
		{
			
			if(l.getCaseList().get(i).getText().equals(ClaimantName))
			{
				l.getCaseList().get(i).click();
				Thread.sleep(5000);
				break;
			}
		}
		log.info("User clicked on case");
		}

}
			
			
		
		
		
		

	    
	
	
		
	

	
	
	
	
	

