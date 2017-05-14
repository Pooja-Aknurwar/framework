package TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.HomePage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyHomePage 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = BrowserFactory.getBrowser("Chrome");
		driver.get(DataProviderFactory.getConfig().getURL());		
	}
	
	@Test
	public void verifyHomePageLogin()
	{
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		String Actual = homepage.getApplicationTitle();
		String Expected = "Avactis Demo Store";
		Assert.assertEquals(Actual, Expected,"Page Title is not as expected");		
	}
	
/*	@AfterMethod
	public void tearDown(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			CaptureScreenShot.captureScreenShotTaken(driver, result.getName());
		}
		
	}
*/

	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
}
