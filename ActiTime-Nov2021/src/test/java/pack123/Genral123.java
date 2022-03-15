package pack123;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Genral123 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite 123");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test 123");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before classs 123");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method 123");
	}
	
	@Test 
	public void testC() {
		System.out.println("tes C 123");
	}
	
	@Test 
	public void testD() {
		System.out.println("tes D 123 ");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after classs 123");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test 123");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite 123");
	}
	
}
