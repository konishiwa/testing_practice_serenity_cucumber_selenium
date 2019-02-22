//don't run this
package automation.cucumber;

import org.junit.runner.RunWith;

import automation.base.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/"

)
public class TemplateRunner extends TestBase{
	

}
