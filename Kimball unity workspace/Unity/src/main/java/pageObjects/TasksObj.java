package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TasksObj {
	
public WebDriver driver;
	
	By TasksTab= By.xpath("//*[@class='row unity-summary sticky-nav']//li[2]");
	By CreateTaskButton= By.xpath("//*[@id='tasks']//*[text()='Create New Task']");
	By PriorityButton= By.xpath("//*[@id='tasks']//*[text()='High']");
	By DueDate= By.xpath("//*[@formcontrolname='dueDate']//input");
	By Subject= By.xpath("//*[@formcontrolname='subject']//input");
	By Description= By.xpath("//*[@formcontrolname='taskDescription']//textarea");
	By SaveButton= By.xpath("//*[@id='tasks']//*[text()='Save']");
	By ActiveDueDate= By.xpath("//*[@id='tasks']//*[@class='btn btn-sm btn-info active btn-default']");
	
	
	public TasksObj(WebDriver driver) {
	
		this.driver=driver;
		
	}

	public WebElement getTasksTab()
	{
		return driver.findElement(TasksTab);
	}
	public WebElement getCreateTaskButton()
	{
		return driver.findElement(CreateTaskButton);
	}
	public WebElement getPriorityButton()
	{
		return driver.findElement(PriorityButton);
	}
	public WebElement getDueDate()
	{
		return driver.findElement(DueDate);
	}
	public WebElement getSubject()
	{
		return driver.findElement(Subject);
	}
	public WebElement getDescription()
	{
		return driver.findElement(Description);
	}
	public WebElement getSaveButton()
	{
		return driver.findElement(SaveButton);
	}
	public WebElement getActiveDueDate()
	{
		return driver.findElement(ActiveDueDate);
	}
	
	
	

}
