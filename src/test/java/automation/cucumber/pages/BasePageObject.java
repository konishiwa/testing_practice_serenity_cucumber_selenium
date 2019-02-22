package automation.cucumber.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BasePageObject extends PageObject {

	public void openCacheDisabled() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability("applicationCacheEnabled", false);
        WebDriver driver = new ChromeDriver(cap);
        super.setDriver(driver);
	}

}
