package pageObject;

import org.openqa.selenium.WebDriver;

public class CommonManager {
	WebDriver driver;
	public HomePage HomePage;
	public OfferPage OfferPage;
	public CartPage cartPage;
	public CommonManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage getHomePage()
	{
		HomePage = new HomePage(driver);
		return HomePage;
	}
	
	public OfferPage getOfferPagee()
	{
		OfferPage = new OfferPage(driver);
		return OfferPage;
	}
	public CartPage getCartPage()
	{
		cartPage = new CartPage(driver);
		return cartPage;
	}
}
