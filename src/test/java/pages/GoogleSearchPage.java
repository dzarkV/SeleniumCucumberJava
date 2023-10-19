package pages;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearchPage {

    protected static WebDriver driver;

    @BeforeAll
    public static void setupDriver(){
        ChromeOptions options =  new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); // fix to "org.openqa.selenium.remote.http.ConnectionFailedException: Unable to establish websocket connection" error
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @AfterAll
    public static void closeBrowser(){
        driver.quit();
    }

    public static void navigateTo(String url){
        driver.get(url);
    }
}
