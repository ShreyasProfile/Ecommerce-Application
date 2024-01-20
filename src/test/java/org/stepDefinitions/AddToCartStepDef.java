package org.stepDefinitions;

import org.hooks.AppHooks;
import org.pages.AddToCartPage;
import org.qafactory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDef {
	private AddToCartPage atcobj= new AddToCartPage(DriverFactory.getDriver());
	@When("the user clicks on the {string} button for a product")
	public void the_user_clicks_on_the_button_for_a_product(String string) {
		atcobj.ClickOnAddToCartBtnOfProduct();
	}

	@Then("the product should be added to the cart")
	public void the_product_should_be_added_to_the_cart() {
	  //System.out.println("Then the product is added");
	}

	@Then("the user should see a msg {string}")
	public void the_user_should_see_a_msg(String string) {
		atcobj.AddToCartSuccessMsgIsDisplay();
	}

	@Then("the home page cartbutton should display the quantity of items and total amount of all items")
	public void the_cart_link_should_display_the_quantity_of_items_and_total_amount_of_all_items() {
		atcobj.CartBtnblockIsDisplay();
	}

	@When("the use clicks on Shopping cartLink")
	public void the_use_clicks_on_shopping_cartlink() {
		atcobj.ClicksOnShoppingCartLink();
	}

	@Then("the user should be redirected to the Shopping Cart page")
	public void the_user_should_be_redirected_to_the_shopping_cart_page() {
		atcobj.ShoppingCartPageisDisplay();
	}

	@Then("the user should see the added product with image, quantity, unit price, total price")
	public void the_user_should_see_the_added_product_with_image_quantity_unitprice_totalprice() {
		atcobj.ShoppingCartProductDetailsDisplay();
	}
	@Then("User Clicks on Logout fields for logout")
	public void user_clicks_on_logout_fields_for_logout() {
	    atcobj.ClicksonLogoutbtn();
	}
	@Then("User go to Cart page")
	public void user_go_to_cart_page() {
	    atcobj.ClicksonCartBtnLink();
	}

	@When("User click on the {string} button for item")
	public void user_click_on_the_button_for_item(String string) {
	        atcobj.ClicksonDeleteBtn();
	}
	@Then("the item should be removed from my cart")
	public void the_item_should_be_removed_from_my_cart() {
	  AppHooks.scn.log("Item is not removed from cart");
	}
}	
