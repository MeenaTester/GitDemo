package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.CommonManager;
import pageObject.HomePage;
import utils.commonVariables;

public class CartPageStepDefinition {
	commonVariables commonVariablesRef;
	CommonManager CommonManager;
	HomePage homePage;
	String cartPageProductName;
	pageObject.CartPage CartPage;
	public CartPageStepDefinition(commonVariables commonVariablesRef) {
		this.commonVariablesRef = commonVariablesRef;
		CartPage = commonVariablesRef.CommonManager.getCartPage();
	}
	
	 @Then("^In checkout page selected product is added and user can select apply and promocode$")
	    public void in_checkout_page_selected_product_is_added_and_user_can_select_apply_and_promocode() throws Throwable {
		Thread.sleep(2000);
		commonVariablesRef.CartProductName=CartPage.checkCartPage();
		
	}
	
	@And("^validate selected product in landing page is added correctly in cart page$")
    public void validate_selected_product_in_landing_page_is_added_correctly_in_cart_page() throws Throwable {
		System.out.println(commonVariablesRef.selectedProductName+" cart And executed "+commonVariablesRef.CartProductName);
        Assert.assertEquals(commonVariablesRef.selectedProductName, commonVariablesRef.CartProductName);
        Assert.assertTrue(CartPage.checkApplyBut());
		Assert.assertTrue(CartPage.checkPromoBut());
    }
}
