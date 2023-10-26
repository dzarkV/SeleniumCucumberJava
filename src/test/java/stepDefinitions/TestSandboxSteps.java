package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.TestSandboxPage;

public class TestSandboxSteps {

    TestSandboxPage sandboxPage = new TestSandboxPage();
    @Given("^I navigate to the sandbox page$")
    public void iNavigateToTheSandboxPage() {
        sandboxPage.navigateToSandbox("https://the-internet.herokuapp.com/dropdown");
    }
    @And("^select a option from the dropdown$")
    public void selectAValueFromTheDropdown() {
        sandboxPage.selectCategory("2");
    }

    @Then("^the option is selected$")
    public void theValueIsSelected() {
        Assertions.assertTrue(sandboxPage.categoryStatus("2"));
    }
}
