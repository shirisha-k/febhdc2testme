package CucumberDemos;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddToCartDef {
	@Given("Application launched by registered user for cart")
	public void application_launched_by_registered_user_for_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for registered user for cart");
	}

	@Then("User verifying add item")
	public void user_verifying_add_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for verifying add item");
	}

	@Then("User verifying remove item")
	public void user_verifying_remove_item() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("code for remove item");
	}

	@Given("User verifies the max count of items in cart")
	public void user_verifies_the_max_count_of_items_in_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for max count of items");
	}


}
