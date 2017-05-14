package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Factory.DataProviderFactory;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage (WebDriver mdriver)
	{
		this.driver = mdriver;
	}
	
	@FindBy(id=".//*[@id='account_sign_in_form_email_id']")
	@CacheLookup
	WebElement Userid;
	
	@FindBy(id =".//*[@id='account_sign_in_form_passwd_id']")
	@CacheLookup
	WebElement Pwd;
	
	@FindBy(xpath =".//input[@class='en btn color2 large pull-right input_submit']")
	@CacheLookup
	WebElement Login;
	
	@FindBy(xpath="//a[text()=' Dashboard ']//following::div[2]")
	WebElement dashboardtitle;
	
	
	public void verifyLoginPage(String uname, String pwd)
	{
		Userid.sendKeys(uname);
		Pwd.sendKeys(pwd);
		Login.click();
	}
	
	public void verifyDashboardTitle()
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(dashboardtitle));
		String text = ele.getText();
		Assert.assertEquals(text, "Account Dashboard View","Dashboard title not verified properly.");
	}
}
