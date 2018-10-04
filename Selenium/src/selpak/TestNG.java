package selpak;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeSuite
	public void setUP()
	{
		//System.setProperty("web driver chrome driver", value)
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("Launch Chrome Brouser");
		
	}
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("enter URL");
	}
	
	
	@BeforeTest
	public void login()
	{
		System.out.println("Login Method");
	}
	
	@Test
	public void googleTitleTest()
	{
		System.out.println("Google title test");
		
	}
	@AfterMethod()
	public void logOut()
	{
		System.out.println("Logout from APP");
	}
	
	@AfterTest
	public void DeleteAllCookies()
	{
		System.out.println("Delete all cookies");
	}
	
	@AfterClass
	public void ClassBrouser()
	{
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Generate Test Report");
	}

}
