package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	private By Search = By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	private By prodName = By.xpath("//h4[@class='product-name']");
	private By TopDeals = By.xpath("//div[@class='cart']//child::a[2]");
	private By incrementBut = By.xpath("//a[@class='increment']");
	private By AddToCartBut = By.xpath("//button[normalize-space()='ADD TO CART']");
	private By CartImage = By.xpath("//img[@alt='Cart']");
	private By ProceedToCart = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public void searchText(String name)
	{
		driver.findElement(Search).sendKeys(name);
	}
	
	public String getText()
	{
		String name = driver.findElement(prodName).getText();
		return name;
	}
	public void clickButton()
	{
		driver.findElement(TopDeals).click();
		
	}
	
	public void clickIncrementButton(int quantity)
	{
		int i = quantity-1;
		while(i>0)
		{
		driver.findElement(incrementBut).click();
		i--;
		}
		
	}
	public void clickAddToCartButton() throws InterruptedException
	{
		driver.findElement(AddToCartBut).click();
		Thread.sleep(2000);
		driver.findElement(CartImage).click();
		Thread.sleep(2000);
		driver.findElement(ProceedToCart).click();
	}

}
