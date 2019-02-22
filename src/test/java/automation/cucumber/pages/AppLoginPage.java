package automation.cucumber.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AppLoginPage extends BasePageObject {
	
	private BasePageObject baseObject = new BasePageObject();
	
	@FindBy(css = "input[name='email']") 
	private WebElementFacade userNameInput;
	@FindBy(css = "input[name='password']") 
	private WebElementFacade passwordInput;
	@FindBy(css = "button[name='submit']") 
	private WebElementFacade loginButton;
	@FindBy(css = "span[class='application-title'") 
	private WebElementFacade applicationTitle;
	@FindBy(xpath = "//*[@id=\"auth0-lock-error-msg-email\"]/div")
	private WebElementFacade usernameErrorMessage;
	@FindBy(xpath = "//*[@id=\"auth0-lock-error-msg-password\"]/div")
	private WebElementFacade passwordErrorMessage;
	private static final String loginSuccessMessage = "success";
	private static final String loginPasswordFailMessage = "Can't be blank";
	private static final String loginUsernameFailMessage = "Can't be blank";
	private static final String loginButtonText = "Login";
	private static final String headerText = "TrAcme";
	
	 @FindBy(xpath
	 ="//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/p[2]/a")
	private WebElementFacade changeUserButton;
	
	
	
	/*
	 * @FindBy(linkText = "Not your account?") private WebElementFacade
	 * changeUserButton;
	 */

	
	//not login page, evaluate login
	@FindBy(xpath = "//*[@id=\"container\"]/div/header/div[2]/span")
	private WebElementFacade applicationHeader;
	
	public String getloginButtonText() {
		return loginButtonText;
	}
	
	public String getheaderText() {
		return headerText;
	}
	
	public void clickChangeAccount() {
		changeUserButton.click();
	}
	
	public String getpasswordErrorMessage() {
		return passwordErrorMessage.getText();
	}
	
	public String getusernameErrorMessage() {
		return usernameErrorMessage.getText();
	}
	
	public String getStatusMessage(String status) {
		if (status.equals("fail")) {
			return loginButton.getText();
		}
		else if(status.equals("success")) {
			//should return the application header correctly
			return applicationHeader.getText();
		}
		else if (status.equals("failPassword")) {
			return passwordErrorMessage.getText();
		}
		else if (status.equals("failUsername")) {
			return usernameErrorMessage.getText();
		}
		else {
			return null;
		}
	}


	public static String getLoginsuccessmessage() {
		return loginSuccessMessage;
	}

	public static String getLoginpasswordfailmessage() {
		return loginPasswordFailMessage;
	}


	public static String getLoginusernamefailmessage() {
		return loginUsernameFailMessage;
	}

	public void typeIntoUserNameInput(String text) {
		userNameInput.type(text);
	}

	
	public void typeIntoPasswordInput(String text) {
		passwordInput.type(text);
	}
	
	public String getApplicationTitle() {
		return applicationTitle.getText();
	}
	

	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void clearCache()  {

		WebDriver driver = baseObject.getDriver();
		/*
		 * System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.addArguments("disable-infobars");	
		 * chromeOptions.addArguments("start-maximized"); driver = new
		 * ChromeDriver(chromeOptions);
		 * driver.get("chrome://settings/clearBrowserData"); Thread.sleep(5000);
		 * driver.switchTo().activeElement();
		 * driver.findElement(By.cssSelector("* /deep/ #clearBrowsingDataConfirm")).
		 * click(); Thread.sleep(5000);
		 */
		//driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		

		
	
}
	



	


}
