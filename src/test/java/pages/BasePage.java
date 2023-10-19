package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pages.SetDriver.withDriver;


public class BasePage {

    private static WebDriverWait wait;
    public static void navigateTo(String url){
        withDriver().get(url);
    }

    private static WebElement findElement(String locator){
        wait = new WebDriverWait(withDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public static void clickElement(String xpath){
        findElement(xpath).click();
    }

    public void writer(String xpath, String textToWrite){
        findElement(xpath).clear();
        findElement(xpath).sendKeys(textToWrite);
    }
}
