package automation.cucumber.steps;

import static org.junit.Assert.assertTrue;

import automation.cucumber.pages.BasePageObject;
import automation.cucumber.pages.ExpenseReportPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ExpenseReportSteps {

	@Steps
	BasePageObject basePage;
	@Steps
	ExpenseReportPage page;
	
	@Step
	public void createExpenseReportName(String name) {
		page.clickaddexpenseReport();
		page.typeIntoaddExpenseReportName(name);
		page.clickaddexpenseReport();
	}

	@Step
	public void checkExpenseReportStatus(String status) {
		String pageStatus = page.getlineItemStatusMessage();
		assertTrue(pageStatus.equals(status));
	}
	
	@Step
	public void addDetails(String type, 
			String desc, String date, String cost, String receipt) {
		page.typeIntoTypeInput(type);
		page.typeIntoDescInput(date);
		page.typeIntoDateInput(date);
		page.typeIntoCostInput(cost);
		page.clickreceiptButton();
		//to do check receipt functionality
	}

	@Step
	public void checkExpenseReportName(String expenseName) {
		assertTrue(page.getexpenseNameStatus().equals(expenseName));
	}







	@Then("^the expense report will be updated with success$")
	public void the_expense_report_will_be_updated_with_success() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the expense report will be updated with fail$")
	public void the_expense_report_will_be_updated_with_fail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	@Then("^the expense report will be calculated with success$")
	public void the_expense_report_will_be_calculated_with_success() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the expense report will be calculated with fail$")
	public void the_expense_report_will_be_calculated_with_fail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^the employee submits the report\\.$")
	public void the_employee_submits_the_report() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@After
	public void cleanUp() {
		page.clearCache();
	}

	
	
}
