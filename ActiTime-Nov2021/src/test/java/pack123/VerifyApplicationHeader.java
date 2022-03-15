package pack123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browser;
import pom.ApplicationHeaderPage;
import pom.LoginPage;
import utils.Utility;

public class VerifyApplicationHeader extends Browser{
	
	private WebDriver driver ;
	private ApplicationHeaderPage applicationHeaderPage ;
	private LoginPage loginPage ;
	SoftAssert soft;
	
	String testID; 
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowsr(String browserName) {
		System.out.println(" launchBrowsr ");
		if(browserName.equals("Chrome"))
		{
			driver = launchChromeBrowser();
		}
		if(browserName.equals("Firefox"))
		{
			driver = launchFirefoxBrowser();
		}
		if(browserName.equals("Opera"))
		{
			driver = launchOperaBrowser();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@BeforeClass
	public void creatObjectOdPOMClasses() {
		loginPage = new LoginPage(driver);
		applicationHeaderPage = new ApplicationHeaderPage(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException {
		System.out.println(" loginToApplication");
		driver.get("http://desktop-b2220qc/login.do");
		
		String user = Utility.getDataFromExcel("EquityData", 1, 0);
		String password = Utility.getDataFromExcel("EquityData", 1, 1);
		
		String keywaord = Utility.getDataFromExcel("EquityData", 1, 1);
		
		if(keywaord.equals("Positive"))
		{
			loginPage.sendUserName("amin");
			loginPage.sendPasswordName("manager");
		
			loginPage.clickOnkeepMeLogin();
			loginPage.clickOnLogin();
		}
		
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyUserTab() {
		testID = "1101";
		soft = new SoftAssert();
		
		System.out.println(" verifyUserTab");
		applicationHeaderPage.openUserPage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		
		String text = loginPage.getTextonLoginButton();
		soft.assertEquals(text,"Login");
		
		soft.assertEquals(url, "http://desktop-b2220qc/administration/", "User Tab URL is wrong");
		soft.assertEquals(title, "actiTIME - ", "User Tab Title is wrong");
		
		soft.assertAll();
	}
	
	@Test(enabled = false)
	public void verifyReportButton() {
		testID = "1102";
		soft = new SoftAssert();
		
		System.out.println(" verifyReportButton");
		applicationHeaderPage.openReportPage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
	
		soft.assertEquals(url, "http://desktop-b2220qc/administration/", "User Tab URL is wrong");
		soft.assertEquals(title, "actiTIME - ", "User Tab Title is wrong");

		soft.assertAll();
	}
	
	@AfterMethod
	public void logOut(ITestResult result) {
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.screeshot(driver, testID);
		}
		
		System.out.println(" logOut");
		applicationHeaderPage.clickOnLogout();
		
	}
	
	@AfterClass
	public void clearPOMObject() {
		applicationHeaderPage = null;
		loginPage = null;
				
	}
	@AfterTest
	public void closedBrowser() {
		System.out.println(" closedbrowser");
		driver.quit();
		driver = null;
		System.gc(); // Delete the all object without refreances. 
	}
	
	
	DIT -   http://dit-facebbok.com
	SIT -   http://sit-facebbok.com
	QA  -   http://qa-facebbok.com
	SG  -   http://sg-facebbok.com
	
		
		http://facebbok.com
	
	
	
	

}
