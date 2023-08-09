package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HelpDriverClass {
    private static WebDriver driver;
    private static HelpDriverClass help;

    private static Wait<WebDriver> wait;

    public HelpDriverClass(){

    }
    private HelpDriverClass(String browsertype) throws MalformedURLException {
        if(browsertype == "remote") {
            ChromeOptions chromeOpt = new ChromeOptions();
            chromeOpt.setCapability("browserVersion", "114.0");
            chromeOpt.setCapability("platformName", "linux");
            driver = new RemoteWebDriver(new URL("https://selenium-hub.appai.org.br/"), chromeOpt);
        } else if (browsertype == "local"){
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        this.wait = new WebDriverWait(driver, Duration.ofMillis(5000));

    }
    public static void setUpDriver(String browsertype) throws MalformedURLException {
        if(help==null){
            help = new HelpDriverClass(browsertype);
        }
    }
    public static void tearDown() {
        if(driver!=null){
            driver.close();
            driver.quit();
        }
        help = null;
    }

    public static WebDriver getDriver(){
        return driver;
    }


    public static void goToUrl(String url) {
        driver.navigate().to(url);
    }

    public void getWait(WebElement input){
        wait.until(ExpectedConditions.visibilityOf(input));
    }

    public boolean getWaitConteudoVisivel(WebElement input, String texto){
        return wait.until(ExpectedConditions.textToBePresentInElement(input,texto));
    }
}
