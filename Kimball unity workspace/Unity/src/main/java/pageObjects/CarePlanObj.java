package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarePlanObj {
	
	public WebDriver driver;
	
	By CarePlanTab= By.xpath("//*[@class='row unity-summary sticky-nav']//li[4]");
	By AnticipatedCaseButton= By.xpath("//*[@id='anticipated-case-results']//div[3]/div/div/div[1]/button");
	By AnticipateSuggestDropdown= By.xpath("//*[@valueattribute='description']//*[@class='form-control select-placeholder ng-untouched ng-pristine ng-valid']");
	By AntiCipatedTargetDate= By.xpath("//*[@formcontrolname='targetDate']//input");
	By AntiCipatedActiveDate= By.xpath("//*[@class='btn btn-sm active btn-default']");
	By AntiCipatedSaveButton= By.xpath("//*[@id='anticipated-case-results']//*[text()='Save']");
	By AntiCipatedSavedAssert= By.xpath("//*[@id='anticipated-case-results']//*[text()=' The Claimant will reach MMI ']");
	By CaseManagementButton= By.xpath("//*[@id='case-mgmt-issues']//div[3]/div/div/div[1]/button");
	By CaseManageSuggestDropdown= By.xpath("//*[@valueattribute='description']//*[@class='form-control select-placeholder ng-untouched ng-pristine ng-valid']");
	By DateIdentifiedDate= By.xpath("//*[@formcontrolname='dateIdentified']//input");
	By CaseManagementSaveButton= By.xpath("//*[@id='case-mgmt-issues']//*[text()='Save']");
	By CaseManageSavedAssert=By.xpath("//*[@id='case-mgmt-issues']//*[text()=' Alteration in comfort related to ']");
	By CaseManagementGoalButton= By.xpath("//*[@id='case-mgmt-goals']//div[3]/div/div/div[1]/button");
	By CaseMGoalType= By.xpath("//*[@formcontrolname='goalTypeLegacyId']//select");
	By CaseManageGoalSuggestDropdown= By.xpath("//*[@formcontrolname='goal']//*[@class='form-control select-placeholder ng-untouched ng-pristine ng-valid']");
	By CaseMStatusDropDown= By.xpath("//*[@formcontrolname='goalStatusLegacyId']//select");
	By CaseNotMetReason = By.xpath("//*[@formcontrolname='notMetReason']//textarea");
	By CaseMGoalSaveButton= By.xpath("//*[@id='case-mgmt-goals']//*[text()='Save']");
	By CaseManageGoalSavedAssert=By.xpath("//*[@id='case-mgmt-goals']//*[text()=' Claimant will improve and begin to display a positive attitude towards vocational services']");
	
	
	public CarePlanObj(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getCarePlanTab()
	{
		return driver.findElement(CarePlanTab);
	}
	public WebElement getAnticipatedCaseButton()
	{
		return driver.findElement(AnticipatedCaseButton);
	}
	public WebElement getAnticipateSuggestDropdown()
	{
		return driver.findElement(AnticipateSuggestDropdown);
	}
	public WebElement getAntiCipatedTargetDate()
	{
		return driver.findElement(AntiCipatedTargetDate);
	}
	public WebElement getAntiCipatedActiveDate()
	{
		return driver.findElement(AntiCipatedActiveDate);
	}
	public WebElement getAntiCipatedSaveButton()
	{
		return driver.findElement(AntiCipatedSaveButton);
	}
	public WebElement getAntiCipatedSavedAssert()
	{
		return driver.findElement(AntiCipatedSavedAssert);
	}
	public WebElement getCaseManagementButton()
	{
		return driver.findElement(CaseManagementButton);
	}
	public WebElement getCaseManageSuggestDropdown()
	{
		return driver.findElement(CaseManageSuggestDropdown);
	}
	public WebElement getDateIdentifiedDate()
	{
		return driver.findElement(DateIdentifiedDate);
	}
	public WebElement getCaseManagementSaveButton()
	{
		return driver.findElement(CaseManagementSaveButton);
	}
	public WebElement getCaseManageSavedAssert()
	{
		return driver.findElement(CaseManageSavedAssert);
	}
	public WebElement getCaseManagementGoalButton()
	{
		return driver.findElement(CaseManagementGoalButton);
	}
	public WebElement getCaseMGoalType()
	{
		return driver.findElement(CaseMGoalType);
	}
	public WebElement getCaseMStatusDropDown()
	{
		return driver.findElement(CaseMStatusDropDown);
	}
	public WebElement getCaseNotMetReason()
	{
		return driver.findElement(CaseNotMetReason);
	}
	public WebElement getCaseMGoalSaveButton()
	{
		return driver.findElement(CaseMGoalSaveButton);
	}
	public WebElement getCaseManageGoalSuggestDropdown()
	{
		return driver.findElement(CaseManageGoalSuggestDropdown);
	}
	public WebElement getCaseManageGoalSavedAssert()
	{
		return driver.findElement(CaseManageGoalSavedAssert);
	}
	
}
