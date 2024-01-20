package org.stepDefinitions;

import org.hooks.AppHooks;
import org.pages.RegistrationPage;
import org.qafactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPageStepDef {
	RegistrationPage rp = new RegistrationPage(DriverFactory.getDriver());
	@Given("the User is on Register Page")
	public void the_user_is_on_register_page() {
	   rp.RegisterPageDisplay();
	   AppHooks.scn.log("User is on Register Page");
	}

	@When("User enters FirstName {string}")
	public void user_enters_first_name(String string) {
	    rp.EnterFName(string);
	}

	@When("User enters LastName {string}")
	public void user_enters_last_name(String string) {
	    rp.EnterLName(string);
	}

	@When("User enters E-mailId {string}")
	public void user_enters_e_mail_id(String string) {
	  rp.EnterEmail(string);
	}

	@When("User enters TelephoneNo {string}")
	public void user_enters_telephone_no(String string) {
	    rp.EnterTphone(string);
	}

	@When("User enters newPassword {string}")
	public void user_enters_new_password(String string) {
	    rp.EnterPwd(string);
	}

	@When("User ReEnterPassword {string}")
	public void user_re_enter_password(String string) {
	   rp.reEnterPwd(string);
	}

	@When("Clicks on Subscribe\"Yes\"")
	public void clicks_on_subscribe_yes() {
	   rp.ClickonSubscribeYBtn();
	}

	@When("User ticks the Privacy Policy")
	public void user_ticks_the_privacy_policy() {
	    rp.ClickPpolicybox();
	}

	@When("Click on continue button")
	public void click_on_continue_button() {
	    rp.ClicksOnContinueBtn();
	}

	@Then("the message {string} is displayed")
	public void the_message_is_displayed(String string) {
	   rp.SuccessMsgIsDisplay();
	}
	    

}
