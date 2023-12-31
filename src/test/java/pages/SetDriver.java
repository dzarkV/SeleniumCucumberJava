package pages;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SetDriver {

    protected static WebDriver driver;

    @BeforeAll
    public static void setupDriver(){
        ChromeOptions options =  new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); // fix to "org.openqa.selenium.remote.http.ConnectionFailedException: Unable to establish websocket connection" error
        options.addArguments("start-maximized");
        options.addArguments("--incognito");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }

    @AfterAll
    public static void closeBrowser(){
        driver.quit();
    }

}
