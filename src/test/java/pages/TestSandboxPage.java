package pages;

public class TestSandboxPage extends BasePage {

    private static String dropdownElement = "//select[@id='dropdown']";
    public void navigateToSandbox() {
        navigateTo("https://the-internet.herokuapp.com/dropdown");
    }

    public void selectCategory(String category) {
        selectFromDropdownByValue(dropdownElement, category);
    }
}
