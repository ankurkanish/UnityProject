package kimball;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	 public static WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("D:\\selenium projects\\Kimball unity workspace\\Unity\\src\\main\\java\\kimball\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		}
		else if(browserName.equals("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		}
		else if(browserName.equals("IE"))
		{
		WebDriverManager.iedriver().setup();
		 driver = new InternetExplorerDriver();
		 driver.manage().window().maximize();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;	
				
				
				
				
	}
	
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile= System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
	
	

}
