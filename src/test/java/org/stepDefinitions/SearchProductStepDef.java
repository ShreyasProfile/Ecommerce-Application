package org.stepDefinitions;

import org.junit.Assert;
import org.pages.SearchPage;
import org.qafactory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProductStepDef {
    private	SearchPage spobj = new SearchPage(DriverFactory.getDriver());
	@When("the User enter {string} in the search bar")
	public void the_user_enter_in_the_search_bar(String string) {
		Assert.assertTrue(spobj.SearchBarIsDisplay());
		spobj.SearchBar(string);
	}

	@When("click the search button")
	public void click_the_search_button() {
		spobj.ClickonSearchBtn();
	}

	@Then("{string} should be display in the results")
	public void should_be_display_in_the_results(String string) {
		Assert.assertTrue(spobj.ProductIsDisplay());
	}

	@Then("the user should see a message {string}")
	public void the_user_should_see_a_message(String string) {
		Assert.assertTrue(spobj.ProducterrorMsgIsDisplay());
	}

}
