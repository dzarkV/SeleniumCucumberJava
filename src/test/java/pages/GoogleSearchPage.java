package pages;



public class GoogleSearchPage extends BasePage {

//    private static String searchButton = "//div[@class='FPdoLc lJ9FBc']/descendant::input[@value='Buscar con Google']";
    private static String searchButton = "//div[@class='lJ9FBc']//input[@name='btnK']";
    private static String searchTextField = "//textarea[@name='q']";

    public void navigateToGoogleSearch(){
        navigateTo("https://www.google.com");
    }

    public void enterCriteriaTextInSearchField(String criteria){
        writer(searchTextField, criteria);
    }

    public void clickSearchButton(){
        clickElement(searchButton);
    }
}
