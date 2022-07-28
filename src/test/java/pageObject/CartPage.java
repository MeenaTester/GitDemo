package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	public WebDriver driver;
	private By AddedProdName = By.xpath("//tbody//tr//td[2]/p");
	private By ApplyBut = By.xpath("//button[@class='promoBtn']");
	private By PromoBut = By.xpath("//button[normalize-space()='Place Order']");
	
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public String checkCartPage()
	{
		System.out.println("cart page "+this.driver.findElement(AddedProdName).getText());
		return this.driver.findElement(AddedProdName).getText();
	}
	public boolean checkApplyBut()
	{
		return this.driver.findElement(ApplyBut).isDisplayed();
	}
	public boolean checkPromoBut()
	{
		return this.driver.findElement(PromoBut).isDisplayed();
	}

}
