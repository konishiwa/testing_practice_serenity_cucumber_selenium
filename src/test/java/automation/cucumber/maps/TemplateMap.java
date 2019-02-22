package automation.cucumber.maps;
import cucumber.api.java.en.Given;
import groovy.json.JsonBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;


import automation.cucumber.steps.TemplateSteps;
import automation.model.TemplateModel;
import cucumber.api.java.en.And;


public class TemplateMap {
	
	@Steps
	TemplateSteps steps;
	String baseUrl = "https://www.google.com";
	
	//Use TidyGherkin chrome app on the cucumber feature file to easily generate the step file (settings -> camelCase)

    @Given("^i open the webpage$")
    public void iOpenTheWebpage() throws Throwable {
    	steps.openWebPage(baseUrl);
    }
	
    @Given("^i perform a GET API call$")
    public void iPerformAGETAPICall() throws Throwable {
        SerenityRest.rest()
        .given()
        .when()
        .get("/list")
        .then()
        .statusCode(200);
    }
    
    @Given("^i perform a POST API call$")
    public void iPerformAPOSTAPICall() throws Throwable {
		/*
		 * TemplateModel model = new TemplateModel(123,"test"); RequestSpecification
		 * request = RestAssured.given();
		 * 
		 * JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
		 * jsonBuilder.add("id", model.getId()); jsonBuilder.add("name",
		 * model.getName());
		 * 
		 * request.body(jsonBuilder.build().toString()); Response response =
		 * request.post(baseUrl);
		 * 
		 * System.out.println(response.body().asString());
		 */
    }

    @Given("^i perform an API call with parameters (.+) and (.+)$")
    public void iPerformAnAPICallWithParametersAnd(String variable1, String variable2) throws Throwable {
		/*
		 * Response response = SerenityRest.rest() .given() .when()
		 * .get("/"+variable1+"/"+variable2); System.out.println("***********");
		 * assertThat(response.getStatusCode())
		 * .overridingErrorMessage("You can give a custom error message in the report here"
		 * ) .isEqualTo(404);
		 */
    }

}
