package automation.cucumber.steps;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import automation.cucumber.pages.AppLoginPage;
import automation.cucumber.pages.BasePageObject;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;

public class LoginSteps {
	
	@Steps
	BasePageObject basePage;
	@Steps
	AppLoginPage page = new AppLoginPage();
	
	 @Managed(driver="chrome", uniqueSession = true)                              
	 WebDriver driver;
	 
	/*
	 * @Before public void setup() { ChromeOptions options = new ChromeOptions();
	 * options.addArguments("--incognito"); WebDriver driver = new
	 * ChromeDriver("chrome-driver.exe",options); }
	 */
	
	//application login
	@Step
	public void login(String username, String password) {
		username = username + "@psi-it.com";
		if (username.equals("..")) {
			username = "";
		}
		if (password.equals("..")) {
			password = "";
		}
		try {
		    page.typeIntoUserNameInput(username);
		    page.typeIntoPasswordInput(password);
		    page.clickLogin();
		} catch (ElementShouldBeEnabledException e) {
			page.clickChangeAccount();
		    page.typeIntoUserNameInput(username);
		    page.typeIntoPasswordInput(password);
		    page.clickLogin();
		}
	}
	
	//Checks login status
	@Step
	public void loginStatus(String status) throws InterruptedException {
		if (status.equals("fail")) {
			//should be able to click login button still
			assertTrue(page.getStatusMessage(status).equals(page.getloginButtonText()));
			
		}
		else if(status.equals("success")) {
			assertTrue(page.getStatusMessage(status).equals(page.getheaderText()));
		}
		else if (status.equals("failPassword")) {
			assertTrue(page.getLoginpasswordfailmessage().equals(page.getStatusMessage(status)));
		}
		else if (status.equals("failUsername")) {
			assertTrue(page.getLoginusernamefailmessage().equals(page.getStatusMessage(status)));
		}
		else if (status.equals("failUsernameAndfailPassword" )) {
			assertTrue(page.getLoginpasswordfailmessage().equals(page.getStatusMessage(status)));
			assertTrue(page.getLoginusernamefailmessage().equals(page.getStatusMessage(status)));
		}
		else {
			fail();
		}
	}
	
	public void refresh() {
		WebDriver driver = page.getDriver();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		driver.manage().deleteAllCookies();

	}
	
	

	
}
	
