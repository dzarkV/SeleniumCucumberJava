package stepsDefinitions;

import io.cucumber.java.en.*;
import pages.GoogleSearchPage;

import static pages.GoogleSearchPage.navigateTo;


public class GoogleStepsdefs {

    @Given("^I am on the Google search page$")
    public void navigateToGoogleSearchPage(){
        navigateTo("https://www.google.com");
    };
    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        System.out.println("When");
    };
    @And("^click on the search button$")
    public void clickOnTheSearchButton(){
        System.out.println("And");
    };
    @Then("^the results match the criteria$")
    public void resultsMatchTheCriteria(){
        System.out.println("Then");
    };
}
