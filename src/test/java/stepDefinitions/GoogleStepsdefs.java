package stepDefinitions;

import io.cucumber.java.en.*;
import pages.GoogleSearchPage;


public class GoogleStepsdefs {

    GoogleSearchPage google = new GoogleSearchPage();
    @Given("^I am on the Google search page$")
    public void navigateToGoogleSearchPage(){
        google.navigateToGoogleSearch();
    };
    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        google.enterCriteriaTextInSearchField("Messi campeao do mundo");
    };
    @And("^click on the search button$")
    public void clickOnTheSearchButton(){
        google.clickSearchButton();
    };
    @Then("^the results match the criteria$")
    public void resultsMatchTheCriteria(){
        System.out.println("Then");
    };
}
