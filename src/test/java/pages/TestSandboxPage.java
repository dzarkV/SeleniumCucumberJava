package pages;

public class TestSandboxPage extends BasePage {

    private final String dropdownElement = "//select[@id='dropdown']";
    private final String optionSelected = "//select[@id='dropdown']/child::option[@value='?']";
    public void navigateToSandbox(String url) {
        navigateTo(url);
    }

    public void selectCategory(String category) {
        selectFromDropdownByValue(dropdownElement, category);
    }

    public boolean categoryStatus(String categorySelected){
        return elementIsSelected(optionSelected.replace("?", categorySelected));
    }
}
