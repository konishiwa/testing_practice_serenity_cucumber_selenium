package automation.cucumber.steps;

import org.openqa.selenium.WebDriver;

import automation.cucumber.pages.BasePageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class TemplateSteps {
	
	@Steps
	BasePageObject page;
	

	
	@Step
	public void openWebPage(String baseUrl) {
		//page.openCacheDisabled();
		page.openAt(baseUrl);
	}

}
