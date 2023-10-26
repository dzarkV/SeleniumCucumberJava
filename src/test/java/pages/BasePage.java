package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pages.SetDriver.driver;


public class BasePage {

    public void navigateTo(String url){
        driver.get(url);
    }

    private WebElement findElement(String locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        findElement(locator).click();
    }

    public void writer(String locator, String textToWrite){
        findElement(locator).clear();
        findElement(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(findElement(locator));
        dropdown.selectByValue(valueToSelect);
    }

//    public static void selectFromDropdownByText(String locator, String valueToSelect){
//        Select dropdown = new Select(findElement(locator));
//        dropdown.selectByVisibleText(valueToSelect);
//    }
//
//    public static void selectFromDropdownByIndex(String locator, int valueToSelect){
//        Select dropdown = new Select(findElement(locator));
//        dropdown.selectByIndex(valueToSelect);
//    }

    public boolean elementIsSelected(String locator){
        return findElement(locator).isSelected();
    }

    public String textFromElement(String locator) {
        return findElement(locator).getText();
    }
}
