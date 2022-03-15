package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy (xpath = "//input[@name='username']") 
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='pwd']") 
	private WebElement password ;
	
	@FindBy (xpath = "//input[@name='remember']") 
	private WebElement keepMeLoginCheckbox ;
	
	@FindBy (xpath = "//a[@id='loginButton']") 
	private WebElement login ;
	
	@FindBy (xpath = "//a[@id='loginButton']") 
	private WebElement loginButton ;
	
	private WebDriver driver ;
	private WebDriverWait wait ;
	private Actions actions;
	
	public LoginPage(WebDriver driver) // driver = driver =new chromeDriver()
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver,20);  // 20 sec
		actions = new Actions(driver); 
	}
	
	public void sendUserName(String user) {

		userName.sendKeys(user);
	}
	
	public void sendPasswordName(String pass) {

		password.sendKeys(pass);
	}
	
	public void clickOnkeepMeLogin() {

			keepMeLoginCheckbox.click();
		
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public String  getTextonLoginButton() {
		String loginText = login.getText();
		return  loginText;
	}
	
	public void loginToApplication() {
		userName.sendKeys("admin");
		password.sendKeys("manager");
		if(  !(keepMeLoginCheckbox.isSelected()) )
		{
			keepMeLoginCheckbox.click();
		}
		else
		{
			System.out.println("keep Me Login Checkbox already selected");
		}
		login.click();
	}
	
	
	
	
	
}
