package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.HomePage;
import ApplicationPages.LoginPage;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;

public class VerifyLoginPage 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = BrowserFactory.getBrowser("Chrome");
		driver.get(DataProviderFactory.getConfig().getURL());		
	}
	
	@Test
	public void verifySuccessfulLogin()
	{
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		String Actual = homepage.getApplicationTitle();
		String Expected = "Avactis Demo Store";
		Assert.assertEquals(Actual, Expected,"Page Title is not as expected");		
		
		homepage.clickLogin();
		
		LoginPage Login = PageFactory.initElements(driver, LoginPage.class);
		Login.verifyLoginPage(DataProviderFactory.getExcel().getData(0, 1, 0),DataProviderFactory.getExcel().getData(0, 1, 1));
		Login.verifyDashboardTitle();
	}
	
	@AfterMethod
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
	}
	
	
	
	
}
