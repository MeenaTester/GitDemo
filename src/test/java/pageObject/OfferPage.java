package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	WebDriver driver;
	private By Search = By.xpath("//input[@id='search-field']");
	
	private By prodName = By.cssSelector("tbody tr td:nth-child(1)");
	public OfferPage(WebDriver driver)
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

}
