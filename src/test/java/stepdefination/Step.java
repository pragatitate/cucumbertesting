package stepdefination;

import com.nopCom.pageObject.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step extends Base {

	@Given("user launch chrome Browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
		
	}

	@When("user openurl {string}")
	public void user_openurl(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter email as\"admin@yourstore.com\" and password as {string}")
	public void user_enter_email_as_admin_yourstore_com_and_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
