package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.GoogleSearchPage;


public class GoogleSteps {

    GoogleSearchPage google = new GoogleSearchPage();
    @Given("^I am on the Google search page$")
    public void navigateToGoogleSearchPage(){
        google.navigateToGoogleSearch();
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        google.enterCriteriaTextInSearchField("Musiquita en spoti");
    }

    @And("^click on the search button$")
    public void clickOnTheSearchButton(){
        google.clickSearchButton();
    }
    @Then("^the results match the criteria$")
    public void resultsMatchTheCriteria(){
        System.out.println(google.firstResult());
        Assertions.assertTrue(google.firstResult().contains("Spotify"));
    }
}
