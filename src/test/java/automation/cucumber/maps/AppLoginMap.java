package automation.cucumber.maps;

import automation.cucumber.steps.LoginSteps;
import automation.cucumber.steps.TemplateSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AppLoginMap {
	
	@Steps
	TemplateSteps steps;
	@Steps
	LoginSteps loginSteps;

	String baseUrl = "http://api.peachfour.pac.pyramidchallenges.com/api/auth";

	@Given("^I am on the application$")
	public void i_am_on_the_application() throws Throwable {
	  steps.openWebPage(baseUrl);
	}
	
	

	@When("^([^\\\"]*) logs in with ([^\\\"]*)$")
	public void name_logs_in_with_password(String username, String password) throws Throwable {
	  loginSteps.login(username, password);
	}

	@Then("^the application shows the ([^\\\"]*) login status$")
	public void the_application_shows_the_login_status(String status) throws Throwable {
	  loginSteps.loginStatus(status);
	}
	
	@And("browser is refreshed")
	public void refresh() {
		loginSteps.refresh();
	}
	

	







}
