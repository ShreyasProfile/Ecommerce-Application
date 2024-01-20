package org.stepDefinitions;

import org.junit.Assert;
import org.pages.LoginPage;
import org.qafactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	private LoginPage lpobj=new LoginPage(DriverFactory.getDriver());
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	   
	}

	@When("User enters E-Mail address")
	public void user_enters_e_mail_address() {
	    lpobj.EnterEmailaddress();
	}

	@When("User enters password")
	public void user_enters_password() {
		lpobj.Enterpasswordfield();
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		lpobj.ClickOnLoginBtn();
	}

	@Then("User is Login successfully")
	public void user_is_Login_successfully() {
		Assert.assertTrue(lpobj.AccPageIsDisplay());
	}
	@When("User enters Username {string}")
	public void user_enters_Username(String string) {
	    lpobj.LoginAddress(string);
	}
	@When("User enters Password {string}")
	public void user_enters_Password(String string) {
	    lpobj.LoginAddress(string);
	}
	@Then("User should see an error message indicating Warning: No match for E-Mail Address and\\/or Password")
	public void user_should_see_an_error_message_indicating_warning_no_match_for_e_mail_address_and_or_password() {
		lpobj.errorMsgIsDisplay();
	}

	@When("User clicks on {string} link")
	public void user_clicks_on_link(String string) {
		Assert.assertTrue(lpobj.forgottLinkIsDisplay());
		lpobj.ClickOnforgottLink();
	}

	@Then("User will redirected to forgot password page")
	public void user_will_redirected_to_forgot_password_page() {
		Assert.assertTrue(lpobj.forgettPageIsDisplay());
	}


}
