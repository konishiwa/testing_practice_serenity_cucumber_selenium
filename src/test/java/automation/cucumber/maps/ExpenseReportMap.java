package automation.cucumber.maps;

import automation.cucumber.steps.ExpenseReportSteps;
import automation.cucumber.steps.TemplateSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ExpenseReportMap {

	@Steps
	TemplateSteps steps;
	@Steps
	ExpenseReportSteps expenseReportSteps;
	
	@When("^the employee creates a new expense report with ([^\\\"]*)$")
	public void the_employee_creates_a_new_expense_report_with(String name) {
		expenseReportSteps.createExpenseReportName(name);
	}

	@Then("^expense report is made with ([^\\\"]*)$")
	public void expense_report_is_made_with_validName(String expenseName) throws Throwable {
		expenseReportSteps.checkExpenseReportStatus(expenseName);
	}


	@When("^the employee adds expense details for ([^\\\"]*), ([^\\\"]*), "
			+ "([^\\\"]*), ([^\\\"]*), and ([^\\\"]*)$")
	public void the_employee_adds_expense_details_for_and(String type, 
			String desc, String date, String cost, String receipt) throws Throwable {
		expenseReportSteps.addDetails(type, desc, date, cost, receipt);
	    
	}

	/*
	 * @Then("^the expense report will be updated with ([^\\\"]*)$") public void
	 * the_expense_report_will_be_updated_with_success(String status) throws
	 * Throwable { expenseReportSteps.checkExpenseReportName(status); }
	 */
	
	@Then("^the expense report will be submitted with ([^\\\"]*)$")
	public void the_expense_report_will_be_submitted_with_success(String status) throws Throwable {
	    //expenseReportSteps.checkExpenseReportName();
	}

}
