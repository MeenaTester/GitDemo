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
import pageObject.HomePage;
import pageObject.OfferPage;
import utils.commonVariables;


public class OfferPageStepDefinition {
	commonVariables commonVariablesRef;
    String offerPageProductName;
    OfferPage offerPage;
   
    public OfferPageStepDefinition(commonVariables commonVariablesRef) {
    	this.commonVariablesRef = commonVariablesRef;
		offerPage = commonVariablesRef.CommonManager.getOfferPagee();
	}

	@Then("^User search for same shortname in offer page to check if product exist$")
	public void user_search_for_same_shortname_in_offer_page_to_check_if_product_exist() throws Throwable {
		commonVariablesRef.CommonManager.HomePage.clickButton();
		commonVariablesRef.GenericUt.switchWindows();
		offerPage.searchText(commonVariablesRef.ProductName);
		offerPageProductName = offerPage.getText();
	}
	
	@And("^validate product name in offer page matches with landing page$")
    public void validate_product_name_in_offer_page_matches_with_landing_page() throws Throwable {
		System.out.println(commonVariablesRef.landingPageProductName+" And executed "+offerPageProductName);
        Assert.assertEquals(commonVariablesRef.landingPageProductName, offerPageProductName);
    }

}
