package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class TestSandboxSteps {
    @Given("I navigate to the sandbox page")
    public void iNavigateToTheSandboxPage() {
        System.out.println("Given sandbox");
    }
    @And("select a value from the dropdown")
    public void selectAValueFromTheDropdown() {
        System.out.println("And sandbox");
    }
}
