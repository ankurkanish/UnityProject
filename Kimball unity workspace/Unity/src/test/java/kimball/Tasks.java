package kimball;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.TasksObj;

public class Tasks extends base {
	public WebDriver driver;
	
	public static Logger log =LogManager.getLogger(Tasks.class.getName());
	Properties prop;
	FileInputStream fis;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		prop = new Properties();
		fis= new FileInputStream("D:\\selenium projects\\Kimball unity workspace\\Unity\\src\\main\\java\\kimball\\data.properties");
		prop.load(fis);
		driver=initializeDriver();
		log.info("driver is initialized");
		String URLName=prop.getProperty("URL");
		driver.get(URLName);
		log.info("Navigated to login page");
	}
	
	@Test
	public void CreateTasks() throws IOException, InterruptedException
	{
		
		UnityLogin Login= new UnityLogin();
		Login.basePageNavigation();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		TasksObj Tsk = new TasksObj(driver);
		Tsk.getTasksTab().click();
		log.debug("user clicks on task tab");
	    log.info("user is navigated under task tab");
		Tsk.getCreateTaskButton().click();
		log.debug("user clicks on Create task button");
		Tsk.getPriorityButton().click();
		Tsk.getDueDate().click();
		Tsk.getActiveDueDate().click();
		Tsk.getSubject().sendKeys("SubjectQA Test");
		Tsk.getDescription().sendKeys("QA description");
		Tsk.getSaveButton().click();
		log.info("User successfully created task");
		
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}

}
