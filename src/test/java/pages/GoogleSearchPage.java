package pages;



public class GoogleSearchPage extends BasePage {

//    private static String searchButton = "//div[@class='FPdoLc lJ9FBc']/descendant::input[@value='Buscar con Google']";

    private String searchButton = "//div[@class='lJ9FBc']//input[@name='btnK']";
    private String searchTextField = "//textarea[@name='q']";
    private String firstResult = "//*[@id='center_col']/descendant::h3[@class='LC20lb MBeuO DKV0Md'][1]";

    public void navigateToGoogleSearch(){
        navigateTo("https://www.google.com");
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
