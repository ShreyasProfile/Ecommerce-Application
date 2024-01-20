package org.stepDefinitions;

import org.pages.LoginPage;
import org.pages.WishListPage;
import org.qafactory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListStepDef {
	private WishListPage wlobj =new WishListPage(DriverFactory.getDriver());
	LoginPage lpobj=new LoginPage(DriverFactory.getDriver());
	@When("the user selects a product from the search results")
	public void the_user_selects_a_product_from_the_search_results() {
		wlobj.WishListBtnOfProductIsDisplay();
		
	}
	@When("the user clicks on {string} button")
	public void the_user_clicks_on_button(String string) {
		wlobj.ScrollForProductDisplay();
		wlobj.ClickOnWishListBtnOfProduct();
	}

	@Then("the product should not added to the wishlist")
	public void the_product_should_not_added_to_the_wishlist() {
		wlobj.ProductCountIsDisplay(); //Bug
	}

	@Then("the user should see a error msg {string}")
	public void the_user_should_see_a_error_msg(String string) {
		wlobj.ErrorMsgIsDisplay();
	}
	@Then("Account page is displayed")
	public void Account_page_is_displayed() {
		lpobj.AccPageIsDisplay();
	}
	@Then("the user clicks on homeicon user should be redirected to homepage")
	public void the_user_clicks_on_homeicon_user_should_be_redirected_to_homepage() {
		lpobj.HomePageIconOnAccPage();
	}

	@Then("the product should be added to the wishlist")
	public void the_product_should_be_added_to_the_wishlist() {
		wlobj.ProductCountIsDisplay();
	}

	@Then("the user should see a success msg {string}")
	public void the_user_should_see_a_success_msg(String string) {
		wlobj.SuccessMsgIsDisplay();
	}

	@When("the user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
		wlobj.ClicksOnWishListLink();
	}

	@Then("the user should be redirected to the wishlist page")
	public void the_user_should_be_redirected_to_the_wishlist_page() {
	    wlobj.WishListPageIsDisplay();
	}

	@Then("the user should see the added product in the wishlist")
	public void the_user_should_see_the_added_product_in_the_wishlist() {
		 wlobj.ProductShowsOnWishListPage();
	}

}
