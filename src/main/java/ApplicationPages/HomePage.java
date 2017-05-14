package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{

	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath="(.//span[text()='Home'])[1]")
	@CacheLookup
	WebElement Home;
	
	@FindBy(xpath = ".//span[text()='My Account']")
	WebElement My_Account;

	@FindBy(xpath= ".//span[text()='My Cart']")
	WebElement My_Cart;
	
	@FindBy(xpath=".//span[text()='Wishlist']")
	WebElement Wishlist;

	@FindBy(xpath=".//span[text()=' Log In']")
	WebElement Login;

	public void clickHome()
	{
		Home.click();
	}
	
	public void clickMyAcount()
	{
		My_Account.click();	
	}

	public void clickMyCart()
	{
		My_Cart.click();	
	}

	public void clickWishlist()
	{
		Wishlist.click();
	}
	
	public void clickLogin()
	{
		Login.click();
	}
	
	public String getApplicationTitle()
	{
		String name = driver.getTitle();
		return name;
	}
	
}
