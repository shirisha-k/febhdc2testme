package CucumberDemos;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumberdemo1 {


	@Given("TESTME app is launched")
	public void testme_app_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for testme_app_is_launched");
	}

	@Given("user accessing registartion link in TESTME app")
	public void user_accessing_registartion_link_in_TESTME_app() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for registartion link");
	}

	@When("user providing valid data for all the required fields")
	public void user_providing_valid_data_for_all_the_required_fields() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for required fields");
	}

	@Then("user verifying registration status")
	public void user_verifying_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for registration status");
	}

	@Given("TESTME is launched and accessible")
	public void testme_is_launched_and_accessible() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for launched_and_accessible");
	}

	@Then("user click on the login link is available in homepage")
	public void user_click_on_the_login_link_is_available_in_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for available_in_homepage");
	}

	@Then("provides the valid credentials")
	public void provides_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for the_valid_credentials");
	}

	@Then("user checks the login status")
	public void user_checks_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for the_login_status");
	}


}
