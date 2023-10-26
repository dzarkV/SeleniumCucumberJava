package pages;



public class GoogleSearchPage extends BasePage {


    private final String searchTextField = "//textarea[@name='q']";

    private final String searchButton = "//div[@class='lJ9FBc']//input[@name='btnK']";

    private final String firstResult = "//*[@id='search']/descendant::a/child::h3[1]";

    public void navigateToGoogleSearch(String url){
        navigateTo(url);
    }

    public void enterCriteriaTextInSearchField(String criteria){
        writer(searchTextField, criteria);
    }

    public void clickSearchButton(){
        clickElement(searchButton);
    }

    public String firstResult(){
        return textFromElement(firstResult);
    }
}
