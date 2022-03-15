package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {

	@FindBy (xpath = "//div[text()='Time-Track12334']")  ////div[text()='Time-Track']
	private WebElement timeTrack ;
	
	@FindBy (xpath = "//div[text()='Tasks']") 
	private WebElement task ;
	
	@FindBy (xpath = "//a[@class='content reports']") 
	private WebElement report ;
	
	@FindBy (xpath = "//a[@class='content users']") 
	private WebElement user ;
	
	@FindBy (xpath = "//a[text()='Logout']") 
	private WebElement logout ;
	
	public ApplicationHeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openTimeTrackPage() {
		timeTrack.click();
	}
	
	public void openTaskPage() {
		task.click();
	}
	
	public void openReportPage() {
		report.click();
	}
	
	public void openUserPage() {
		user.click();
	}
	public void clickOnLogout() {
		logout.click();
	}
}
