package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.CommonManager;
import pageObject.HomePage;
import utils.commonVariables;

public class HomePageStepDefinition {
	commonVariables commonVariablesRef;
	CommonManager CommonManager;
	HomePage homePage;
	public HomePageStepDefinition(commonVariables commonVariablesRef) {
		this.commonVariablesRef = commonVariablesRef;
	}

	@Given("^User is on Greencart landing page$")
	public void user_is_on_greencart_landing_page() throws Throwable {
		this.commonVariablesRef.callCommonManager();
		homePage = commonVariablesRef.CommonManager.getHomePage();
	 }

	@When("^User search with shortname (.+) and actual name of product should be extracted$")
	public void user_search_with_shortname_something_and_actual_name_of_product_should_be_extracted(String shortName)
			throws InterruptedException {
		homePage.searchText(shortName);
		Thread.sleep(4000);
		commonVariablesRef.landingPageProductName = homePage.getText().split(" -")[0];
		commonVariablesRef.ProductName = shortName;
	}
	
	@When("^User search prouct (.+)$")
    public void user_search_prouct(String name) throws Throwable {
		homePage.searchText(name);
		Thread.sleep(4000);
    }
   
	@And("^Added \"([^\"]*)\" items of selected product to cart$")
    public void added_something_items_of_selected_product_to_cart(String strArg1) throws Throwable {
		homePage.clickIncrementButton(Integer.parseInt(strArg1));
		commonVariablesRef.selectedProductName = homePage.getText();
		System.out.println("commonVariablesRef.selectedProductName "+commonVariablesRef.selectedProductName);
		Thread.sleep(2000);
		homePage.clickAddToCartButton();
		
    }
	
	
	

}
