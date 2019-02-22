package automation.cucumber.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ExpenseReportPage extends BasePageObject {
	
	@FindBy(css = "") 
	private WebElementFacade addMoreLineItemButton;
	@FindBy(css = "") 
	private WebElementFacade addLineItemButton;
	@FindBy(css = "") 
	private WebElementFacade submitButton;
	@FindBy(css = "") 
	private WebElementFacade expenseReportName;
	@FindBy(xpath = "//*[@id=\"container\"]/div/main/div/div/button") 
	private WebElementFacade addexpenseReport;
	//line item attributes:
	@FindBy(xpath = "//*[@id=\"data-table-modal\"]/div/div/div[2]/div/div[2]/div[1]/div/div") 
	private WebElementFacade typeInput;
	@FindBy(css = "//*[@id=\"data-table-modal\"]/div/div/div[2]/div/div[2]/div[2]/div/div/input") 
	private WebElementFacade descInput;
	@FindBy(css = "") 
	private WebElementFacade expenseReportNameInput;
	@FindBy(css = "") 
	private WebElementFacade dateInput;
	@FindBy(css = "") 
	private WebElementFacade costInput;
	@FindBy(css = "") 
	private WebElementFacade receiptButton;
	@FindBy(css = "") 
	private WebElementFacade receiptAttachmentButton;
	@FindBy(css = "") 
	private WebElementFacade expenseTotal;
	@FindBy(id = "statusMessage") 
	private WebElementFacade submitStatusMessage;
	@FindBy(id = "statusMessage") 
	private WebElementFacade lineItemStatusMessage;
	@FindBy(id = "expenseName") 
	private WebElementFacade expenseNameStatus;
	
	//submit status message
	private static final String expenseSuccessMessage = "success";
	private static final String expenseFailMessage = "fail";
	private static final String lineSuccessMessage = "success";
	private static final String lineFailMessage = "fail";
	
	public String getexpenseNameStatus() {
		return expenseNameStatus.getText();
	}
	
	public String getlineItemStatusMessage() {
		return lineItemStatusMessage.getText();
	}

	
	public void typeIntoaddExpenseReportName(String text) {
		expenseReportNameInput.type(text);
	}
	
	public void typeIntoTypeInput(String text) {
		typeInput.type(text);
	}
	
	public void typeIntoDescInput(String text) {
		descInput.type(text);
	}
	
	public void typeIntoDateInput(String text) {
		dateInput.type(text);
	}
	
	public void typeIntoCostInput(String text) {
		dateInput.type(text);
	}
	
	public void clickaddMoreLineItemButton() {
		addMoreLineItemButton.click();
	}
	
	
	public void clickaddLineItemButton() {
		addLineItemButton.click();
	}
	
	public void clicksubmitButton() {
		submitButton.click();
	}

	public void clickreceiptButton() {
		receiptButton.click();
	}

	public void clickexpenseReportName() {
		
	}

	public void clickaddexpenseReport() {
		addexpenseReport.click();
	}

	public void clearCache()  {

			WebDriver driver = super.getDriver();
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
