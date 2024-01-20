package org.stepDefinitions;

import org.hooks.AppHooks;
import org.junit.Assert;
import org.pages.HomePage;
import org.qafactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
  //private ConfigReader cr= new ConfigReader();
	private HomePage hp=new HomePage(org.qafactory.DriverFactory.getDriver());
  //private WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	org.qafactory.DriverFactory.getDriver().get(AppHooks.prop.getProperty("Url"));
	Assert.assertEquals(DriverFactory.getDriver().getCurrentUrl(),AppHooks.prop.getProperty("Url"));	
	}

	@Then("App Logo is displayed")
	public void app_logo_is_displayed() {
	    Assert.assertTrue(hp.AppLogoIsDisplay());
	    AppHooks.scn.log("Application Logo as per reuirement");
	}

	@Then("Search box is displayed")
	public void search_box_is_displayed() {
		Assert.assertTrue(hp.SearchBarIsDisplay());
		AppHooks.scn.log("Search box is display");
	}

	@Then("Product catagories bar is displayed")
	public void product_catagories_bar_is_displayed() {
		Assert.assertTrue(hp.catagoriesBarIsDisplay());
		AppHooks.scn.log("Product catagories bar is display");
	}

	@Then("Currency btn is displayed")
	public void currency_btn_is_displayed() {
		Assert.assertTrue(hp.CurrenyIsDisplay());
		AppHooks.scn.log("Currency btn is display at the top of Left side od page ");
	}

	@Then("Helpline No is displayed")
	public void helpline_no_is_displayed() {
		Assert.assertTrue(hp.contactNoIsDisplay());
		AppHooks.scn.log("Helpline No is display");
	}
	@Then("MyAccount field is displayed")
	public void my_account_field_is_displayed() {
		Assert.assertTrue(hp.myAccountIsDisplay());
		AppHooks.scn.log("MyAccount field is display");
	}
	@Then("WishList field with quantity is displayed")
	public void wish_list_field_with_quantity_is_displayed() {
		Assert.assertTrue(hp.WishListIsDisplay());
		AppHooks.scn.log("WishList field with quantity is display");
	}
	@Then("ShoppingCart field is displayed")
	public void shopping_cart_field_is_displayed() {
		Assert.assertTrue(hp.ShoppingCartIsDisplay());
		AppHooks.scn.log("ShoppingCart field with cart icon is display");
	}
	@Then("Checkout field is displayed")
	public void checkout_field_is_displayed() {
		Assert.assertTrue(hp.CheckoutIsDisplay());
		AppHooks.scn.log("Checkout field is display");
	}
	@When("User clicks on MyAccount dropdown will be open")
	public void user_clicks_on_my_account_dropdown_will_be_open() {
	    hp.ClicksOnMyAccount();
	   
	}
	@When("User clicks on register")
	public void user_clicks_on_register() {
	    hp.ClicksOnRegisterBtn();
	    
	}
	@Then("Register page is displayed")
	public void register_page_is_displayed() {
	    Assert.assertTrue(hp.RegisterpageIsDisplay());
	    AppHooks.scn.log("Register page is display");
	}
	@When("User clicks on Login")
	public void user_clicks_on_login() {
	    hp.ClicksOnLoginBtn();
	}
	@Then("Login page is displayed")
	public void login_page_is_displayed() {
	    Assert.assertTrue(hp.LoginpageIsDisplay());
	    AppHooks.scn.log("Login page is display");
	    
	}
}
